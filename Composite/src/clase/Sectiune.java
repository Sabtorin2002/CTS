package clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Regiune{
    private int nrFani;
    private String numeSectiune;

    private List<Regiune>listaRegiuni;

    public Sectiune(int nrFani, String numeSectiune) {
        this.nrFani = nrFani;
        this.numeSectiune = numeSectiune;
        this.listaRegiuni=new ArrayList<>();
    }

    @Override
    public void adaugaRegiune(Regiune regiune) {
        listaRegiuni.add(regiune);
    }

    @Override
    public void stergeRegiune(Regiune regiune) {
        listaRegiuni.remove(regiune);
    }

    @Override
    public Regiune getIndex(int index) {
        return this.listaRegiuni.get(index);
    }

    @Override
    public int getNumarLocuri() {
        int nrSpectatori=nrFani;
        for(Regiune regiune:listaRegiuni){
            nrSpectatori+=regiune.getNumarLocuri();
        }
        return nrSpectatori;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare+"Sectiunea "+numeSectiune+" are "+nrFani+" fani si subsectiunile:");
        for(Regiune regiune:listaRegiuni){
            regiune.afiseaza(indentare+"    ");
        }
    }
}
