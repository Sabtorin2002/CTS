package clase;

public class NotaDePlata extends Decorator{

    public NotaDePlata(Tiparire tiparire) {
        super(tiparire);
    }

    @Override
    public void tiparireMesaj() {
        tiparire.tiparireMesaj();
        System.out.println("La multi ani!");
    }
}
