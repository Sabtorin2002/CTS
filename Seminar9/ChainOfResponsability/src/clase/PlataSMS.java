package clase;

public class PlataSMS extends ModDePlata{
    private double credit;

    public PlataSMS(double credit) {
        this.credit = credit;
    }

    @Override
    public void plateste(double pret) {
        if(credit>=pret){
            System.out.println("S-a efectuat plata in valoare de "+ pret+" RON cu prin SMS.");
            credit-=pret;
        }else{
            super.succesor.plateste(pret);
        }
    }
}
