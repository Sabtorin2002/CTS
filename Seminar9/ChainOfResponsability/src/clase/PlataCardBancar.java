package clase;

public class PlataCardBancar extends ModDePlata{
    private double sold;

    public PlataCardBancar(double sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(double pret) {
        if(sold>=pret){
        System.out.println("S-a efectuat plata in valoare de "+ pret+" RON cu cardul bancar.");
            sold=sold-pret;
        }
        else{
            super.succesor.plateste(pret);
        }
    }
}
