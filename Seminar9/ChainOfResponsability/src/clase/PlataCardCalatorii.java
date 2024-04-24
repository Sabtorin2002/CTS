package clase;

public class PlataCardCalatorii extends ModDePlata{
    private int nrCalatorii;

    public PlataCardCalatorii(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void plateste(double pret) {
        if(nrCalatorii>0){
            System.out.println("S-a efectuat plata in valoare de "+ pret+" RON cu cardul de calatorii.");
            nrCalatorii-=1;
        }
        else{
            super.succesor.plateste(pret);
        }
    }
}
