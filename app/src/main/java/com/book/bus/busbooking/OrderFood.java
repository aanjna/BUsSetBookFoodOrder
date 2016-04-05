package com.book.bus.busbooking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class OrderFood extends AppCompatActivity {
    RecyclerView rv_routflow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_food);

        rv_routflow = (RecyclerView) findViewById(R.id.rv_routflow);
        List<RoutflowModel> al = new ArrayList<RoutflowModel>();
        rv_routflow.setHasFixedSize(true);
        rv_routflow.setItemAnimator(new DefaultItemAnimator());

        RoutflowAdaptor routflowAdaptor = new RoutflowAdaptor((ArrayList<RoutflowModel>) al);

        rv_routflow.setAdapter(routflowAdaptor);
        rv_routflow.setLayoutManager(new LinearLayoutManager(this));

        for (int i = 0; i < 8; i++) {
            al.add(new RoutflowModel("04:30", "Ambrose", "4C"));
        }
    }
}
