/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katror;

/**
 *
 * @author Lab2-1
 */
public class Katror {

    private double brinja;
    public Katror(){
        brinja=0;
    }
    public Katror(double b){
        brinja=b;
    }
    
    public void setBrinja(double b) {
     if(brinja<0){brinja=1;}
     else {brinja=b;
}
    }
     public double getBrinja(){
         return brinja;
     }
     public double getSiperfaqe(){
         return brinja*brinja;
     }
     public void AfishoTeDhena(){
         System.out.println("Brinja e katrorit eshte "+getBrinja()+"dhe siperfaqja eshte "+getSiperfaqe());
             
     }
}
