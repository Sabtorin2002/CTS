package main;

import clase.Spectator;
import clase.SpectatorAbstract;
import clase.VanzareBilet;

public class Main {
    public static void main(String[] args) {
        SpectatorAbstract spectator=new Spectator(25,"Laurentiu","peluza");
        spectator.vindeBilet("Steaua-Dinamo");

        SpectatorAbstract spectator1=new VanzareBilet(spectator);
        spectator1.vindeBilet("Otelul-CFR");

        SpectatorAbstract spectator2=new Spectator(12,"Laur","peluza");
        SpectatorAbstract spectator3=new VanzareBilet(spectator2);
        //spectator2.vindeBilet("Steaua-Dinamo");
        spectator3.vindeBilet("Steaua-Dinamo");
    }
}