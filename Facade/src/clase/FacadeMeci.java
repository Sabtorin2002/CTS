package clase;

public class FacadeMeci {
    private Bilet bilet;
    private Politie politie;
    private Jandarmerie jandarmerie;

    public FacadeMeci(Bilet bilet) {
        this.bilet = bilet;
        this.politie=new Politie(bilet);
        this.jandarmerie=new Jandarmerie(bilet);
    }

    public void verificarePersoana(){
        bilet.verificareBilet();
        politie.adaugarageUrmarit(bilet);
        politie.cautatDePolitie(bilet);
        jandarmerie.adaugarageHuligan(bilet);
        jandarmerie.antecedentePeAlteStadioane(bilet);
    }
}
