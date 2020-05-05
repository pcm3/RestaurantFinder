package com.example.restaurantfinder.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**a class for the restaurants on green st.*/
public class UIUCRestaurants {

    /**reference to Panda Express on Green St.*/
    private Restaurant pandaExpress = new Restaurant("Panda Express", "Chinese (American)", "627 S Wright St",
            new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100},
            new int[]{1030, 2100});

    /**reference to Sakanaya on Green St.*/
    private Restaurant sakanaya = new Restaurant("Sakanaya", "Japanese", "403 E Green St", new int[]{1130, 1400, 1700, 2200},
            new int[]{1130, 1400, 1700, 2200}, new int[]{1130, 1400, 1700, 2200}, new int[]{1130, 1400, 1700, 2200}, new int[]{1130, 1400, 1700, 2200},
            new int[]{1130, 1400, 1700, 2200}, new int[]{});

    /**reference to Spoon House on Green St.*/
    private Restaurant spoonhouse = new Restaurant("Spoon House", "Korean", "616 E Green St", new int[]{1030, 2100},
            new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2030}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100});

    /**reference to Mid Summer Lounge on Green St.*/
    private Restaurant midSummerLounge = new Restaurant("Mid Summer Lounge", "Chinese", "623 E Green St", new int[]{1100, 2130},
            new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130});

    /**reference to A-Ri-Rang on Green St.*/
    private Restaurant aRiRang = new Restaurant("A-Ri-Rang", "Korean", "607 S Wright St", new int[]{1100, 2100},
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{}, new int[]{1100, 2100});

    /**reference to Signature Grill on Green St.*/
    private Restaurant sigGrill = new Restaurant("Signature Grill", "Fusion", "505 E Green St", new int[]{1100, 2200},
            new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200});

    /**reference to Noodles & Company on Green St.*/
    private Restaurant noodles = new Restaurant("Noodles & Company", "Noodles", "528 E Green St", new int[]{1100, 2200},
            new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2200});

    /**reference to chipotle on Green St.*/
    private Restaurant chipotle = new Restaurant("Chipotle Mexican Grill", "Mexican", "528 E Green St", new int[]{1045, 2200},
            new int[]{1045, 2200}, new int[]{1045, 2200}, new int[]{1045, 2200}, new int[]{1045, 2200}, new int[]{1045, 2200}, new int[]{1045, 2200});

    /**reference to bangkok thai on Green St.*/
    private Restaurant bangkok = new Restaurant("Bangkok Thai & Pho 911", "Thai", "410 E Green St", new int[]{1100, 2100},
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100});

    /**reference to zorba's on Green St.*/
    private Restaurant zorbas = new Restaurant("Zorba's", "Mediterranean", "627 E Green St", new int[]{1100, 2200},
            new int[]{1100, 2200}, new int[]{1100, 2200}, new int[]{1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2200});

    /**reference to jurassic grill on Green St.*/
    private Restaurant jurassicGrill = new Restaurant("Jurassic Grill", "Burgers", "404 E Green St", new int[]{1100, 2400},
            new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400},
            new int[]{0, 300, 1100, 2400});

    /**reference to Jerusalem Middle Eastern Cuisine on Green St.*/
    private Restaurant jerusalem = new Restaurant("Jerusalem Middle Eastern Cuisine", "Middle Eastern", "601 S Wright St",
            new int[]{1100, 1900}, new int[]{1100, 1900}, new int[]{1100, 1900}, new int[]{1100, 1900}, new int[]{1100, 1900}, new int[]{}, new int[]{});

    /**reference to Cravings on Green St.*/
    private Restaurant cravings = new Restaurant("Cravings", "Chinese", "603 S Wright St", new int[]{1100, 2100},
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{});

    /**reference to Ambar India Restaurant on Green St.*/
    private Restaurant ambarIndia = new Restaurant("Ambar India Restaurant", "Indian", "605 S Wright St", new int[]{1100, 2145},
            new int[]{1100, 2145}, new int[]{1100, 2145}, new int[]{1100, 2145}, new int[]{1100, 2145}, new int[]{1100, 2145}, new int[]{1100, 2145});

    /**reference to Sushi Ichiban on Green St.*/
    private Restaurant sushiIchiban = new Restaurant("Sushi Ichiban", "Sushi", "619 S Wright St", new int[]{1100, 2130},
            new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130});

    /**reference to Subway on Green St.*/
    private Restaurant subway = new Restaurant("Subway", "Fast Food", "616 E Green St Suite A", new int[]{930, 2000},
            new int[]{930, 2000}, new int[]{930, 2000}, new int[]{930, 2000}, new int[]{930, 2000}, new int[]{930, 1400}, new int[]{930, 1400});

    /**reference to McDonald's on Green St.*/
    private Restaurant mcdonalds = new Restaurant("McDonald's", "Fast Food", "616 E Green St", new int[]{0, 2400},
            new int[]{0, 2400}, new int[]{0, 2400}, new int[]{0, 2400}, new int[]{0, 2400}, new int[]{0, 2400}, new int[]{0, 2400});

    /**reference to Jip Bap on Green St.*/
    private Restaurant jipbap = new Restaurant("Jip Bap", "Korean", "601 S 6th St Suite 101", new int[]{1030, 2100},
            new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100}, new int[]{1030, 2100});

    /**reference to Ozu Ramen on Green St.*/
    private Restaurant ozuRamen = new Restaurant("Ozu Ramen", "Ramen", "601 S 6th St Suite 102", new int[]{1100, 2100},
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130});

    /**reference to Paris Super Crepes on Green St.*/
    private Restaurant parisSuperCrepes = new Restaurant("Paris Super Crepes", "Crepes", "601 S 6th St Suite 106", new int[]{1200, 2130},
            new int[]{1200, 2130}, new int[]{1200, 2130}, new int[]{1200, 2130}, new int[]{1200, 2130}, new int[]{1200, 2130}, new int[]{1200, 2130});

    /**reference to Pokelab on Green St.*/
    private Restaurant pokelab = new Restaurant("Pokelab", "Poke", "605 S 6th St", new int[]{},
            new int[]{1200, 2100}, new int[]{1200, 2100}, new int[]{1200, 2100}, new int[]{1200, 2100}, new int[]{1200, 2100}, new int[]{1200, 2100});

    /**reference to Spicy Tang on Green St.*/
    private Restaurant spicyTang = new Restaurant("Spicy Tang", "Chinese", "607 S 6th St", new int[]{1030, 2130},
            new int[]{1030, 2130}, new int[]{1030, 2130}, new int[]{1030, 2130}, new int[]{1030, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130});

    /**reference to Taco Bell on Green St.*/
    private Restaurant tacoBell = new Restaurant("Taco Bell", "Fast Food", "512 E Green St", new int[]{0, 300, 1000, 2400},
            new int[]{0, 300, 1000, 2400}, new int[]{0, 300, 1000, 2400}, new int[]{0, 300, 1000, 2400}, new int[]{0, 300, 1000, 2400},
            new int[]{0, 300, 1000, 2400}, new int[]{0, 300, 1000, 2400});

    /**reference to Mia Za's on Green St.*/
    private Restaurant miaZas = new Restaurant("Mia Za's", "Italian", "629 E Green St", new int[]{1100, 2000},
            new int[]{1100, 2000}, new int[]{1100, 2000}, new int[]{1100, 2000}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2000});

    /**reference to Howdy on Green St.*/
    private Restaurant howdy = new Restaurant("Howdy", "Burger", "625 E Green St", new int[]{1100, 2100},
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100});

    /**reference to Sushi Rock on Green St.*/
    private Restaurant sushiRock = new Restaurant("Sushi Rock", "Sushi", "621 E Green St", new int[]{1100, 1400, 1700, 2100},
            new int[]{1100, 1400, 1700, 2100}, new int[]{1100, 1400, 1700, 2100}, new int[]{1100, 1400, 1700, 2100}, new int[]{1100, 1400, 1700, 2100},
            new int[]{1700, 2100}, new int[]{1700, 2100});

    /**reference to Pho Cafe on Green St.*/
    private Restaurant phoCafe = new Restaurant("Pho Cafe Thai Kitchen", "Vietnamese", "611 E Green St",
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{});

    /**reference to Potbelly on Green St.*/
    private Restaurant potbelly = new Restaurant("Potbelly Sandwich Shop", "Sandwich", "501 E Green St",
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100},
            new int[]{1100, 2100}, new int[]{1100, 2100});

    /**reference to Pizza Hut on Green St.*/
    private Restaurant pizzaHut = new Restaurant("Pizza Hut", "Pizza", "411 E Green St", new int[]{1100, 2100},
            new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100}, new int[]{1100, 2100});

    /**reference to Burrito King on Green St.*/
    private Restaurant burritoKingMexicanGrill = new Restaurant("Burrito King Mexican Grill", "Mexican", "408 E Green St", new int[]{1100, 2400},
            new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2400}, new int[]{0, 300, 1100, 2100});

    /**reference to Bo Bo China on Green St.*/
    private Restaurant boBoChina = new Restaurant("Bo Bo China", "Chinese", "404 E Green St", new int[]{},
            new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130});

    /**reference to Lai Lai Wok on Green St.*/
    private Restaurant laiLaiWok = new Restaurant("Lai Lai Wok", "Chinese", "402 E Green St", new int[]{1100, 2130},
            new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130}, new int[]{1100, 2130});

    /**reference to Bombay Indian Grill on Green St.*/
    private Restaurant bombayIndianGrill = new Restaurant("Bombay Indian Grill", "Indian", "401 E Green St", new int[]{1100, 1445, 1630, 2100},
            new int[]{1100, 1445, 1630, 2100}, new int[]{1100, 1445, 1630, 2100}, new int[]{1100, 1445, 1630, 2100}, new int[]{1100, 1445, 1630, 2100},
            new int[]{1130, 1445, 1630, 2100}, new int[]{1130, 1445, 1630, 2100});

    /**reference to Four Breakfast on Green St.*/
    private Restaurant fourBreakfast = new Restaurant("Four Breakfast & More", "American", "401 E Green St", new int[]{700, 1400},
            new int[]{0, 300, 700, 1400, 1700, 2400}, new int[]{700, 1400, 1700, 2400}, new int[]{700, 1400, 1700, 2400},
            new int[]{0, 300, 700, 2400}, new int[]{0, 300, 700, 2400}, new int[]{0, 300, 700, 1700});

    /**reference to Shiquan on Green St.*/
    private Restaurant shiquan = new Restaurant("Shiquan", "Chinese", "212 E Green St", new int[]{1130, 2100},
            new int[]{}, new int[]{1130, 2100}, new int[]{1130, 2100}, new int[]{1130, 2100}, new int[]{1130, 2100}, new int[]{1130, 2100});

    /**reference to Chopstix on Green St.*/
    private Restaurant chopstix = new Restaurant("Chopstix", "Chinese", "202 E Green St", new int[]{0, 300, 1600, 2400},
            new int[]{0, 300, 1600, 2400}, new int[]{0, 300, 1600, 2400}, new int[]{0, 300, 1600, 2400}, new int[]{0, 300, 1600, 2400},
            new int[]{0, 330, 1600, 2400}, new int[]{0, 330, 1600, 2400});

    /**reference to Papa John's on Green St.*/
    private Restaurant papaJohn = new Restaurant("Papa John's Pizza", "Pizza", "106 E Green St", new int[]{1100, 2300},
            new int[]{1100, 2300}, new int[]{1100, 2300}, new int[]{1100, 2300}, new int[]{1100, 2400}, new int[]{1100, 2400}, new int[]{1100, 2300});

    /**reference to Maize on Green St.*/
    private Restaurant maize = new Restaurant("Maize Mexican Grill", "Mexican", "60 E Green St", new int[]{1100, 2400},
            new int[]{0, 230, 1100, 2400}, new int[]{0, 230, 1100, 2400}, new int[]{0, 230, 1100, 2400}, new int[]{0, 230, 1100, 2400},
            new int[]{0, 230, 1100, 2400}, new int[]{0, 230, 1100, 2100});

    /**reference to Dominos on Green St.*/
    private Restaurant dominos = new Restaurant("Domino's Pizza", "Pizza", "55 E Green St", new int[]{1100, 2300},
            new int[]{1100, 2300}, new int[]{1100, 2300}, new int[]{1100, 2300}, new int[]{1100, 2400}, new int[]{1100, 2400}, new int[]{1100, 2300});

    /**reference to Cracked on Green St.*/
    private Restaurant cracked = new Restaurant("Cracked the Egg Came First", "Pizza", "619 E Green St", new int[]{800, 1400},
            new int[]{800, 1400}, new int[]{800, 1400}, new int[]{800, 1400}, new int[]{800, 1400}, new int[]{800, 1400}, new int[]{800, 1400});

    /**An array of all of the restaurants on green street*/
    private Restaurant[] allRestaurants;

    /**an instance of Random.*/
    private Random r = new Random();

    /**a list of all of the OPEN restaurants on green st*/
    private List<Restaurant> openRestaurants = new ArrayList<>();

    /**a list of restaurants that the user does not like*/
    private List<Restaurant> unlikedRestaurants = new ArrayList<>();

    /**Constructor for the class.
     * this is where the array of restaurants is filled.*/
    public UIUCRestaurants() {
        allRestaurants = new Restaurant[]{pandaExpress, sakanaya, spoonhouse, midSummerLounge, aRiRang, sigGrill, noodles, chipotle, bangkok,
        zorbas, jurassicGrill, jerusalem, cravings, ambarIndia, sushiIchiban, subway, mcdonalds, jipbap, ozuRamen, parisSuperCrepes, pokelab,
                spicyTang, tacoBell, miaZas, howdy, sushiRock, phoCafe, potbelly, pizzaHut, burritoKingMexicanGrill, boBoChina, laiLaiWok,
                bombayIndianGrill, fourBreakfast, shiquan, chopstix, papaJohn, maize, dominos, cracked};
    }

    /**updates the openRestaurants list with all of the restaurants that are currently open
     * and are not disliked by the user
     * @param day the current day of the week.
     * @param time the current time of day.*/
    public void getOpenRestaurants(String day, int time) {
        List<Restaurant> temp = new ArrayList<>();
        for (int i = 0; i < allRestaurants.length; i++) {
            if (allRestaurants[i].isOpen(day, time) && !(isUnlikedRestaurant((allRestaurants[i])))) {
                temp.add(allRestaurants[i]);
            }
        }
        openRestaurants = temp;
    }

    /**a function that gets a random restaurant.
     * @return a random restaurant from the openRestaurants list.*/
    public Restaurant getRandomRestaurant() {
        if (openRestaurants.size() == 0) {
            return new Restaurant("Nothing is Open");
        }
        int index = r.nextInt(openRestaurants.size());
        return openRestaurants.get(index);
    }

    /**gets the openRestaurants list.
     * @return openRestaurants*/
    public List<Restaurant> getOpenRestaurantsList() {
        return openRestaurants;
    }

    /**gives the number of restaurants open.
     * @return the size of openRestaurants.*/
    public int getListSize() {
        return openRestaurants.size();
    }

    /**adds a restaurant to the list of unlikedRestaurants.*/
    public void newUnlikedRestaurant(Restaurant r) {
        unlikedRestaurants.add(r);
    }

    /**tells whether a restaurant is unliked or not.
     * @return true if the restaurant is unliked.*/
    private boolean isUnlikedRestaurant(Restaurant r) {
        for (int i = 0; i < unlikedRestaurants.size(); i++) {
            if (r.rEquals(unlikedRestaurants.get(i))) {
                return true;
            }
        }

        return false;
    }

    /**gets rid of all instances of a restaurant from unlikedRestaurants.*/
    public void undoDislike(Restaurant r) {
        for (int i = (unlikedRestaurants.size() - 1); i >= 0; i--) {
            if (r.rEquals(unlikedRestaurants.get(i))) {
                unlikedRestaurants.remove(i);
            }
        }
    }

}
