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
     * */
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

    public Restaurant(String setName) {
        name = setName;
    }

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

    public String getName() {
        return name;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public String getAddress() {
        return address;
    }

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
