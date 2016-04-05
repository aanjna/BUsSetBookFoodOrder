package com.book.bus.busbooking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OrderTikitActivity extends AppCompatActivity implements View.OnClickListener {
    TextView orderid, bustop, stationadd;
    Button order_food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_tikit);

        orderid = (TextView) findViewById(R.id.tv_tikit);
        bustop = (TextView) findViewById(R.id.tv_tikit);
        stationadd = (TextView) findViewById(R.id.tv_tikit);
        order_food = (Button) findViewById(R.id.order_food);
        order_food.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.order_food:
                Intent i = new Intent(getApplicationContext(), PickupFood.class);
                startActivity(i);
                break;
        }
    }
}
