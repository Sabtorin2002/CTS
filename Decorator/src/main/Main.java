package main;

import clase.Decorator;
import clase.Masa;
import clase.NotaDePlata;
import clase.Tiparire;

public class Main {
    public static void main(String[] args) {
        Tiparire masa1=new Masa("Acquarello",271.2f);
        masa1.tiparireMesaj();

        Decorator decorator=new NotaDePlata(masa1);
        decorator.tiparireMesaj();
    }
}