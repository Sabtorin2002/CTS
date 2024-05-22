package main;

import observer.Client;
import observer.Observer;
import subiect.Restaurant;
import subiect.Subiect;

public class Main {
    public static void main(String[] args) {
        Observer client=new Client("Andrei");
        Observer client2=new Client("Laurentiu");
        Subiect restaurant=new Restaurant();
        restaurant.abonareObserver(client);
        restaurant.abonareObserver(client2);
        restaurant.anuntaOferta();
    }
}