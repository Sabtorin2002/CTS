package main;

import clase.Peluza;
import clase.Spectator;
import clase.Tribuna;
import clase.TribunaVIP;

public class Main {
    public static void main(String[] args) {
        Spectator spectator=new Spectator("Andrei",new Peluza());
        spectator.esteVerificat();
        spectator.setModDeVerificare(new Tribuna());
        spectator.esteVerificat();
        spectator.setModDeVerificare(new TribunaVIP());
        spectator.esteVerificat();
    }
}