package subiect;

public class SalaSportFotbal extends Subiect{
    @Override
    public void anuntareMeci() {
        super.notificareObservers("MATCHDAY!");
    }

    @Override
    public void anuntaSport() {
        super.notificareObservers("Fotbal");
    }

}
