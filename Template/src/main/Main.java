package main;

import clase.Rezervare;
import clase.Template;

public class Main {
    public static void main(String[] args) {
        Template rezervare=new Rezervare("Andrei");
        rezervare.rezervareMasaRestaurant();

        Template rezervare1=new Rezervare("Ana");
        rezervare1.rezervareMasaRestaurant();
    }
}