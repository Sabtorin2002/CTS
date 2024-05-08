package clase;

public class Achizitionata implements AbstractState{
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }

    protected Achizitionata() {
    }
}
