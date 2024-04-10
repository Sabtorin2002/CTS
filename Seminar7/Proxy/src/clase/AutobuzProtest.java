package clase;

import java.util.ArrayList;
import java.util.List;

public class AutobuzProtest implements AutobuzAbstract{
    private List<String> statiiInterzise=new ArrayList<>();
    private AutobuzAbstract autobuz;

    public AutobuzProtest(AutobuzAbstract autobuz) {
        this.autobuz = autobuz;
    }

    public void adaugaStatieInterzisa(String statieInterzisa){
        statiiInterzise.add(statieInterzisa);
    }
    @Override
    public void opresteInStatie(String numeStatie) {
        if(statiiInterzise.contains(numeStatie)){
            System.out.println("Autobuzul "+ autobuz.getNrAutobuz()+" nu mai opreste in statie.");
        }
        autobuz.opresteInStatie(numeStatie);
    }

    @Override
    public int getNrCalatori() {
        return autobuz.getNrAutobuz();
    }

    @Override
    public int getNrAutobuz() {
        return autobuz.getNrCalatori();
    }
}
