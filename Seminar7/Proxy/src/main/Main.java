package main;

import clase.Autobuz;
import clase.AutobuzAbstract;
import clase.AutobuzDeNoapte;
import clase.AutobuzProtest;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AutobuzAbstract autobuz = new Autobuz(11,330,"Mihai");
        autobuz.opresteInStatie("Piata Romana");

        AutobuzAbstract autobuz1 = new AutobuzDeNoapte(autobuz);
        autobuz1.opresteInStatie("Giuseppe Verdi");

        AutobuzAbstract autobuz2 = new Autobuz(0,131,"Andrei");
        AutobuzAbstract autobuz3= new AutobuzDeNoapte(autobuz2);
        autobuz2.opresteInStatie("Dristor");
        autobuz3.opresteInStatie("Dristor");


        AutobuzProtest autobuzProtest = new AutobuzProtest(autobuz);
        autobuzProtest.adaugaStatieInterzisa("Dristor");
        autobuzProtest.adaugaStatieInterzisa("Nicolae Grigorescu");

        autobuzProtest.opresteInStatie("Dristor");
    }
}