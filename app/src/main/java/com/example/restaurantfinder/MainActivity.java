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
                String dayStr = "";
                int timeInt = Integer.parseInt(time);
                TextView t = findViewById(R.id.date_and_time);
                t.setVisibility(View.VISIBLE);
                if (day == 1) {
                    t.setText("Sunday" + time);
                    dayStr = "Sunday";
                } else if (day == 2) {
                    t.setText("Monday" + " " + timeInt);
                    dayStr = "Monday";
                } else if (day == 3) {
                    t.setText("Tuesday" + " " + timeInt);
                    dayStr = "Tuesday";
                } else if (day == 4) {
                    t.setText("Wednesday" + " " + timeInt);
                    dayStr = "Wednesday";
                } else if (day == 5) {
                    t.setText("Thursday" + " " + timeInt);
                    dayStr = "Thursday";
                } else if (day == 6) {
                    t.setText("Friday" + " " + timeInt);
                    dayStr = "Friday";
                } else if (day == 7) {
                    t.setText("Saturday" + " " + timeInt);
                    dayStr = "Saturday";
                }
                //Restaurant restaurant = restaurants.testGetRandomRestaurant();
                Restaurant restaurant = restaurants.getRandomRestaurant(dayStr, timeInt);
                String rName = restaurant.getName();
                TextView restaurantName = findViewById(R.id.restaurant_name);
                TextView restaurantAddress = findViewById(R.id.restaurant_address);
                TextView restaurantAddressId = findViewById(R.id.restaurant_address_id);
                TextView restaurantNameId = findViewById(R.id.restaurant_id);
                TextView typeOfFood = findViewById(R.id.type_of_food);
                TextView typeOfFoodId = findViewById(R.id.type_of_food_id);
                restaurantName.setText(rName);
                restaurantName.setVisibility(View.VISIBLE);
                int sizeTest = restaurants.getListSize();
                t.setText("" + sizeTest);
                if (restaurants.getOpenRestaurantsList().size() > 1) {
                    String rAddress = restaurant.getAddress();
                    String rFood = restaurant.getTypeOfFood();
                    restaurantAddress.setText(rAddress);
                    typeOfFood.setText(rFood);
                    restaurantAddress.setVisibility(View.VISIBLE);
                    restaurantAddressId.setVisibility(View.VISIBLE);
                    restaurantNameId.setVisibility(View.VISIBLE);
                    typeOfFood.setVisibility(View.VISIBLE);
                    typeOfFoodId.setVisibility(View.VISIBLE);
                } else {
                    restaurantAddress.setVisibility(View.INVISIBLE);
                    restaurantAddressId.setVisibility(View.INVISIBLE);
                    restaurantNameId.setVisibility(View.INVISIBLE);
                    typeOfFood.setVisibility(View.INVISIBLE);
                    typeOfFoodId.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
