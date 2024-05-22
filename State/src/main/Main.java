package main;

import clase.Loc;

public class Main {
    public static void main(String[] args) {
        Loc loc = new Loc("Andrei", 35f);
        loc.rezervaLoc();
        loc.ocupaLoc();
        loc.ocupaLoc();
        loc.renuntaLoc();
        loc.ocupaLoc();
        loc.ocupaLoc();
        loc.renuntaLoc();
        loc.ocupaLoc();
        loc.renuntaLoc();
    }
}