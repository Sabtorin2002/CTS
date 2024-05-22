package clase;

public class Bilet implements Tiparibil{
    private float pret;
    private String nume;

    public Bilet(float pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    @Override
    public void printareBilet() {
        System.out.println("Biletul pe numele "+ nume+" a fost tiparit.Biletul este in valoare de "+pret+" RON.");
    }
}
