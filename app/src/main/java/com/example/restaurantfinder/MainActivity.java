package com.example.restaurantfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.restaurantfinder.logic.Restaurant;
import com.example.restaurantfinder.logic.UIUCRestaurants;

public class MainActivity extends AppCompatActivity {

    UIUCRestaurants restaurants = new UIUCRestaurants();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b = findViewById(R.id.search_button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar now = Calendar.getInstance();
                int day = now.get(Calendar.DAY_OF_WEEK);
                int hour = now.get(Calendar.HOUR_OF_DAY);
                int minutes = now.get(Calendar.MINUTE);
                String time = "";
                if (minutes < 10) {
                    time = hour + "0" + minutes;
                } else {
                    time = "" + hour + minutes;
                }
                int timeInt = Integer.parseInt(time);
                TextView t = findViewById(R.id.date_and_time);
                t.setVisibility(View.VISIBLE);
                if (day == 1) {
                    t.setText("Sunday" + time);
                } else if (day == 2) {
                    t.setText("Monday" + " " + timeInt);
                } else if (day == 3) {
                    t.setText("Tuesday" + " " + timeInt);
                } else if (day == 4) {
                    t.setText("Wednesday" + " " + timeInt);
                } else if (day == 5) {
                    t.setText("Thursday" + " " + timeInt);
                } else if (day == 6) {
                    t.setText("Friday" + " " + timeInt);
                } else if (day == 7) {
                    t.setText("Saturday" + " " + timeInt);
                }
                Restaurant restaurant = restaurants.testGetRandomRestaurant();
                String rName = restaurant.getName();
                String rAddress = restaurant.getAddress();
                TextView restaurantAddress = findViewById(R.id.restaurant_address);
                TextView restaurantAddressId = findViewById(R.id.restaurant_address_id);
                TextView restaurantName = findViewById(R.id.restaurant_name);
                TextView restaurantNameId = findViewById(R.id.restaurant_id);
                restaurantAddress.setText(rAddress);
                restaurantName.setText(rName);
                restaurantAddress.setVisibility(View.VISIBLE);
                restaurantAddressId.setVisibility(View.VISIBLE);
                restaurantName.setVisibility(View.VISIBLE);
                restaurantNameId.setVisibility(View.VISIBLE);
            }
        });
    }
}
