/*
 \ndertoni klasen punonjes per te cilin ruhet :
Emri nr i oreve/muaj dhe paga/ore
ndertoni konstruktor defalt
konstruktor me parametra
metodat get dhe set
nje metod qe llogarit pagen mujore te punonjesit
metoden to string dhe nje metod qe krahason 2 punonjes ne baze te pages mujore
dhe kthen te dhenat e punonjesit qe ka pagen mujore me te larte
testoni klasen
 */
package KLASAT;

/**
 *
 * @author dd
 */
public class Punonjes {

    private String emer;
    private int nrOre,pageOre;
    
    public Punonjes()
    {   }
    
    public Punonjes (String emer,int nrOre,int pageOre)
    {this.emer=emer;this.nrOre=nrOre;
    this.pageOre=pageOre;
    }
    public void setEmer(String emer)
    {this.emer=emer;}
    public void setNrOre(int nr)
    {nrOre=nr;}
    public void setPageOre(int p)
    {pageOre=p;}
    public String getEmer ()
    {
        return emer;
    }
    public int getNrOre()
    {
        return nrOre;
    }
    public int getPageOre()
    {
        return pageOre;
    }
    public int pagaMujore()
    {
        return nrOre*pageOre;
    }
    public String toString()
    {
        return "Emri i punonjesit eshte "+emer+ " dhe paga mujore eshte"
                +pagaMujore();
    }
    public void krahaso(Punonjes p)
    {
        if(this.pagaMujore()>p.pagaMujore())
        System.out.println("Te dhenat e punonjesit"
                + " me page mujore me te larte jane: \n"
        +this.toString());
        else 
            System.out.println("Te dhenat e punonjesit"
                + " me page mujore me te larte jane: \n"
        +p.toString());
    }
}
