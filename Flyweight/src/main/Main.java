package main;

import clase.Masa;
import clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant=new Restaurant();
        Masa masa1=new Masa(1,4,"20:00");
        Masa masa2=new Masa(2,2,"20:15");
        Masa masa3=new Masa(7,10,"19:00");

        restaurant.getClient("Andrei","0755531290").rezerva(masa1);
        restaurant.getClient("Andrei").rezerva(masa2);
        //restaurant.getClient("Laurentiu").rezerva(masa3);
    }
}