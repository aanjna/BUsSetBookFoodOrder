package com.book.bus.busbooking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class PickupFood extends AppCompatActivity implements View.OnClickListener{
    TextView pizzaCount;
    ImageButton pizzaMinus;
    ImageButton pizzaAdd;
    RecyclerView rv_fooditem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickup_food);
        rv_fooditem = (RecyclerView) findViewById(R.id.rv_routflow);
        List<FoodIteam> al = new ArrayList<FoodIteam>();
        rv_fooditem.setHasFixedSize(true);
        rv_fooditem.setItemAnimator(new DefaultItemAnimator());
        ArrayList<FoodIteamModel> foodIteams = new ArrayList<>();
        // for(int i=0; i<10; i++){
        foodIteams.add(new FoodIteamModel("Pizza", "108 rs each", 0));
        foodIteams.add(new FoodIteamModel("Bread", "25 rs each", 0));
        foodIteams.add(new FoodIteamModel("Salad", "30 rs each", 0));
        foodIteams.add(new FoodIteamModel("Burger", "20 rs each", 0));
        foodIteams.add(new FoodIteamModel("Coke", "20 rs each", 0));
        foodIteams.add(new FoodIteamModel("Frute", "90 rs each", 0));
        FListAdapter fListAdapter = new FListAdapter(this, foodIteams);

        rv_fooditem.setAdapter(fListAdapter);
        rv_fooditem.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void onClick(View v) {
        if (v == pizzaAdd) {
            if (pizzaCount.getText().toString().equals("Add item")) {
                pizzaMinus.setVisibility(View.VISIBLE);
                pizzaCount.setText("1");
            }
            else {
                String text = pizzaCount.getText().toString();
                int count = Integer.parseInt(text);
                count++;
                pizzaCount.setText(count+"");
            }
        }
        if (v == pizzaMinus) {
            if (pizzaCount.getText().toString().equals("1")) {
                pizzaMinus.setVisibility(View.INVISIBLE);
                pizzaCount.setText("1");
            }
            else {
                String text = pizzaCount.getText().toString();
                int count = Integer.parseInt(text);
                count--;
                pizzaCount.setText(count+"");
            }
        }
    }
}
