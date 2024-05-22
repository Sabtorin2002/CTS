package clase;

import java.nio.file.attribute.UserPrincipalNotFoundException;

public class Item implements Meniu{
    private String nume;

    private float suma;

    public Item(String nume, float suma) {
        this.nume = nume;
        this.suma = suma;
    }

    public String getNume() {
        return nume;
    }

    public float getSuma() {
        return suma;
    }

    @Override
    public void adaugaMeniu(Meniu meniu) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeMeniu(Meniu meniu) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Meniu getMeniu(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare+"Acest "+nume+" are pretul de "+suma+"RON.");
    }

    @Override
    public float totalPlata() {
        return suma;
    }
}
