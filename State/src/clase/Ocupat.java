package clase;

public class Ocupat implements Stare{
    @Override
    public void schimbaStare(Loc loc) {
        loc.setStare(this);
    }

    protected Ocupat() {
    }
}
