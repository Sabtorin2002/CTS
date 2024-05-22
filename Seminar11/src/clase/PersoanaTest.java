package clase;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Test
    public void getSexReturnF() {
        Persoana persoana=new Persoana("Maria","2021103123456");
        assertEquals("F",persoana.getSex());
    }

//    @org.junit.Test
//    public void testSuperiorBoundary() {
//        Persoana persoana=new Persoana("Maria","2021103123456");
//        assertEquals("F",persoana.getSex());
//    }

    @org.junit.Test
    public void getSexCrossCheck(){
        Persoana persoana=new Persoana("Maria","60234789234");
        String expected=(persoana.CNP.charAt(0)%2==0 ? "F":"M");
        assertEquals(expected,persoana.getSex());
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCondition() {
        Persoana persoana = new Persoana("Maria", "s60234789234");
        persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getEmptyString(){
        Persoana persoana=new Persoana("Maria","");
        persoana.getSex();
    }
    @org.junit.Test(timeout = 200)
    public void getPerformance(){
        Persoana persoana=new Persoana("Ana","68790985674543");
        persoana.getSex();
    }

    @org.junit.Test
    public void getConformance(){
        Persoana persoana=new Persoana("Maria","18790985674543");
        String expected=persoana.getSex();
        assertTrue(expected.equals("F")||expected.equals("M"));
    }

    @org.junit.Test
    public void getSexOrder(){
        Persoana persoana=new Persoana("Maria","28790985674543");
        Persoana persoan1=new Persoana("Marian","18790985674543");
        assertTrue(persoan1.getSex().compareTo(persoana.getSex()) >0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexNullValue(){
        Persoana persoana=new Persoana("Maria",null);
        persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexZeroValue(){
        Persoana persoana=new Persoana("Maria","0000000000000000");
        persoana.getSex();
    }


}