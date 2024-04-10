package clase;

public class AutobuzDeNoapte implements AutobuzAbstract{
    private AutobuzAbstract autobuz;

    public AutobuzDeNoapte(AutobuzAbstract autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie(String numeStatie) {
        if(autobuz.getNrCalatori()>0){
            autobuz.opresteInStatie(numeStatie);
        }
        System.out.println("Autobozul cu numarul "+ autobuz.getNrAutobuz()+ " nu mai opreste in statia "+numeStatie+".");
    }

    @Override
    public int getNrCalatori() {
        return autobuz.getNrCalatori();
    }

    @Override
    public int getNrAutobuz() {
        return autobuz.getNrCalatori();
    }


}
