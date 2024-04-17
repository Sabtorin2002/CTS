package clase;

public class Cont {
    private int nrCont;
    private float suma;

    public Cont(int nrCont, float suma) {
        this.nrCont = nrCont;
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "nrCont=" + nrCont +
                ", suma=" + suma +
                '}';
    }
}
