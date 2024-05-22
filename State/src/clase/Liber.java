package clase;

public class Liber implements Stare{
    @Override
    public void schimbaStare(Loc loc) {
        loc.setStare(this);
    }

    protected Liber() {
    }
}
