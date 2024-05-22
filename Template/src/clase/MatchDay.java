package clase;

import java.awt.font.NumericShaper;
import java.util.Map;

public class MatchDay extends Template{
    private String numeSpectator;
    private String numeStadion;

    public MatchDay(String numeSpectator, String numeStadion) {
        this.numeSpectator = numeSpectator;
        this.numeStadion = numeStadion;
    }

    @Override
    protected void asezareCoada() {
        System.out.println(numeSpectator+" s-a asezat la coada.");
    }

    @Override
    protected boolean prezentareBilet() {
        return super.spectatori.containsKey(numeStadion);
    }

    @Override
    protected void controlCoporal() {
        System.out.println(numeSpectator+" a fost controlat corporal.");
    }

    @Override
    protected void intrareStadion() {
        if(super.spectatori.get(numeStadion)>1){
            super.spectatori.replace(numeStadion, super.spectatori.get(numeStadion)-1);
        }else{
            System.out.println("Nu mai sunt locuri pe stadion.");
            super.spectatori.remove(numeStadion);
        }
    }

    @Override
    protected void ocupareLoc() {
        System.out.println(numeSpectator+" si-a ocupat locul.");
    }
}
