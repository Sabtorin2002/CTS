package clase;

public class Masa {
    private int nrMasa;
    private int nrPersoane;
    private String oraRezervare;

    public Masa(int nrMasa, int nrPersoane, String oraRezervare) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "nrMasa=" + nrMasa +
                ", nrPersoane=" + nrPersoane +
                ", oraRezervare='" + oraRezervare + '\'' +
                '}';
    }
}
