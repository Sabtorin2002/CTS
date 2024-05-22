package clase;

public abstract class Decorator implements Tiparire{

    protected Tiparire tiparire;

    protected Decorator(Tiparire tiparire) {
        this.tiparire = tiparire;
    }

}
