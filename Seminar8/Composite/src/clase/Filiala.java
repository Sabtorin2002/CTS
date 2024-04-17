package clase;

public class Filiala implements Sediu{
    private int nrAngajati;
    private String numeFiliala;

    public Filiala(int nrAngajati, String numeFiliala) {
        this.nrAngajati = nrAngajati;
        this.numeFiliala = numeFiliala;
    }

    @Override
    public void adaugaSediu(Sediu sediu) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeSediu(Sediu sediu) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Sediu getSediu(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare+"Filiala "+ numeFiliala+" are "+ nrAngajati+" angajati.");
    }

    @Override
    public int calculeazaNrAngajati() {
        return nrAngajati;
    }
}
