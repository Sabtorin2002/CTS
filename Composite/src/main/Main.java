package main;

import clase.Regiune;
import clase.Sectiune;
import clase.Subsectiune;

public class Main {
    public static void main(String[] args) {
        Regiune peluzaNord=new Subsectiune("Peluza Nord",230);
        Regiune peluzaSud=new Subsectiune("Peluza Sud",83);

        Regiune peluza=new Sectiune(300,"Peluza");
        peluza.adaugaRegiune(peluzaNord);
        peluza.adaugaRegiune(peluzaSud);
        peluza.afiseaza("   ");
        System.out.println(peluza.getNumarLocuri());
    }
}