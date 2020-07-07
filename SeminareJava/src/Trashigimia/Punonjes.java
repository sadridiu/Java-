/*
 Ndertoni klasen punonjes qe trashegon nga klasa person 
per punonjesin ruhet departamenti ku punon edhe paga mujore
Ndertoni konstrukto default, me parametra,metodat get dhe set,toString;
Testoni klasat
 */
package Trashigimia;

/**
 *
 * @author dd
 */
public class Punonjes extends Person 
{
    private String dep;
    private int paga;
    
    public Punonjes()
    {
        super();
    }
    public Punonjes(String emer,int mosha,char gender,String dep,int paga)
    {
        super(emer,mosha,gender);
        this.dep=dep;
        this.paga=paga;
    }
    public void setDep(String dep)
    {
        this.dep=dep;
    }
    public void setPaga(int paga)
    {
        this.paga=paga;
    }
    public String getDep(){return dep;}
    public int getPaga(){return paga;}
    public String toString(){
        return super.toString()+" dep eshte "+dep+" paga mujore eshte "+paga; 
    }
}
