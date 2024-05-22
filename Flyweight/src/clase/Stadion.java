package clase;

import java.util.HashMap;
import java.util.Map;

public class Stadion {
    private String nume;
    private Map<String, Flyweight>spectatori;

    public Stadion(String nume) {
        this.nume = nume;
        this.spectatori=new HashMap<>();
    }

    public Flyweight getSpectator(float inaltime, float latime, String nume){
        if(!spectatori.containsKey(nume)){
            spectatori.put(nume, new Dimensiune(inaltime,latime,nume));
        }
        return spectatori.get(nume);
    }

    public Flyweight getSpectator(String nume){
        if(spectatori.containsKey(nume)){
            return spectatori.get(nume);
        }else {
            throw new UnsupportedOperationException("Clientul nu exista.");
        }
    }


}
