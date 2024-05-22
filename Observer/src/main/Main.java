package main;

import observer.Abonat;
import observer.Observer;
import subiect.SalaSportFotbal;
import subiect.SalaSportVolei;
import subiect.Subiect;

public class Main {
    public static void main(String[] args) {
        Observer abonat=new Abonat("Vlad");
        Observer abonat2=new Abonat("Marcel");
        Subiect meciFotbal=new SalaSportFotbal();
        meciFotbal.abonareOberver(abonat);
        meciFotbal.abonareOberver(abonat2);
        meciFotbal.anuntareMeci();
        meciFotbal.anuntaSport();

        Observer abonat3=new Abonat("Larisa");
        Subiect meciVolei=new SalaSportVolei();
        meciVolei.abonareOberver(abonat3);
        meciVolei.anuntareMeci();
        meciVolei.anuntaSport();
    }
}