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
public class TestShtepiaBotuese {
    public static void main (String []args){
    ShtepiaBotuese b1=new ShtepiaBotuese("25bb78","Pegi","tr");
    ShtepiaBotuese b2=new ShtepiaBotuese("29a8","Dituria","tr");
    
       System.out.println("Te dhenat e b1: "+ b1.toString());
       System.out.println("Te dhenat e b2: "+ b2.toString());
    boolean test1=b1.equals(b2);
    if(test1==true)
      System.out.println("Shtepite botuese kane te njejtin adrese.");
    else
    System.out.println("Shtepite botuese nuk kane te njejtin adrese.");
    
    int test2=b1.compareTo(b2);
    if(test2==-1)
 System.out.println(b2.getEmri()
+" eshte me mbrapa ne rend alf");
    else if(test2==1)
System.out.println(b1.getEmri()
+" eshte me mbrapa ne rend alf");
    else
System.out.println("Shtepite botuese kane te njejtin emer."); 
       
    }
}
