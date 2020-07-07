/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rreth;

/**
 *
 * @author sadri
 */
public class Rreth {

   public double rreze;
   public Rreth(){this.rreze=1.0;}
   public Rreth(double r){
       this.rreze=r;
   }
   public double llogaritPerimeter(){
       double p=2*3.14*rreze;
       return p;
   }
   public double llogaritSiperfaqe(){
       double s=3.14*rreze*rreze;
       return s;
   }
   public void setRreze(double r){
       this.rreze=r;
   }
   public double getRreze(){return this.rreze;}
}
    

