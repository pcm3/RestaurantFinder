package com.example.restaurantfinder.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UIUCRestaurants {
    private Restaurant pandaExpress = new Restaurant("Panda Express", "Chinese (American)", "627 S Wright St, Champaign, IL",
            new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100},
            new int[]{1030, 2100});

    private Restaurant sakanaya = new Restaurant("Sakanaya", "Japanese", "403 E Green St, Champaign, IL", new int[]{1130, 1400, 1700, 2200},
            new int[]{1130, 1400, 1700, 2200}, new int[]{1130, 1400, 1700, 2200}, new int[]{1130, 1400, 1700, 2200}, new int[]{1130, 1400, 1700, 2200},
            new int[]{1130, 1400, 1700, 2200}, new int[]{});

    private Restaurant spoonhouse = new Restaurant("Spoon House", "Korean", "616 E Green St, Champaign, IL", new int[]{1030, 2100},
            new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2030}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100});

    private Restaurant midSummerLounge = new Restaurant("Mid Summer Lounge", "Chinese", "623 E Green St, Champaign, IL", new int[]{1100, 2130},
            new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130});

    private Restaurant aRiRang = new Restaurant("A-Ri-Rang", "Korean", "607 S Wright St, Champaign, IL", new int[]{1100, 2100},
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{}, new int[]{1100, 2100});

    private Restaurant sigGrill = new Restaurant("Signature Grill", "Fusion", "505 E Green St, Champaign, IL", new int[]{1100, 2200},
            new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200});

    private Restaurant noodles = new Restaurant("Noodles & Company", "Noodles", "528 E Green St, Champaign, IL", new int[]{1100, 2200},
            new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200});

    private Restaurant chipotle = new Restaurant("Chipotle Mexican Grill", "Mexican", "528 E Green St, Champaign, IL", new int[]{1045, 2200},
            new int[]{1045, 2200}, new int[]{1045, 2200}, new int[]{1045, 2200}, new int[]{1045, 2200}, new int[]{1045, 2200}, new int[]{1045, 2200});

    private Restaurant bangkok = new Restaurant("Bangkok Thai & Pho 911", "Thai", "410 E Green St. Champaign, IL", new int[]{1100, 2100},
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100});

    private Restaurant x = new Restaurant("", "", "", new int[]{},
            new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{});

    private Restaurant x = new Restaurant("", "", "", new int[]{},
            new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{});

    private Restaurant[] allRestaurants;

    private Random r = new Random();

    private List<Restaurant> openRestaurants = new ArrayList<>();

    public UIUCRestaurants() {
        allRestaurants = new Restaurant[]{pandaExpress, sakanaya, spoonhouse, midSummerLounge, aRiRang, sigGrill, noodles, chipotle};
    }

    public void getOpenRestaurants(String day, int time) {
        List<Restaurant> temp = new ArrayList<>();
        for (int i = 0; i < allRestaurants.length; i++) {
            if (allRestaurants[i].isOpen(day, time)) {
                temp.add(allRestaurants[i]);
            }
        }
        openRestaurants = temp;
    }

    public Restaurant getRandomRestaurant() {
        if (openRestaurants.size() == 0) {
            return new Restaurant("Cook at Home");
        }
        int index = r.nextInt(openRestaurants.size());
        return openRestaurants.get(index);
    }

}
