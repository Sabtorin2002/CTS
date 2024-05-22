package main;

import clase.Persoana;
import clase.Proxy;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare=new Persoana("Andrei",3);
        rezervare.faceRezervare();

        Rezervare rezervare1=new Proxy(rezervare);
        rezervare1.faceRezervare();

        Rezervare rezervare2=new Persoana("Robert",7);
        Rezervare rezervare3=new Proxy(rezervare2);
        rezervare3.faceRezervare();
    }
}