package clase;

public class Client implements Flyweight{
    private String nume;
    private String numarTelefon;

    public Client(String nume, String numarTelefon) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
    }
    @Override
    public void rezerva(Masa masa) {
        System.out.println(nume+" a facut rezevarea prin numarul de telefon "+numarTelefon+masa.toString());
    }
}
