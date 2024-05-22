package subiect;

public class Restaurant extends Subiect{

    @Override
    public void anuntaOferta() {
        super.notificareObservers("Oferta noua!");
    }
}
