package main;

import clase.Reteta;

public class Main {
    public static void main(String[] args) {

        Reteta reteta = new Reteta(12,23.3f,45);

        reteta.cumparaMedicament();

        reteta.cereMedicamente();
        reteta.cumparaMedicament();
        reteta.respingeRetata();

        reteta.cereMedicamente();
        reteta.cumparaMedicament();




    }
}