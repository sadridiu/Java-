/*
 Krijoni nje klase te quajtur Trekendesh qe permban 
dy metodat e meposhtme:
Kthe true nese shuma e dy brinjeve eshte me e madhe se brinja e trete
public static boolean i vlefshem(double a , double b, double c);
kthe siperfaqen e trekendeshit 
public static double siperfaqe(doublea, double b , double c);
shkruani nje program test qe lexon tre brinjet e trekendeshit
dhe njeheson siperfaqen nese te dhenat jane te sakta,
perndryshe shfaq mesazhin qe te dhenat jane gabim.
Formula per njehesimin e siperfqaqes
area = Math.sqrt(s*(s-a)*(s-b)*(s-c))
ku  s = (a+b+c)/2

 */
package JavaUshtrime6;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Jepni brinjet e trekendeshit");
        Scanner scn = new Scanner (System.in);
        System.out.println("Jepni brinjen a");
        double a = scn.nextDouble();
        System.out.println("Jepni brinjen b");
        double b = scn.nextDouble();
        System.out.println("Jepni brinjen c");
        double c = scn.nextDouble();
        System.out.println(Vlefshem(a,b,c));
        if(Vlefshem(a,b,c)){
           System.out.println(Siperfaqe(a,b,c)); 
        }
        
    }
    
    public static boolean Vlefshem(double a , double b, double c){
        if((a + b >c)&&(a + c >b)&&(c + b >a))
            return true;
            else return false;
    }
    
    public static double Siperfaqe(double a , double b, double c){
        double s = (a+b+c)/2;
        double sip = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return sip;
}
}
