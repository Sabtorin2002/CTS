package clase;

public class Reteta {
    private int nrMedicamente;
    private float pret;
    private int nrRetata;
    private AbstractState stare;

    public int getNrMedicamente() {
        return nrMedicamente;
    }

    public float getPret() {
        return pret;
    }

    public int getNrRetata() {
        return nrRetata;
    }

    public AbstractState getStare() {
        return stare;
    }

    public Reteta(int nrMedicamente, float pret, int nrRetata) {
        this.nrMedicamente = nrMedicamente;
        this.pret = pret;
        this.nrRetata = nrRetata;
        this.stare=new Emisa();
    }

    protected void setStare(AbstractState stare) {
        this.stare = stare;
    }

    public void cereMedicamente(){
        if (stare instanceof Emisa){
            System.out.println("Au fost solicitate "+nrMedicamente+" in baza retetei cu numarul "+nrRetata);
            AbstractState solicitata = new Solicitata();
            solicitata.schimbaStare(this);
        }else {
            System.out.println("Nu puteti lua medicamente pe baza acestei retetei");
        }
    }

    public void cumparaMedicament(){
        if(stare instanceof Solicitata){
            System.out.println("Au fost cumparate "+getNrMedicamente()+" in baza retetei cu numarul "+getNrRetata());
            AbstractState achitizionata=new Achizitionata();
            achitizionata.schimbaStare(this);
        }else {
            System.out.println("Nu puteti lua medicamente pe baza acestei retetei.");
        }
    }

    public void respingeRetata(){
        if(stare instanceof Solicitata){
            System.out.println("Nu avem aceste medicamente in stoc.");
            AbstractState emisa = new Emisa();
            emisa.schimbaStare(this);
        }else {
            System.out.println("Reteta nu a fost solicitata.");
        }
    }
}
