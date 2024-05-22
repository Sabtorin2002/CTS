package clase;

public class Persoana implements Rezervare{
    private String numePersoana;
    private int nrLocuri;

    public Persoana(String numePersoana, int nrLocuri) {
        this.numePersoana = numePersoana;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void faceRezervare() {
        System.out.println(numePersoana+" a facut rezervare pentru "+nrLocuri+" persoane.");
    }

    public String getNumePersoana() {
        return numePersoana;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }
}
