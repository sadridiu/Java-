/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author sadri
 */
public class Punonjes implements 
        PagePunonjesi {
    private String emri,dep ;
    private double paga;
    public Punonjes()
    {
        
    }

    public Punonjes(String emri, String dep, double paga) {
        this.emri = emri;
        this.dep = dep;
        this.paga = paga;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public void setPaga(double paga) {
        this.paga = paga;
    }
    

    public String getEmri() {
        return emri;
    }

    public String getDep() {
        return dep;
    }

    public double getPaga() {
        return paga;
    }

  
    public String toString() {
        return "Punonjes{" + "emri=" + emri + ", dep=" + dep + ", paga=" + paga + '}';
    }

    public boolean equals(Object obj)
 {
     Punonjes p=(Punonjes)obj;
if(this.dep.equalsIgnoreCase(p.dep)
        ==true)
    return true;
else 
    return false;
 }
    public boolean kontrolloPage()
    {
        if(this.getPaga()>=3000&&this.getPaga()<=5000)
            return true;
        else return false;
    }
 public void llogaritTatim()
 {
     this.paga=paga-(paga*5/1000);
 }
}
