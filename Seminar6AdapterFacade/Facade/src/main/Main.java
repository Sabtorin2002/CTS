package main;

import clase.Autobuz;
import clase.FacadeAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz();
        System.out.println("Fara facade");
        autobuz.inchideUsaDinFata();
        autobuz.inchideUsaDinMijloc();
        autobuz.inchideUsaDinSpate();
        autobuz.dechideUsaDinFata();
        autobuz.dechideUsaDinMijloc();
        autobuz.dechideUsaDinSpate();

        System.out.println("--------------------------");
        System.out.println("Cu facade");
        FacadeAutobuz facadeAutobuz=new FacadeAutobuz(autobuz);
        facadeAutobuz.inchideToateUsile();
        facadeAutobuz.deschideToateUsile();
    }
}