/*
 Ndertoni klasen Pensionist qe trashegon nga klasa Person
( klasa e ndertuar edhe ne ushtrimin e derguar tek leksioni i Inheritance). 
Per klasen Pensionist ruhet pensioni mujor. Ndertoni konstruktor default, 
konstruktor me parametra, metodat get dhe set, metoden toString
dhe nje metode qe kontrollon nese nje personi i takon te jete ne pension ose jo. 
Nje person eshte ne pension nese eshte mashkull me moshe te pakten 70 vjec 
ose femer me moshe te pakten 65 vjec. 
Testoni klasat me te dhena qe merren si input nga perdoruesi
 */
package Trashigimia;

/**
 *
 * @author sadri
 */
public class Pensionist extends Person {
    private double pensioni;
    public Pensionist()
    {
        super();
        
    }
    public Pensionist(String emer,int mosha,char gjini,double p)
    {
        super(emer,mosha,gjini);
        this.pensioni=p;
    }
    public void setPensioni(double p){this.pensioni=p;}
    public double getPensioni()
    {
        return this.pensioni;
    }
    public String toString()
    {
        return "Te dhenat e pensionistit jane: "+super.toString() +"\n Pensioni Mujor: "+this.getPensioni();
    }
    public void krahaso()
    {
        
        if(this.getMosha()>=70&&getGjini()=='m')
            System.out.println(" Ketij person i takon te jete ne pension ");
        else if(this.getMosha()>=65&&getGjini()=='f')
            System.out.println("Ketij person i takon te jete ne pension ");
        else 
            System.out.println("Ketij person nuk i takon te jete ne pension ");
    }
    
}
