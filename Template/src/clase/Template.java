package clase;

import java.util.HashMap;
import java.util.Map;

public abstract class Template {

    protected Map<String, Integer>spectatori;

    public Template() {
        this.spectatori=new HashMap<>();
        spectatori.put("Stadion Otelul",13500);
        spectatori.put("Arena Nationala",53000);
        spectatori.put("Cluj Arena",30500);
    }

    protected abstract void asezareCoada();
    protected abstract boolean prezentareBilet();
    protected abstract void controlCoporal();
    protected abstract void intrareStadion();
    protected abstract void ocupareLoc();

    public final void mergeLaMeci(){
        asezareCoada();
        if(prezentareBilet()){
        controlCoporal();
        intrareStadion();
        ocupareLoc();
        }
    }
}
