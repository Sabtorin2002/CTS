package eBilet;

public abstract class BiletOnline {

    private String nume;
    private String email;

    public BiletOnline(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    public abstract void cumparareBiletOnline();
}
