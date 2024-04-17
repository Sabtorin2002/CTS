package main;

import clase.Banca;
import clase.Cont;

public class Main {
    public static void main(String[] args) {
        Banca banca=new Banca("BCR",125);
        Cont cont1 = new Cont(1,1799);
        Cont cont2 = new Cont(2,1200);
        Cont cont3 = new Cont(3,2260);
        Cont cont4 = new Cont(4,5900);
        banca.getClient("Gigel","Bucuresti","0711122267").afiseazaInformatii(cont1);
        banca.getClient("Gigel").afiseazaInformatii(cont2);


    }
}