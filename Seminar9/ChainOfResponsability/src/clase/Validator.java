package clase;

public class Validator {
    private int numarAutobuz;
    private ModDePlata modDePlata;

    public Validator(int numarAutobuz) {
        this.numarAutobuz = numarAutobuz;

        modDePlata=new PlataCardCalatorii(2);
        ModDePlata cardBancar=new PlataCardBancar(4);
        modDePlata.setSuccesor(cardBancar);
        ModDePlata plataSMS=new PlataSMS(3);
        cardBancar.setSuccesor(plataSMS);
        ModDePlata controlor=new Controlor();
        plataSMS.setSuccesor(controlor);
    }

    public ModDePlata getModDePlata() {
        return modDePlata;
    }

    public void efectueazaPlata(float pret){
        modDePlata.plateste(pret);
    }
}

