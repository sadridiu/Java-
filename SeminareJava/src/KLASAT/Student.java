/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KLASAT;

/**
 *
 * @author sadri
 */
public class Student {
    
private String emri;
private String dega;
private int kredite;

public  Student() 
     {          }

public Student (String emri,String dega,int k)
{
    this.emri=emri;
    this.dega=dega;
    this.kredite=k;
}
public void setEmri(String emri){this.emri=emri;}
public String getEmri(){return emri;}

public void setDega(String dega){this.dega=dega;}
public String getDega(){return dega;}

public void setKredite(int k){this.kredite=k;}
public int getKredite(){return kredite;}

public String toString(){
    return "Emri: "+emri+"\n Dega :"+dega+"\n Nr krediteve: "+kredite;
}
public void krahaso (Student s){
     if(this.kredite>s.kredite)
        System.out.println("Te dhenat estudentit me me shume kredite jane: \n"
                +this.toString());
        else 
            System.out.println("Te dhenat e studentit me me shume kredite jane: \n"
        +s.toString());
}
        

    
}
