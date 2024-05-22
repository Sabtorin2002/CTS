package clase;

public class VanzareBilet implements SpectatorAbstract {

    private SpectatorAbstract spectator;

    public VanzareBilet(SpectatorAbstract spectator) {
        this.spectator = spectator;
    }

    @Override
    public void vindeBilet(String meci) {
        if(spectator.getVarsta()>14){
            spectator.vindeBilet(meci);
        }
        System.out.println("Spectatorul nu are 14 ani impliniti.");

    }

    @Override
    public int getVarsta() {
        return spectator.getVarsta();
    }

    @Override
    public String getZona() {
        return spectator.getZona();
    }

}
