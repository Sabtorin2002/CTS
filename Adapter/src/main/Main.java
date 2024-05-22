package main;

import aplicatie.Bilet;
import aplicatie.BiletAplicatie;
import eBilet.AdapterBiletAplicatie;
import eBilet.BiletOnline;
import eBilet.Ticket;

public class Main {
    public static void validareBiletOnline(BiletOnline biletOnline){
        biletOnline.cumparareBiletOnline();
    }

    public static void validareBiletAplicatie(BiletAplicatie biletAplicatie){
        if(biletAplicatie.arePermisAccesul()){
            System.out.println("Vizioanare placuta!");
        }else {
            System.out.println("Ne pare rau!");
        }
    }
    public static void main(String[] args) {
        BiletAplicatie biletAplicatie=new Bilet("Andrei",60);
        validareBiletAplicatie(biletAplicatie);
        validareBiletAplicatie(biletAplicatie);

        BiletOnline biletOnline=new AdapterBiletAplicatie(biletAplicatie);
        validareBiletOnline(biletOnline);
    }
}