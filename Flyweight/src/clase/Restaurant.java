package clase;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private Map<String,Flyweight>listaClienti;

    public Restaurant() {
        this.listaClienti=new HashMap<>();
    }
    public Flyweight getClient(String nume, String numarTelefon){
        if (!listaClienti.containsKey(nume)){
            listaClienti.put(nume,new Client(nume,numarTelefon));
        }
        return listaClienti.get(nume);
    }

    public Flyweight getClient(String nume){
        if(listaClienti.containsKey(nume)){
            return listaClienti.get(nume);
        }else {
            throw new UnsupportedOperationException("Clientul nu exista.");
        }
    }
}
