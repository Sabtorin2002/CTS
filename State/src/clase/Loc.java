package clase;

public class Loc {
    private Stare stare;
    private String numeSpectator;
    private float pretBilet;

    public Loc(String numeSpectator, float pretBilet) {
        this.numeSpectator = numeSpectator;
        this.pretBilet = pretBilet;
        this.stare=new Liber();
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void rezervaLoc(){
        if(stare instanceof Liber){
            System.out.println("A fost rezervat acest loc.");
            Stare rezervat=new Rezervat();
            rezervat.schimbaStare(this);
        }
    }

    public void ocupaLoc(){
        if(stare instanceof Rezervat || stare instanceof Liber){
            System.out.println("Acest loc a fost ocupat de catre spectator.");
            Stare ocupat=new Ocupat();
            ocupat.schimbaStare(this);
        }else{
            System.out.println("Acest loc este rezervat de catre alt spectaor.");
        }
    }

    public void renuntaLoc(){
        if(stare instanceof Ocupat){
            System.out.println("Acest loc este liber.");
            Stare liber=new Liber();
            liber.schimbaStare(this);
        }else{
            System.out.println("Acest loc este ocupat.");
        }
    }
}
