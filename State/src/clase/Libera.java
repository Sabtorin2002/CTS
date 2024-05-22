package clase;

public class Libera implements Stare{
    protected Libera() {
    }

    @Override
    public void schimbaStare(Restaurant restaurant) {
        restaurant.setStare(this);
    }
}
