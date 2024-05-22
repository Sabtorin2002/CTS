package clase;

public class Spectator implements SpectatorAbstract {
    private int varsta;
    private String nume;
    private String zona;

    public Spectator(int varsta, String nume, String zona) {
        this.varsta = varsta;
        this.nume = nume;
        this.zona = zona;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getZona() {
        return zona;
    }

    @Override
    public void vindeBilet(String meci) {
        System.out.println("Biletul pentru meciul "+ meci+" a fost trimis catre "+nume+" in varsta de "+varsta+" de ani.");
    }
}
