package aplicatie;

public class Bilet extends BiletAplicatie{
    private float sold;
    private static float pretBilet=35;

    public Bilet(String nume, float sold) {
        super(nume);
        this.sold = sold;
    }

    @Override
    public boolean arePermisAccesul() {
        if((this.sold-pretBilet)>=0){
            this.sold-=pretBilet;
            return true;
        }else {
            return false;
        }
    }
}
