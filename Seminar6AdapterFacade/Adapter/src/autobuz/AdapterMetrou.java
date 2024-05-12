package autobuz;

import metrou.Calatorie;

public class AdapterMetrou extends CardStb{
    private Calatorie calatorie;



    public AdapterMetrou(Calatorie calatorie) {
        super(calatorie.getNumeClient(), null);
        this.calatorie = calatorie;
    }

    @Override
    public void validareCard() {
        if (calatorie.estePermisAccesul()){
            System.out.println("Calatorie placuta!");
        }else{
            System.out.println("Fonduri insufieciente");
        }
    }
}
