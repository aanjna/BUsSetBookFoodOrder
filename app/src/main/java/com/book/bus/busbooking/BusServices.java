package com.book.bus.busbooking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;


public class BusServices extends AppCompatActivity {
    LinearLayout mainOrderMeal;
    LinearLayout nextBusStop;
    LinearLayout routBusTrip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_services);

        nextBusStop=(LinearLayout)findViewById(R.id.main_next_bus_stop);
        nextBusStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusServices.this, OrderTikitActivity.class);
                startActivity(intent);
            }
        });

        mainOrderMeal=(LinearLayout)findViewById(R.id.main_order_meal_ongo);
        mainOrderMeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mealorder = new Intent(BusServices.this, OrderFood.class);
                startActivity(mealorder);
            }
        });

        routBusTrip=(LinearLayout)findViewById(R.id.main_find_route_bus_trip);
        routBusTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusServices.this, MapsActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bus_services, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_wallet) {
            Intent wallet = new Intent(this, WalletActivity.class);
            startActivity(wallet);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
