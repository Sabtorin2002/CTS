package main;

import clase.Bilet;
import clase.FacadeMeci;
import clase.Jandarmerie;
import clase.Politie;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fara facade");
        Bilet bilet=new Bilet("Andrei",60207293);
        Bilet bilet1=new Bilet("Laurentiu",599121104);
        Politie politie=new Politie();
        Jandarmerie jandarmerie=new Jandarmerie();
        bilet.adaugarageSpectator(bilet);
        bilet.verificareBilet();
        bilet.adaugarageSpectator(bilet1);
        politie.adaugarageUrmarit(bilet1);
        jandarmerie.adaugarageHuligan(bilet1);
        politie.adaugarageUrmarit(bilet);
        politie.cautatDePolitie(bilet);
        politie.cautatDePolitie(bilet1);
        jandarmerie.antecedentePeAlteStadioane(bilet1);
        Bilet bilet2=new Bilet("Alexandru",599121901);
        bilet2.verificareBilet();
        politie.cautatDePolitie(bilet2);
        jandarmerie.antecedentePeAlteStadioane(bilet2);

        System.out.println("------------------------");
        System.out.println("Cu facade");
        Bilet bilet3=new Bilet("Lucas",591101103);
        FacadeMeci facadeMeci=new FacadeMeci(bilet3);
        facadeMeci.verificarePersoana();
    }
}