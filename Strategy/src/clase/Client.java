package clase;

public class Client {
    private ModDePlata modDePlata;
    private String nume;

    public ModDePlata getModDePlata() {
        return modDePlata;
    }

    public void setModDePlata(ModDePlata modDePlata) {
        this.modDePlata = modDePlata;
    }

    public Client(ModDePlata modDePlata, String nume) {
        this.modDePlata = modDePlata;
        this.nume = nume;
    }
    public void efectueazaPlata(){
        modDePlata.plateste();
    }
}
