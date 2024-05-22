package clase;

public class Dimensiune implements Flyweight{
    private float inaltime;
    private float latime;
    private String nume;

    public Dimensiune(float inaltime, float latime, String nume) {
        this.inaltime = inaltime;
        this.latime = latime;
        this.nume = nume;
    }

    public float getInaltime() {
        return inaltime;
    }

    public float getLatime() {
        return latime;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void afiseaza(Pozitie pozitie) {
        System.out.println("Spectatorul cu numele "+ nume+ " are inaltimea spectatorului este "
                +inaltime+" si latimea este "+latime+pozitie.toString());
    }
}
