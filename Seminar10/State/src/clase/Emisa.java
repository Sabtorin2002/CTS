package clase;

public class Emisa implements AbstractState{
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }

    protected Emisa() {
    }
}
