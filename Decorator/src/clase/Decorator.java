package clase;

public abstract class Decorator implements Tiparibil {
    protected Tiparibil bilet;

    public Decorator(Tiparibil bilet) {
        this.bilet = bilet;
    }

}
