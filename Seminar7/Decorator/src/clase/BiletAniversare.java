package clase;

public class BiletAniversare extends Decorator{
    public BiletAniversare(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printareBilet() {
        bilet.printareBilet();
        System.out.println("La multi ani, STB!");
    }

    @Override
    public void reducerePret() {
        ((Bilet)bilet).setPret(0);
    }
}
