package eBilet;

public class Ticket extends BiletOnline{

    private float sold;
    private static float pretTicket=35;

    public Ticket(String nume, String email, float sold) {
        super(nume, email);
        this.sold = sold;
    }

    @Override
    public void cumparareBiletOnline() {
        if((this.sold-pretTicket)>0){
            this.sold-=pretTicket;
            System.out.println("Biletul a fost cumparatu cu succes.");
        }
        else {
            System.out.println("Fonduri insuficiente");
        }
    }
}
