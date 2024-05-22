package observer;

public class Abonat implements Observer{
    private String nume;

    public Abonat(String nume) {
        this.nume = nume;
    }


    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(this.nume+":"+mesaj);
    }
}
