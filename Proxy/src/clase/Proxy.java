package clase;

public class Proxy implements Rezervare{
    private Rezervare rezervare;

    public Proxy(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void faceRezervare() {
        if(rezervare.getNrLocuri()>4){
            System.out.println(rezervare.getNumePersoana()+ " a facut rezervarea pentru mai mult de 4 persoane.");
        }else {
            System.out.println("Ne pare rau!");
        }
    }

    @Override
    public String getNumePersoana() {
        return rezervare.getNumePersoana();
    }

    @Override
    public int getNrLocuri() {
        return rezervare.getNrLocuri();
    }
}
