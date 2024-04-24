package subiect;

public class Tramvai extends Subject{
    private int nrLinie;

    public Tramvai(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    public void anuntaPlecare() {
        super.notificareObservers("Tramvaiul de pe linia "+this.nrLinie+" pleaca de la capat.");
    }
}
