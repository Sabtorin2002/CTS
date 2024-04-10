package main;

import clase.*;

public class Main {
    public static void main(String[] args) {

        BiletAbstract bilet = new Bilet(30,"AAZZ");
        printare(bilet);
        System.out.println("--------------");

        Decorator decorator1 = new BiletSarbatori(bilet);
        decorator1.reducerePret();
        printare(decorator1);
        System.out.println("-----------------");

        Decorator decorator2 = new BiletAniversare(bilet);
        decorator2.reducerePret();
        printare(decorator2);
        System.out.println("--------------");

        Decorator decorator3 = new BiletAniversare(decorator1);
        printare(decorator3);
    }

    public static void printare(BiletAbstract bilet){
        bilet.printareBilet();
    }
}
