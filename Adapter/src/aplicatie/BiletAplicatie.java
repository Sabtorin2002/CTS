package aplicatie;

public abstract class BiletAplicatie {
    private String nume;

    public BiletAplicatie(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public abstract boolean arePermisAccesul();
}
