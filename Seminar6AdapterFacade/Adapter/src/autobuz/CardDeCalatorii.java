package autobuz;

public class CardDeCalatorii extends CardStb{
    private float soldCard;
    private static float pretCalatorie=3.30f;

    public CardDeCalatorii(String numeClient, String cnpClient, float soldCard) {
        super(numeClient, cnpClient);
        this.soldCard = soldCard;
    }



    @Override
    public void validareCard() {
        this.soldCard=this.soldCard-pretCalatorie;
        if(this.soldCard>pretCalatorie){
            System.out.println("Calatorie placuta");
        }else{
            System.out.println("Fonduri insuficiente");
        }
    }
}
