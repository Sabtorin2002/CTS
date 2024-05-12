package metrou;

public abstract class Calatorie {
    protected String numeClient;

    public Calatorie(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public abstract boolean estePermisAccesul();
}
