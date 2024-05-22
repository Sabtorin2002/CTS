package main;

import clase.Item;
import clase.Meniu;
import clase.Sectiune;
import clase.Subsectiune;

public class Main {
    public static void main(String[] args) {
        Meniu apaPlata=new Item("Apa Plata",9);
        Meniu apaMinerala=new Item("Apa Minerala",9);

        Meniu apa=new Subsectiune("Apa");
        apa.adaugaMeniu(apaPlata);
        apa.adaugaMeniu(apaMinerala);
        apa.afiseaza("  ");
        System.out.println(apa.totalPlata());

        Meniu limonada=new Item("Limonada",20);
        Meniu freshPortocale=new Item("Fresh Portocale",18);

        Meniu sucuri=new Subsectiune("Sucuri");
        sucuri.adaugaMeniu(limonada);
        sucuri.adaugaMeniu(freshPortocale);
        sucuri.afiseaza("   ");
        System.out.println(sucuri.totalPlata());

        Meniu deBaut=new Sectiune("Hidratante");
        deBaut.adaugaMeniu(sucuri);
        deBaut.adaugaMeniu(apa);
        deBaut.afiseaza("   ");
        System.out.println(deBaut.totalPlata());
    }
}