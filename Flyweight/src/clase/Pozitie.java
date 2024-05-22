package clase;

public class Pozitie {
    private int pozitie;
    private String culoareTricou;

    public Pozitie(int pozitie, String culoareTricou) {
        this.pozitie = pozitie;
        this.culoareTricou = culoareTricou;
    }

    @Override
    public String toString() {
        return "Pozitie{" +
                "pozitie=" + pozitie +
                ", culoareTricou='" + culoareTricou + '\'' +
                '}';
    }
}
