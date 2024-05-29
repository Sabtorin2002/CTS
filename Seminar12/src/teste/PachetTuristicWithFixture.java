package teste;

import clase.FakePerson;
import clase.IPersoana;
import clase.PachetTuristic;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import teste.dubluri.NuAreFake;

import static org.junit.Assert.*;

public class PachetTuristicWithFixture {

    private PachetTuristic pachetTuristic;

    @Before
    public void setUp() throws Exception{
        IPersoana persoana=new FakePerson();
        ((FakePerson)persoana).setVarsta(70);
        this.pachetTuristic=new PachetTuristic(persoana, "Palermo", 90d);
    }

    @Test
    @Category(NuAreFake.class)
    public void tesAplicaDiscountCu0(){
        this.pachetTuristic.aplicaDiscountVarstnici(0);
        assertEquals(Double.valueOf(90d), this.pachetTuristic.getPret());
    }

    @Test
    @Category(NuAreFake.class)
    public void testAplicaDiscountCu100(){
        this.pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(Double.valueOf(0d),this.pachetTuristic.getPret());
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(NuAreFake.class)
    public void testAplicaDiscountNegativ(){
        this.pachetTuristic.aplicaDiscountVarstnici(-10);
    }
    @Test(timeout = 10)
    @Category(NuAreFake.class)
    public void testDiscountTimeout(){
        //this.pachetTuristic.aplicaDiscountVarstnici();
    }

}