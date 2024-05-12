package metrou;

import java.util.GregorianCalendar;

public class AbonamentMetrou extends Calatorie{
    private GregorianCalendar dataExpirareAbonament;

    public AbonamentMetrou(String numeClient, GregorianCalendar dataExpirareAbonament) {
        super(numeClient);
        this.dataExpirareAbonament = dataExpirareAbonament;
    }



    @Override
    public boolean estePermisAccesul() {
        return dataExpirareAbonament.before(new GregorianCalendar());
    }
}
