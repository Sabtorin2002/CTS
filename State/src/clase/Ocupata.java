package clase;

public class Ocupata implements Stare{

    protected Ocupata() {
    }

    @Override
    public void schimbaStare(Restaurant restaurant) {
        restaurant.setStare(this);
    }
}
