package com.example.restaurantfinder.logic;

import java.util.Arrays;

/**This class is to make restaurants in the form of objects.
 * It will store the restaurant's name, type of food, location, and hours of operation.*/
public class Restaurant {

    /**the name of the restaurant.*/
    private String name;

    /**the type of food served at the restaurant.*/
    private String typeOfFood;

    /**the address of the restaurant.*/
    private String address;

    /**the hours of the restaurant on Mondays.*/
    private int[] monHours;

    /**the hours of the restaurant on Tuesdays.*/
    private int[] tuesHours;

    /**the hours of the restaurant on Wednesdays.*/
    private int[] wedHours;

    /**the hours of the restaurant on Thursdays.*/
    private int[] thursHours;

    /**the hours of the restaurant on Fridays.*/
    private int[] friHours;

    /**the hours of the restaurant on Saturdays.*/
    private int[] satHours;

    /**the hours of the restaurant on Sundays.*/
    private int[] sunHours;

    /**the constructor of the class.
     * @param setName the name of the restaurant.
     * @param setTypeOfFood the type of food of the restaurant.
     * @param setAddress the address of the restaurant.
     * @param setMonHours the hours of operation for the restaurant on Monday.
     * @param setTuesHours the hours of operation for the restaurant on Tuesday.
     * @param setWedHours the hours of operation for the restaurant on Wednesday.
     * @param setThursHours the hours of operation for the restaurant on Thursday.
     * @param setFriHours the hours of operation for the restaurant on Friday.
     * @param setSatHours the hours of operation for the restaurant on Saturday.
     * @param setSunHours the hours of operation for the restaurant on Sunday.*/
    public Restaurant(String setName, String setTypeOfFood, String setAddress, int[] setMonHours,
                      int[] setTuesHours, int[] setWedHours, int[] setThursHours, int[] setFriHours,
                      int[] setSatHours, int[] setSunHours) {
        name = setName;
        typeOfFood = setTypeOfFood;
        address = setAddress;
        monHours = setMonHours;
        tuesHours = setTuesHours;
        wedHours = setWedHours;
        thursHours = setThursHours;
        friHours = setFriHours;
        satHours = setSatHours;
        sunHours = setSunHours;
    }

    /**other constructor for the class.
     * @param setName the name of the restaurant.*/
    public Restaurant(String setName) {
        name = setName;
    }

    /**gets the hours of operation for a restaurant for a specific day.
     * @param day the current day.
     * @return the array of hours for the given day.*/
    public int[] getHours(String day) {
        if (day == "Monday") {
            return monHours;
        } else if (day == "Tuesday") {
            return tuesHours;
        } else if (day == "Wednesday") {
            return wedHours;
        } else if (day == "Thursday") {
            return thursHours;
        } else if (day == "Friday") {
            return friHours;
        } else if (day == "Saturday") {
            return satHours;
        } else if (day == "Sunday") {
            return sunHours;
        }
        return new int[]{};
    }

    /**tells whether the restaurant is currently open or not.
     * @param day the current day.
     * @param time the current time.
     * @return true if the restaurant is open.*/
    public boolean isOpen(String day, int time) {
        int[] hours = getHours(day);
        if (hours.length == 0) {
            return false;
        }
        for (int i = 1; i < hours.length; i += 2) {
            int open = hours[i - 1];
            int close = hours[i];
            if (time >= open && time < close) {
                return true;
            }
        }
        return false;
    }

    /**gets the name of the current instance of Restaurant.
     * @return name.*/
    public String getName() {
        return name;
    }

    /**gets the type of food of the current instance of Restaurant.
     * @return typeOfFood.*/
    public String getTypeOfFood() {
        return typeOfFood;
    }

    /**gets the address of the current instance of Restaurant.
     * @return address.*/
    public String getAddress() {
        return address;
    }

    /**returns whether or not the current instance of Restaurant is equal to the passed argument.
     * @param r the Restaurant being compared to the current instance.
     * @return true if the two are equal.*/
    public boolean rEquals(Restaurant r) {
        if (!(name.equals(r.getName()))) {
            return false;
        }
        if (!(typeOfFood.equals(r.getTypeOfFood()))) {
            return false;
        }
        if (!(address.equals(r.getAddress()))) {
            return false;
        }
        if (!(Arrays.equals(monHours, r.monHours))) {
            return false;
        }
        if (!(Arrays.equals(tuesHours, r.tuesHours))) {
            return false;
        }
        if (!(Arrays.equals(wedHours, r.wedHours))) {
            return false;
        }
        if (!(Arrays.equals(thursHours, r.thursHours))) {
            return false;
        }
        if (!(Arrays.equals(friHours, r.friHours))) {
            return false;
        }
        if (!(Arrays.equals(satHours, r.satHours))) {
            return false;
        }
        if (!(Arrays.equals(sunHours, r.sunHours))) {
            return false;
        }
        return true;
    }
}
