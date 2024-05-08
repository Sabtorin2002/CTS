package main;

import clase.AchizitieMedicamentePeBazaDeReteta;

public class Main {
    public static void main(String[] args) {
        AchizitieMedicamentePeBazaDeReteta achizitie = new AchizitieMedicamentePeBazaDeReteta("Vizik");
        achizitie.cumparaMedicament();

        AchizitieMedicamentePeBazaDeReteta achizitie1=new AchizitieMedicamentePeBazaDeReteta("Nurofen");
        achizitie1.cumparaMedicament();
    }
}
