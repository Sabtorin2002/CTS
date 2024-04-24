package clase;

public class Validator {
    private int numarAutobuz;
    private ModDePlata modDePlata;

    public Validator(int numarAutobuz, ModDePlata modDePlata) {
        this.numarAutobuz = numarAutobuz;
        this.modDePlata = modDePlata;
    }

    public ModDePlata getModDePlata() {
        return modDePlata;
    }

    public void setModDePlata(ModDePlata modDePlata) {
        this.modDePlata = modDePlata;
    }

    public void efectueazaPlata(float pret){
        modDePlata.plateste(pret);
    }
}

