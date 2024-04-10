package clase;

public class Bilet implements BiletAbstract{
    private float pret;
    private String cod;

    public Bilet(float pret, String cod) {
        this.pret = pret;
        this.cod = cod;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public float getPret() {
        return pret;
    }

    @Override
    public void printareBilet() {
        System.out.println("Pretul biletului este "+ pret+" RON.Cu codul "+ cod+".");
    }
}
