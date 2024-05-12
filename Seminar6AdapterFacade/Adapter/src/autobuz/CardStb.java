package autobuz;

public abstract class CardStb {
    private String numeClient;
    private String cnpClient;

    public CardStb(String numeClient, String cnpClient) {
        this.numeClient = numeClient;
        this.cnpClient = cnpClient;
    }

    protected CardStb() {
    }

    public abstract void validareCard();
}
