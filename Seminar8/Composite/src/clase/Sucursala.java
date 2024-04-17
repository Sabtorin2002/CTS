package clase;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements Sediu{
    private List<Sediu> listaSedii;
    private String nume;
    private int nrProgramatori;

    public Sucursala(String nume, int nrProgramatori) {
        this.nume = nume;
        this.nrProgramatori = nrProgramatori;
        this.listaSedii=new ArrayList<>();
    }

    @Override
    public void adaugaSediu(Sediu sediu) {
        this.listaSedii.add(sediu);
    }

    @Override
    public void stergeSediu(Sediu sediu) {
        this.listaSedii.remove(sediu);
    }

    @Override
    public Sediu getSediu(int index) {
        return this.listaSedii.get(index);
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare+ "Sucursala cu numele "+nume+" are "+nrProgramatori+" programatori la urmatoarele sedii:");
        for(Sediu sediu:listaSedii){
            sediu.afiseaza(indentare+"    ");
        }
    }

    @Override
    public int calculeazaNrAngajati() {
        int nrAngajati=nrProgramatori;
        for(Sediu sediu:listaSedii){
            nrAngajati+=sediu.calculeazaNrAngajati();
        }
        return nrAngajati;
    }
}
