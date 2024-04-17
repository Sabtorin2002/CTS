package clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Sediu{
    private List<Sediu>listaSedii;
    private String nume;
    private int nrOperatori;

    public Agentie(String nume, int nrOperatori) {
        this.nume = nume;
        this.nrOperatori = nrOperatori;
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
        System.out.println(indentare+ "Agentia cu numele "+nume+" are "+nrOperatori+" operatori la urmatoarele sedii:");
        for(Sediu sediu:listaSedii){
            sediu.afiseaza(indentare+"    ");
        }
    }

    @Override
    public int calculeazaNrAngajati() {
        int nrAngajati=nrOperatori;
        for(Sediu sediu:listaSedii){
            nrAngajati+=sediu.calculeazaNrAngajati();
        }

        return nrAngajati;
    }
}
