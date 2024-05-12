package autobuz;

import java.util.GregorianCalendar;

public class AbonamentCardCalatorii extends CardStb{
    private GregorianCalendar dataExpirareAbonament;

    public AbonamentCardCalatorii(String numeClient, String cnpClient, GregorianCalendar dataExpirareAbonament) {
        super(numeClient, cnpClient);
        this.dataExpirareAbonament = dataExpirareAbonament;
    }

    @Override
    public void validareCard() {
        if(this.dataExpirareAbonament.before(new GregorianCalendar())){
            System.out.println("Calatorie placuta");
        }else {
            System.out.println("Abonamentul a expirat");
        }
    }
}
