package clase;

import java.util.HashMap;
import java.util.Map;

public class Politie {

    private Map<Long,String>urmariti=new HashMap<>();

    private Bilet bilet;

    public Politie(Bilet bilet) {
        this.bilet = bilet;
    }

    public Politie() {
    }
    public void adaugarageUrmarit(Bilet bilet){
        urmariti.put(bilet.getCnp(), bilet.getNume());
    }
    public void cautatDePolitie(Bilet bilet){
        if(urmariti.containsKey(bilet.getCnp())){
            System.out.println("A fost prins criminalul.Nu are voie pe stadion.");
        }
        else{
            System.out.println("Este liber.");
        }
    }
}
