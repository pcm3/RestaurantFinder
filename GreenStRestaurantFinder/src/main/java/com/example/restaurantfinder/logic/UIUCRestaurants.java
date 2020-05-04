package com.example.restaurantfinder.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UIUCRestaurants {
    private Restaurant pandaExpress = new Restaurant("Panda Express", "Chinese (American)", "627 S Wright St",
            new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100},
            new int[]{1030, 2100});

    private Restaurant sakanaya = new Restaurant("Sakanaya", "Japanese", "403 E Green St", new int[]{1130, 1400, 1700, 2200},
            new int[]{1130, 1400, 1700, 2200}, new int[]{1130, 1400, 1700, 2200}, new int[]{1130, 1400, 1700, 2200}, new int[]{1130, 1400, 1700, 2200},
            new int[]{1130, 1400, 1700, 2200}, new int[]{});

    private Restaurant spoonhouse = new Restaurant("Spoon House", "Korean", "616 E Green St", new int[]{1030, 2100},
            new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2030}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100});

    private Restaurant midSummerLounge = new Restaurant("Mid Summer Lounge", "Chinese", "623 E Green St", new int[]{1100, 2130},
            new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130});

    private Restaurant aRiRang = new Restaurant("A-Ri-Rang", "Korean", "607 S Wright St", new int[]{1100, 2100},
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{}, new int[]{1100, 2100});

    private Restaurant sigGrill = new Restaurant("Signature Grill", "Fusion", "505 E Green St", new int[]{1100, 2200},
            new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200});

    private Restaurant noodles = new Restaurant("Noodles & Company", "Noodles", "528 E Green St", new int[]{1100, 2200},
            new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200});

    private Restaurant chipotle = new Restaurant("Chipotle Mexican Grill", "Mexican", "528 E Green St", new int[]{1045, 2200},
            new int[]{1045, 2200}, new int[]{1045, 2200}, new int[]{1045, 2200}, new int[]{1045, 2200}, new int[]{1045, 2200}, new int[]{1045, 2200});

    private Restaurant bangkok = new Restaurant("Bangkok Thai & Pho 911", "Thai", "410 E Green St", new int[]{1100, 2100},
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100});

    private Restaurant zorbas = new Restaurant("Zorba's", "Mediterranean", "627 E Green St", new int[]{1100, 2200},
            new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2200});

    private Restaurant jurassicGrill = new Restaurant("Jurassic Grill", "Burgers", "404 E Green St", new int[]{1100, 2400},
            new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400},
            new int[]{0, 300, 1100, 2400});

    private Restaurant jerusalem = new Restaurant("Jerusalem Middle Eastern Cuisine", "Middle Eastern", "601 S Wright St",
            new int[]{1100, 1900}, new int[]{1100, 1900}, new int[]{1100, 1900}, new int[]{1100, 1900}, new int[]{1100, 1900}, new int[]{}, new int[]{});

    private Restaurant cravings = new Restaurant("Cravings", "Chinese", "603 S Wright St", new int[]{1100, 2100},
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{});

    private Restaurant ambarIndia = new Restaurant("Ambar India Restaurant", "Indian", "605 S Wright St", new int[]{1100, 2145},
            new int[]{1100, 2145}, new int[]{1100, 2145}, new int[]{1100, 2145}, new int[]{1100, 2145}, new int[]{1100, 2145}, new int[]{1100, 2145});

    private Restaurant sushiIchiban = new Restaurant("Sushi Ichiban", "Sushi", "619 S Wright St", new int[]{1100, 2130},
            new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130});

    private Restaurant subway = new Restaurant("Subway", "Fast Food", "616 E Green St Suite A", new int[]{930, 2000},
            new int[]{930, 2000}, new int[]{930, 2000}, new int[]{930, 2000}, new int[]{930, 2000}, new int[]{930, 1400}, new int[]{930, 1400});

    private Restaurant mcdonalds = new Restaurant("McDonald's", "Fast Food", "616 E Green St", new int[]{0, 2400},
            new int[]{0, 2400}, new int[]{0, 2400}, new int[]{0, 2400}, new int[]{0, 2400}, new int[]{0, 2400}, new int[]{0, 2400});

    private Restaurant jipbap = new Restaurant("Jip Bap", "Korean", "601 S 6th St Suite 101", new int[]{1030, 2100},
            new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100});

    private Restaurant ozuRamen = new Restaurant("Ozu Ramen", "Ramen", "601 S 6th St Suite 102", new int[]{1100, 2100},
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130});

    private Restaurant parisSuperCrepes = new Restaurant("Paris Super Crepes", "Crepes", "601 S 6th St Suite 106", new int[]{1200, 2130},
            new int[]{1200, 2130}, new int[]{1200, 2130}, new int[]{1200, 2130}, new int[]{1200, 2130}, new int[]{1200, 2130}, new int[]{1200, 2130});

    private Restaurant pokelab = new Restaurant("Pokelab", "Poke", "605 S 6th St", new int[]{},
            new int[]{1200, 2100}, new int[]{1200, 2100}, new int[]{1200, 2100}, new int[]{1200, 2100}, new int[]{1200, 2100}, new int[]{1200, 2100});

    private Restaurant spicyTang = new Restaurant("Spicy Tang", "Chinese", "607 S 6th St", new int[]{1030, 2130},
            new int[]{1030, 2130}, new int[]{1030, 2130}, new int[]{1030, 2130}, new int[]{1030, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130});

    private Restaurant tacoBell = new Restaurant("Taco Bell", "Fast Food", "512 E Green St", new int[]{0, 300, 1000, 2400},
            new int[]{0, 300, 1000, 2400}, new int[]{0, 300, 1000, 2400}, new int[]{0, 300, 1000, 2400}, new int[]{0, 300, 1000, 2400},
            new int[]{0, 300, 1000, 2400}, new int[]{0, 300, 1000, 2400});

    private Restaurant miaZas = new Restaurant("Mia Za's", "Italian", "629 E Green St", new int[]{1100, 2000},
            new int[]{1100, 2000}, new int[]{1100, 2000}, new int[]{1100, 2000}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2000});

    private Restaurant howdy = new Restaurant("Howdy", "Burger", "625 E Green St", new int[]{1100, 2100},
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100});

    private Restaurant sushiRock = new Restaurant("Sushi Rock", "Sushi", "621 E Green St", new int[]{1100, 1400, 1700, 2100},
            new int[]{1100, 1400, 1700, 2100}, new int[]{1100, 1400, 1700, 2100}, new int[]{1100, 1400, 1700, 2100}, new int[]{1100, 1400, 1700, 2100},
            new int[]{1700, 2100}, new int[]{1700, 2100});

    private Restaurant phoCafe = new Restaurant("Pho Cafe Thai Kitchen", "Vietnamese", "611 E Green St",
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{});

    private Restaurant potbelly = new Restaurant("Potbelly Sandwich Shop", "Sandwich", "501 E Green St",
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100},
            new int[]{1100, 2100}, new int[]{1100, 2100});

    private Restaurant pizzaHut = new Restaurant("Pizza Hut", "Pizza", "411 E Green St", new int[]{1100, 2100},
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100});

    private Restaurant burritoKingMexicanGrill = new Restaurant("Burrito King Mexican Grill", "Mexican", "408 E Green St", new int[]{1100, 2400},
            new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2100});

    private Restaurant boBoChina = new Restaurant("Bo Bo China", "Chinese", "404 E Green St", new int[]{},
            new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130});

    private Restaurant laiLaiWok = new Restaurant("Lai Lai Wok", "Chinese", "402 E Green St", new int[]{1100, 2130},
            new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130});

    private Restaurant bombayIndianGrill = new Restaurant("Bombay Indian Grill", "Indian", "401 E Green St", new int[]{1100, 1445, 1630, 2100},
            new int[]{1100, 1445, 1630, 2100}, new int[]{1100, 1445, 1630, 2100}, new int[]{1100, 1445, 1630, 2100}, new int[]{1100, 1445, 1630, 2100},
            new int[]{1130, 1445, 1630, 2100}, new int[]{1130, 1445, 1630, 2100});

    private Restaurant fourBreakfast = new Restaurant("Four Breakfast & More", "American", "401 E Green St", new int[]{700, 1400},
            new int[]{0, 300, 700, 1400, 1700, 2400}, new int[]{700, 1400, 1700, 2400}, new int[]{700, 1400, 1700, 2400},
            new int[]{0, 300, 700, 2400}, new int[]{0, 300, 700, 2400}, new int[]{0, 300, 700, 1700});

    private Restaurant shiquan = new Restaurant("Shiquan", "Chinese", "212 E Green St", new int[]{1130, 2100},
            new int[]{}, new int[]{1130, 2100}, new int[]{1130, 2100}, new int[]{1130, 2100}, new int[]{1130, 2100}, new int[]{1130, 2100});

    private Restaurant chopstix = new Restaurant("Chopstix", "Chinese", "202 E Green St", new int[]{0, 300, 1600, 2400},
            new int[]{0, 300, 1600, 2400}, new int[]{0, 300, 1600, 2400}, new int[]{0, 300, 1600, 2400}, new int[]{0, 300, 1600, 2400},
            new int[]{0, 330, 1600, 2400}, new int[]{0, 330, 1600, 2400});

    private Restaurant papaJohn = new Restaurant("Papa John's Pizza", "Pizza", "106 E Green St", new int[]{1100, 2300},
            new int[]{1100, 2300}, new int[]{1100, 2300}, new int[]{1100, 2300}, new int[]{1100, 2400}, new int[]{1100, 2400}, new int[]{1100, 2300});

    private Restaurant maize = new Restaurant("Maize Mexican Grill", "Mexican", "60 E Green St", new int[]{1100, 2400},
            new int[]{0, 230, 1100, 2400}, new int[]{0, 230, 1100, 2400}, new int[]{0, 230, 1100, 2400}, new int[]{0, 230, 1100, 2400},
            new int[]{0, 230, 1100, 2400}, new int[]{0, 230, 1100, 2100});

    private Restaurant dominos = new Restaurant("Domino's Pizza", "Pizza", "55 E Green St", new int[]{1100, 2300},
            new int[]{1100, 2300}, new int[]{1100, 2300}, new int[]{1100, 2300}, new int[]{1100, 2400}, new int[]{1100, 2400}, new int[]{1100, 2300});

    private Restaurant cracked = new Restaurant("Cracked the Egg Came First", "Pizza", "619 E Green St", new int[]{800, 1400},
            new int[]{800, 1400}, new int[]{800, 1400}, new int[]{800, 1400}, new int[]{800, 1400}, new int[]{800, 1400}, new int[]{800, 1400});

    private Restaurant[] allRestaurants;

    private Random r = new Random();

    private List<Restaurant> openRestaurants = new ArrayList<>();

    public UIUCRestaurants() {
        allRestaurants = new Restaurant[]{pandaExpress, sakanaya, spoonhouse, midSummerLounge, aRiRang, sigGrill, noodles, chipotle, bangkok,
        zorbas, jurassicGrill, jerusalem, cravings, ambarIndia, sushiIchiban, subway, mcdonalds, jipbap, ozuRamen, parisSuperCrepes, pokelab,
                spicyTang, tacoBell, miaZas, howdy, sushiRock, phoCafe, potbelly, pizzaHut, burritoKingMexicanGrill, boBoChina, laiLaiWok,
                bombayIndianGrill, fourBreakfast, shiquan, chopstix, papaJohn, maize, dominos, cracked};
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
            return new Restaurant("Nothing is Open");
        }
        int index = r.nextInt(openRestaurants.size());
        return openRestaurants.get(index);
    }

    public List<Restaurant> getOpenRestaurantsList() {
        return openRestaurants;
    }

    public int getListSize() {
        return openRestaurants.size();
    }

}
