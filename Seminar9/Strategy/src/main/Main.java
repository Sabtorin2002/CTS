package main;

import clase.PlataCardBancar;
import clase.PlataCardCalatorii;
import clase.PlataSMS;
import clase.Validator;

public class Main {
    public static void main(String[] args) {

        Validator validator = new Validator(23, new PlataSMS());
        validator.efectueazaPlata(3);
        validator.setModDePlata(new PlataCardCalatorii());
        validator.efectueazaPlata(3);
        validator.setModDePlata(new PlataCardBancar());
        validator.efectueazaPlata(3);
    }
}