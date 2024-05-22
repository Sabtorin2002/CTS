package clase;

public interface Meniu {
    void adaugaMeniu(Meniu meniu);
    void stergeMeniu(Meniu meniu);
    Meniu getMeniu(int index);

    void afiseaza(String indentare);
    float totalPlata();
}
