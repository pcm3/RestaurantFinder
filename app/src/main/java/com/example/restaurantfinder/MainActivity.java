package com.example.restaurantfinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;

import android.icu.util.Calendar;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.restaurantfinder.logic.Restaurant;
import com.example.restaurantfinder.logic.UIUCRestaurants;

import java.util.List;

/**the main activity for the app.*/
public class MainActivity extends AppCompatActivity {

    /**an instance created of the UIUCRestaurants class.*/
    UIUCRestaurants restaurants = new UIUCRestaurants();

    /**an index to be used for looping through restaurants at points in the code.*/
    int index = 0;

    /**an instance of Handler.*/
    final Handler handler = new Handler();

    /**Restaurant variable to be used as a reference variable when adding/removing
     * restaurants from the unliked restaurants.*/
    Restaurant checkRestaurant = new Restaurant("", "", "", new int[]{}, new int[]{}, new int[]{},
            new int[]{}, new int[]{}, new int[]{}, new int[]{});

    /**Called by the Android system when the activity is to be set up.
     * @param savedInstanceState info from the previously terminated instance (unused). */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button b = findViewById(R.id.search_button);
        final Button u = findViewById(R.id.unlikeButton);
        final Button undo = findViewById(R.id.undoButton);

        handler.post(new Runnable() {
            @Override
            public void run() {
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
                    dayStr = "Sunday";
                } else if (day == 2) {
                    dayStr = "Monday";
                } else if (day == 3) {
                    dayStr = "Tuesday";
                } else if (day == 4) {
                    dayStr = "Wednesday";
                } else if (day == 5) {
                    dayStr = "Thursday";
                } else if (day == 6) {
                    dayStr = "Friday";
                } else if (day == 7) {
                    dayStr = "Saturday";
                }
                restaurants.getOpenRestaurants(dayStr, timeInt);
                int listSize = restaurants.getListSize();
                t.setText("" + listSize);

                handler.postDelayed(this, 500);
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restaurants.newUnlikedRestaurant((checkRestaurant));
                undo.setVisibility(View.VISIBLE);
            }
        });

        undo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restaurants.undoDislike(checkRestaurant);
                undo.setVisibility(View.INVISIBLE);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Restaurant restaurant = restaurants.getRandomRestaurant();
                checkRestaurant = restaurant;
                String rName = restaurant.getName();
                String rAddress = restaurant.getAddress();
                String rFood = restaurant.getTypeOfFood();
                //Group main = (Group) findViewById(R.id.mainConstraint);
                ConstraintLayout main = findViewById(R.id.mainConstraint);
                TextView restaurantName = findViewById(R.id.restaurant_name);
                TextView restaurantAddress = findViewById(R.id.restaurant_address);
                TextView restaurantAddressId = findViewById(R.id.restaurant_address_id);
                TextView restaurantNameId = findViewById(R.id.restaurant_id);
                TextView typeOfFood = findViewById(R.id.type_of_food);
                TextView typeOfFoodId = findViewById(R.id.type_of_food_id);
                undo.setVisibility(View.INVISIBLE);
                u.setVisibility(View.VISIBLE);
                main.setVisibility(View.VISIBLE);
                restaurantName.setVisibility(View.VISIBLE);
                restaurantAddress.setVisibility(View.VISIBLE);
                restaurantAddressId.setVisibility(View.VISIBLE);
                restaurantNameId.setVisibility(View.VISIBLE);
                typeOfFood.setVisibility(View.VISIBLE);
                typeOfFoodId.setVisibility(View.VISIBLE);
                if (restaurants.getOpenRestaurantsList().size() > 1) {
                    oscillate(restaurantName, restaurantAddress, typeOfFood, restaurants.getOpenRestaurantsList(), rName, rAddress, rFood);
                } else if (restaurants.getOpenRestaurantsList().size() == 1) {
                    restaurantAddress.setText(rAddress);
                    typeOfFood.setText(rFood);
                    restaurantName.setText(rName);
                    makeSound();
                } else {
                    restaurantName.setText(rName);
                    u.setVisibility(View.INVISIBLE);
                    restaurantAddress.setVisibility(View.INVISIBLE);
                    restaurantAddressId.setVisibility(View.INVISIBLE);
                    restaurantNameId.setVisibility(View.INVISIBLE);
                    typeOfFood.setVisibility(View.INVISIBLE);
                    typeOfFoodId.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    /**Oscillates through the list of Restaurants before showing the chosen one.
     * the speed of oscillation gradually decreases as time goes on.
     * While oscillating, a drum roll will sound, and a horn will play at the end.
     * @param restaurantName the TextView for where the name of the restaurant goes.
     * @param restaurantAddress the TextView for where the address goes.
     * @param typeOfFood the TextView for where the type of food goes.
     * @param testList the list of open restaurants.
     * @param name the name of the randomly chosen restaurant.
     * @param address the address of the randomly chosen restaurant.
     * @param food the food type of the randomly chosen restaurant.*/
    public void oscillate(final TextView restaurantName, final TextView restaurantAddress,
            final TextView typeOfFood, final List<Restaurant> testList, final String name, final String address, final String food) {
        final MediaPlayer drum = MediaPlayer.create(this, R.raw.drum);
        drum.start();
        drum.setLooping(true);
        increaseIndex(testList);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 0);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 100);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 200);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 300);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 400);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 500);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 600);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 700);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 800);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 900);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 1000);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 1100);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 1200);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 1300);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 1400);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 1500);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 1700);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 1900);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 2100);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 2400);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 2700);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setStats(restaurantName, typeOfFood, restaurantAddress, testList);
            }
        }, 3100);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                drum.setLooping(false);
                drum.stop();
                typeOfFood.setText(food);
                restaurantName.setText(name);
                restaurantAddress.setText(address);
                makeSound();
            }
        }, 3500);
    }

    /**Makes the noise of a trumpet.*/
    public void makeSound() {
        MediaPlayer tada = MediaPlayer.create(this, R.raw.tada);
        tada.start();
    }

    /**increases the value of index by one.
     * if index is ever equal to or greater than the size of the open restaurants,
     * the value will be reset to zero.
     * @param testList the list of open restaurants.*/
    public void increaseIndex(List<Restaurant> testList) {
        index++;
        if (index >= testList.size()) {
            index = 0;
        }
    }

    /**sets the values of the name, food, and address TextViews.
     * @param restaurantName the TextView for the name.
     * @param typeOfFood the TextView for the type of food.
     * @param restaurantAddress the TextView for the address.
     * @param testList the list of open restaurants.*/
    public void setStats(final TextView restaurantName, final TextView typeOfFood, final TextView restaurantAddress,
                         final List<Restaurant> testList) {
        Restaurant r = testList.get(index);
        String rName = r.getName();
        String rAddress = r.getAddress();
        String rFood = r.getTypeOfFood();
        restaurantAddress.setText(rAddress);
        typeOfFood.setText(rFood);
        restaurantName.setText(rName);
        increaseIndex(testList);
    }
}
