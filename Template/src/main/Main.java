package main;

import clase.MatchDay;
import clase.Template;

public class Main {
    public static void main(String[] args) {
        Template meci = new MatchDay("Andrei","Otelul");
        meci.mergeLaMeci();

        Template meci2=new MatchDay("Laurentiu","Stadion Otelul");
        meci2.mergeLaMeci();
    }
}