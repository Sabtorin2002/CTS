package clase;

public class Client implements Flyweight{

    private String nume;
    private String adresa;
    private String numarTelefon;

    public Client(String nume, String adresa, String numarTelefon) {
        this.nume = nume;
        this.adresa = adresa;
        this.numarTelefon = numarTelefon;
    }

    @Override
    public void afiseazaInformatii(Cont cont) {
        System.out.println("Numele clientului este "+ nume+" domiciliat la adresa "+adresa+" si contul" +cont.toString());
    }
}
