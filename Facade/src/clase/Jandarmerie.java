package clase;

import java.util.HashMap;
import java.util.Map;

public class Jandarmerie {
    private Bilet bilet;

    public Jandarmerie(Bilet bilet) {
        this.bilet = bilet;
    }

    public Jandarmerie() {
    }

    private Map<Long, String>huligani=new HashMap<>();
    public void adaugarageHuligan(Bilet bilet){
        huligani.put(bilet.getCnp(), bilet.getNume());
    }

    public void antecedentePeAlteStadioane(Bilet bilet){
        if(huligani.containsKey(bilet.getCnp())){
            System.out.println("Banat de pe stadion.");
        }else {
            System.out.println("Este liber.");
        }
    }
}
