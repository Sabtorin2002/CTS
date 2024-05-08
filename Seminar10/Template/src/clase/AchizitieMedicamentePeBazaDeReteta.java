package clase;

public class AchizitieMedicamentePeBazaDeReteta extends Template{
    private String numeMedicament;

    public AchizitieMedicamentePeBazaDeReteta(String numeMedicament) {
        super();
        this.numeMedicament = numeMedicament;
    }

    protected String getNumeMedicament() {
        return numeMedicament;
    }

    @Override
    protected void primireReteta() {
        System.out.println("Am primit reteta pentru "+ getNumeMedicament());
    }

    @Override
    protected boolean verifcareStoc() {
        return super.stocuri.containsKey(numeMedicament);
    }

    @Override
    protected void incaseaza() {
        System.out.println("Am incasat banii pentru medicamentul "+ getNumeMedicament());
    }

    @Override
    protected void aduceMedicamente() {
        System.out.println("Medicamentul "+getNumeMedicament()+"este adus din depozit");
        if(super.stocuri.get(numeMedicament)>1){
            super.stocuri.replace(numeMedicament,super.stocuri.get(numeMedicament)-1);
        }else{
            super.stocuri.remove(numeMedicament);
        }
    }

    @Override
    protected void emiteBon() {
        System.out.println("S-a emis bonul pentru medicamentul "+ getNumeMedicament());
    }

    @Override
    protected void respingeAchizitia() {
        System.out.println("S-a resping achitzita.");
    }
}
