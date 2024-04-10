package clase;

public class BiletSarbatori extends Decorator{
    private static double discount = 0.1;
    public BiletSarbatori(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printareBilet() {
        bilet.printareBilet();
        System.out.println("Sarbotri Fericite!");
    }

    @Override
    public void reducerePret() {
        int pret = (int) (((Bilet)bilet).getPret() - (discount * ((Bilet) bilet).getPret()));
        ((Bilet)bilet).setPret(pret);
    }
}
