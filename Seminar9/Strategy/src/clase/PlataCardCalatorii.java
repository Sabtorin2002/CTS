package clase;

public class PlataCardCalatorii implements ModDePlata{
    @Override
    public void plateste(double pret) {
        System.out.println("S-a efectuat plata in valoare de "+ pret+" RON cu cardul de calatorii.");
    }
}
