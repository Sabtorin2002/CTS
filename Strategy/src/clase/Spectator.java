package clase;

public class Spectator {
    private String nume;
    private ModDeVerificare modDeVerificare;

    public Spectator(String nume, ModDeVerificare modDeVerificare) {
        this.nume = nume;
        this.modDeVerificare = modDeVerificare;
    }

    public ModDeVerificare getModDeVerificare() {
        return modDeVerificare;
    }

    public void setModDeVerificare(ModDeVerificare modDeVerificare) {
        this.modDeVerificare = modDeVerificare;
    }

    public void esteVerificat(){
        modDeVerificare.verifica();
    }
}
