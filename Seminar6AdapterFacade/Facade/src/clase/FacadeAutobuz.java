package clase;

public class FacadeAutobuz {
    private Autobuz autobuz;

    public FacadeAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    public void deschideToateUsile(){
        autobuz.dechideUsaDinFata();
        autobuz.dechideUsaDinMijloc();
        autobuz.dechideUsaDinSpate();
    }

    public void inchideToateUsile(){
        autobuz.inchideUsaDinFata();
        autobuz.inchideUsaDinMijloc();
        autobuz.inchideUsaDinSpate();
    }
}
