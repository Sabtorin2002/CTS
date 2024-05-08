package clase;

public class Solicitata implements AbstractState{
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }

    protected Solicitata() {
    }
}
