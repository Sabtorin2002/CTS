package main;

import clase.Bilet;
import clase.BiletEchipaLocala;
import clase.Decorator;
import clase.Tiparibil;

public class Main {
    public static void main(String[] args) {
        Tiparibil bilet=new Bilet(25,"Andrei");
        bilet.printareBilet();

        Decorator decorator=new BiletEchipaLocala(bilet);
        decorator.printareBilet();

    }
}