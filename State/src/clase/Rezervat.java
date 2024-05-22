package clase;

public class Rezervat implements Stare{
    @Override
    public void schimbaStare(Loc loc) {
        loc.setStare(this);
    }

    protected Rezervat() {
    }
}
