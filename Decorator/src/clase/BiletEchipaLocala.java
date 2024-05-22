package clase;

public class BiletEchipaLocala extends Decorator{
    public BiletEchipaLocala(Tiparibil bilet) {
        super(bilet);
    }

    @Override
    public void printareBilet() {
        super.bilet.printareBilet();
        System.out.println("HAI OTELUL!");
    }
}
