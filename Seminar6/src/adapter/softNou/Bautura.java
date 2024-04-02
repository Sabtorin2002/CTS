package adapter.softNou;

public class Bautura {
    private float pret;
    private String denumire;
    private float gradAlcool;

    public Bautura(float pret, String denumire, float gradAlcool) {
        this.pret = pret;
        this.denumire = denumire;
        this.gradAlcool = gradAlcool;
    }

    public float getPret() {
        return pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getGradAlcool() {
        return gradAlcool;
    }

    @Override
    public String toString() {
        return "Bautura{" +
                "pret=" + pret +
                ", denumire='" + denumire + '\'' +
                ", gradAlcool=" + gradAlcool +
                '}';
    }
}
