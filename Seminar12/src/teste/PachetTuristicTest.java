package teste;

import clase.FakePerson;
import clase.IPersoana;
import clase.PachetTuristic;
import clase.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import teste.dubluri.AreFake;
import teste.dubluri.NuAreFake;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Test
    @Category(NuAreFake.class)
    public void corectitudineDiscount(){
        IPersoana persoana=new Persoana("Ion", "1230304117187");
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Roman",100.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(90.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(NuAreFake.class)
    public void testBoundaryGetDiscount(){
        IPersoana persoana=new Persoana("Ion", "1590304117187");
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Roman",100.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(90,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(AreFake.class)
    public void testFakeAplicaDiscount(){
        FakePerson persoana=new FakePerson();
        persoana.setVarsta(65);
        PachetTuristic pachetTuristic=new PachetTuristic(persoana, "Bucuresti", 50.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(45.0, pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(AreFake.class)
    public void testFakeNuAplicaDiscount(){
        FakePerson persoana=new FakePerson();
        persoana.setVarsta(21);
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Viena",50.0);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(50.0, pachetTuristic.getPret(), 0.01);
    }


}