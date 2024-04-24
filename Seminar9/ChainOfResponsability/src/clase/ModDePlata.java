package clase;

public abstract class ModDePlata {
    protected ModDePlata succesor;
    public abstract void plateste(double pret);

    public void setSuccesor(ModDePlata succesor){
        this.succesor=succesor;
    }
}
