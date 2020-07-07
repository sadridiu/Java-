/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import static java.lang.Math.atan;
import static java.lang.Math.cos;
import static java.lang.Math.tan;

/**
 *
 * @author sadri
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("2"+2);
      System.out.println('2'+2);
      System.out.println("2"+2+2);
      System.out.println("2"+(2+2));
      System.out.println('2'+2+2);
      System.out.println(2+"Java"+1+1);
      System.out.println(2+"JAva"+(1+1));
      System.out.println(2+"Java"+('\u0001'+1));
       
       System.out.println("Math.");
       System.out.println(Math.log(Math.E));
       System.out.println(Math.sqrt(4));
       System.out.println(Math.sin(2*Math.PI)); 
       System.out.println(Math.pow(2, 2));
       System.out.println(Math.exp(1));
       System.out.println(Math.max(2,Math.min(3, 4)));
       System.out.println(Math.rint(-2.5));
       System.out.println(Math.ceil(-2.5));
       System.out.println(Math.ceil(2.5));
       System.out.println(Math.floor(-2.5));
       System.out.println(Math.floor(2.5));
       System.out.println("Ushtrimi 11");
       long n = 461012;
      System.out.format("%d%n", n);      //  -->  "461012"
      System.out.format("%08d%n", n);    //  -->  "00461012"
      System.out.format("%+8d%n", n);    //  -->  " +461012"
      System.out.format("%,8d%n", n);    // -->  " 461,012"
      System.out.format("%+,8d%n%n", n); //  -->  "+461,012"
      String s="Java";
      System.out.printf("%6s","Java");
      System.out.printf("Vlerat: %f %e\n",44.44, 44.44);
      System.out.printf("Vlerat: %6.2f %6.4e\n",44.123, 44.12);
      System.out.printf("%6b\n",(4>4));
      System.out.printf("%6s\n ","Java");
      System.out.printf("%-20s\n","Java");
      System.out.printf("%-6b%s\n",(3>2),"Java");
      System.out.printf("%6b%-8s\n",(3>2),"Java");
      System.out.printf("%5d\n %5.1f\n %-10s\n",5, 5.050, "Java");
      
      System.out.println("Ushtrimi 12");
      double B=30,b=20,k=45;
      double St=1/4*(B+b)*(B-b)*tan(k);
      System.out.println(St);
      double Pt=B+b+2*(B-b)/cos(k);
      System.out.println(Pt);
      
      System.out.println("Ushtrimi 13");
      double N=5,L=6.5;
      double Sp=(N*L*L)/4*Math.tan(Math.PI/N);
      System.out.println(Sp);
    } 
    
}
