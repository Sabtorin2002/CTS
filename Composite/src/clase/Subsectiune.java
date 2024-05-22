package clase;

import java.util.ArrayList;
import java.util.List;

public class Subsectiune implements Meniu{
    private String nume;

    private List<Meniu>listaMeniu;

    public Subsectiune(String nume) {
        this.nume = nume;
        this.listaMeniu=new ArrayList<>();
    }

    @Override
    public void adaugaMeniu(Meniu meniu) {
        this.listaMeniu.add(meniu);
    }

    @Override
    public void stergeMeniu(Meniu meniu) {
        this.listaMeniu.remove(meniu);
    }

    @Override
    public Meniu getMeniu(int index) {
        return this.listaMeniu.get(index);
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare+nume+" are urmatorii itemi:");
        for(Meniu meniu:listaMeniu){
            meniu.afiseaza(indentare+"  ");
        }
    }

    @Override
    public float totalPlata() {
        float total=0;
        for(Meniu meniu:listaMeniu){
            total+=meniu.totalPlata();
        }
        return total;
    }
}
