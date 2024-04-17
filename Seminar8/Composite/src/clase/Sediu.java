package clase;

public interface Sediu {
    void adaugaSediu(Sediu sediu);
    void stergeSediu(Sediu sediu);

    Sediu getSediu(int index);

    void afiseaza(String indentare);
    int calculeazaNrAngajati();
}
