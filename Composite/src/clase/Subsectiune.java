package clase;

public class Subsectiune implements Regiune{
    private String numeSubsectiune;
    private int nrSpectaori;

    public Subsectiune(String numeSubsectiune, int nrSpectaori) {
        this.numeSubsectiune = numeSubsectiune;
        this.nrSpectaori = nrSpectaori;
    }

    @Override
    public void adaugaRegiune(Regiune regiune) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeRegiune(Regiune regiune) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Regiune getIndex(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getNumarLocuri() {
        return nrSpectaori;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare+"Subsectiunea "+numeSubsectiune+" are "+nrSpectaori+" spectatori.");
    }
}
