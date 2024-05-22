package observer;

public class Client implements Observer{
    private String numeClient;

    public Client(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(numeClient+":"+mesaj);
    }
}
