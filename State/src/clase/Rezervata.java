package clase;

public class Rezervata implements Stare{

    protected Rezervata() {
    }

    @Override
    public void schimbaStare(Restaurant restaurant) {
        restaurant.setStare(this);
    }
}
