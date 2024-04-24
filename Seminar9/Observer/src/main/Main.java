package main;

import observer.Client;
import subiect.Autobuz;
import subiect.Subject;
import subiect.Tramvai;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Andrei");
        Client client2 = new Client("Bogdan");
        Subject tramvai = new Tramvai(41);
        tramvai.abonareObserver(client);
        tramvai.abonareObserver(client2);
        tramvai.anuntaPlecare();
        //tramvai.dezabonareObservable(client);
        Client client3=new Client("Laurentiu");
        tramvai.abonareObserver(client3);
        tramvai.anuntaPlecare();

        Subject autobuz = new Autobuz();
        autobuz.abonareObserver(client);
        autobuz.abonareObserver(client3);
        autobuz.anuntaPlecare();
        ((Autobuz)autobuz).anuntaDeviereTraseu();
    }
}