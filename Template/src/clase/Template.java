package clase;

import java.util.HashMap;
import java.util.Map;

public abstract class Template {
    protected Map<String,Integer>rezervari;

    public Template() {
        this.rezervari=new HashMap<>();
        rezervari.put("Andrei",4);
        rezervari.put("Laurentiu",2);
    }

    protected abstract boolean verificaPersoana();
    protected abstract void curataMasa();
    protected abstract void asazaServetelele();
    protected abstract void asazaTacamurile();
    protected abstract void invitaPersoaneleLaMasa();

    public final void rezervareMasaRestaurant(){
        if(verificaPersoana()){
        curataMasa();
        asazaServetelele();
        asazaTacamurile();
        invitaPersoaneleLaMasa();
        }
    }
}
