package clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bilet {
    private String nume;
    private long cnp;

    private Map<Long, String>spectatori=new HashMap<>();

    public Bilet(String nume, long cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public long getCnp() {
        return cnp;
    }

    public void adaugarageSpectator(Bilet bilet){
        spectatori.put(cnp, nume);
    }
    public void verificareBilet(){
        if(spectatori.containsKey(cnp)){
            System.out.println(nume+" are bilet la meci.");
        }else {
            System.out.println("Nu ai permisiunea de a vedea acest meci");
        }
    }

}
