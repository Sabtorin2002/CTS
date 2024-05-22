package main;

import clase.Pozitie;
import clase.Stadion;

public class Main {
    public static void main(String[] args) {
        Stadion stadion=new Stadion("Otelul");
        Pozitie pozitie1=new Pozitie(1,"rosu");
        Pozitie pozitie2=new Pozitie(2,"albastru");

        stadion.getSpectator(1.7f,0.4f,"Gigel");
        stadion.getSpectator("Gigel").afiseaza(pozitie1);
        stadion.getSpectator("Gigel").afiseaza(pozitie2);
        //stadion.getSpectator("Marius");
    }
}