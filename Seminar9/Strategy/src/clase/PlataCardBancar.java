package clase;

public class PlataCardBancar implements ModDePlata{
    @Override
    public void plateste(double pret) {
        System.out.println("S-a efectuat plata in valoare de "+ pret+" RON cu cardul bancar.");
    }
}
