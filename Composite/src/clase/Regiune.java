package clase;

public interface Regiune {
    void adaugaRegiune(Regiune regiune);
    void stergeRegiune(Regiune regiune);
    Regiune getIndex(int index);
    int getNumarLocuri();
    void afiseaza(String indentare);

}
