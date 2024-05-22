package clase;

public class Restaurant {
    private Stare stare;
    private String numeRestaurant;

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.stare=new Libera();
    }

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public void rezervaMasa(){
        if(stare instanceof Libera){
            System.out.println("Masa a fost rezervata!");
            Stare rezervata=new Rezervata();
            rezervata.schimbaStare(this);
        }else {
            System.out.println("Masa a fost deja rezervata!");
        }
    }

    public void ocupaMasa(){
        if(stare instanceof Rezervata || stare instanceof Libera){
            System.out.println("Masa a fost ocupata");
            Stare ocupata=new Ocupata();
            ocupata.schimbaStare(this);
        }else {
            System.out.println("Masa a fost deja rezervata");
        }
    }

    public void renuntaMasa(){
        if (stare instanceof Ocupata){
            System.out.println("Masa a fost eliberata");
            Stare libera=new Libera();
            libera.schimbaStare(this);
        }
    }
}
