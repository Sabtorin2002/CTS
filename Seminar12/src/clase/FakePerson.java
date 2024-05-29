package clase;

public class FakePerson implements IPersoana {

    private String sex;
    private int varsta;
    private boolean cnp;


    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setCnp(Boolean cnp) {
        this.cnp = cnp;
    }

    @Override
    public String getSex() {
        return this.sex;
    }

    @Override
    public int getVarsta() {
        return this.varsta;
    }

    @Override
    public boolean checkCNP() {
        return this.cnp;
    }
}
