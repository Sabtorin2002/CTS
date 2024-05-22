package eBilet;

import aplicatie.BiletAplicatie;

public class AdapterBiletAplicatie extends BiletOnline{
    private BiletAplicatie biletAplicatie;

    public AdapterBiletAplicatie(BiletAplicatie biletAplicatie) {
        super(biletAplicatie.getNume(), null);
        this.biletAplicatie = biletAplicatie;
    }

    @Override
    public void cumparareBiletOnline() {
        if (biletAplicatie.arePermisAccesul()){
            System.out.println("Sa castige cei mai buni!");
        }else {
            System.out.println("Ne cerem scuze!");
        }
    }
}
