package main;

import clase.Restaurant;
import clase.Rezervata;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant=new Restaurant("Acquarello");
        restaurant.rezervaMasa();
        restaurant.ocupaMasa();
        restaurant.renuntaMasa();
        restaurant.ocupaMasa();
        restaurant.rezervaMasa();

    }
}