package subiect;

public class SalaSportVolei extends Subiect{
    @Override
    public void anuntareMeci() {
        super.notificareObservers("MATCHDAY!");
    }

    @Override
    public void anuntaSport() {
        super.notificareObservers("Volei");
    }

}
