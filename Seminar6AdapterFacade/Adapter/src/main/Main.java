package main;

import autobuz.AdapterMetrou;
import autobuz.CardStb;
import metrou.BiletMetrou;
import metrou.Calatorie;

public class Main {

    public static void validareIntrareMetrou(Calatorie calatorie){
        if(calatorie.estePermisAccesul()){
            System.out.println("Calatorie placuta");
        }else{
            System.out.println("Sold calatorii insuficiente");
        }
    }

    public static void validareIntrareSTB(CardStb card){
        card.validareCard();
    }
    public static void main(String[] args) {

        Calatorie biletMetrou = new BiletMetrou("Dristor", 5);
        validareIntrareMetrou(biletMetrou);
        validareIntrareMetrou(biletMetrou);
        validareIntrareMetrou(biletMetrou);

        CardStb biletAutobuz= new AdapterMetrou(biletMetrou);
        validareIntrareSTB(biletAutobuz);
        validareIntrareSTB(biletAutobuz);
    }
}