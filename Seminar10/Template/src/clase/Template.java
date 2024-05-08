package clase;

import java.util.HashMap;
import java.util.Map;

public abstract class Template {

    protected Map<String,Integer>stocuri;

    protected Template() {
        this.stocuri=new HashMap<>();
        stocuri.put("Paracetamol",2);
        stocuri.put("Nurofen",3);
        stocuri.put("Teromer",2);
    }

    public final void cumparaMedicament(){
        primireReteta();
        if(verifcareStoc()){
            aduceMedicamente();
            incaseaza();
            emiteBon();
        }else{
            respingeAchizitia();
        }
    }

    protected abstract void primireReteta();
    protected abstract boolean verifcareStoc();
    protected abstract void incaseaza();
    protected abstract void aduceMedicamente();
    protected abstract void emiteBon();
    protected abstract void respingeAchizitia();
}
