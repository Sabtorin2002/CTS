package clase;

public class Rezervare extends Template{
    private String numePersoana;

    public Rezervare(String numePersoana) {
        super();
        this.numePersoana = numePersoana;
    }

    public String getNumePersoana() {
        return numePersoana;
    }

    @Override
    protected boolean verificaPersoana() {
        return super.rezervari.containsKey(numePersoana);
    }

    @Override
    protected void curataMasa() {
        System.out.println("S-a curatat masa pentru "+numePersoana);
    }

    @Override
    protected void asazaServetelele() {
        System.out.println("S-au curatat servetelele pentru"+numePersoana);
    }

    @Override
    protected void asazaTacamurile() {
        System.out.println("S-au asezat tacamurile pentru "+numePersoana);
    }

    @Override
    protected void invitaPersoaneleLaMasa() {
        System.out.println(numePersoana+" si invitatii sai au fost adusi la masa.");
    }
}
