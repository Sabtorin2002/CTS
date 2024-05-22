package clase;

public class Masa implements Tiparire{

    private String numeRestaurant;
    private float suma;

    public Masa(String numeRestaurant, float suma) {
        this.numeRestaurant = numeRestaurant;
        this.suma = suma;
    }
    @Override
    public void tiparireMesaj() {
        System.out.println("La restaurantul "+numeRestaurant+" aveti de plata "+suma+" RON.");
    }
}
