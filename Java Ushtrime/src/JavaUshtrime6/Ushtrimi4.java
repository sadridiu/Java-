/*
shkruani nje metode sipas percaktimit te meposhtem per te afishuar
tre numra ne rendin zbrites.
public static void shfaqNumratRendit(double num1, double nr2, double numr3)
Shkruani nje program test qe i kerkon perdoruesit te jape tre numra 
dhe ttheret metoden qe i afishon ato ne rendin zbrites.
 */
package JavaUshtrime6;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi4 {

    
    public static void main(String[] args) {
        System.out.println("Jepni 3 numra");
        Scanner scn = new Scanner (System.in);
        System.out.println("Jepni numrin e pare");
        double a = scn.nextDouble();
        
        System.out.println("Jepni numrin e dyte");
        double b = scn.nextDouble();
        
        System.out.println("Jepni numrin e trete");
        double c = scn.nextDouble();
        System.out.println("Numrat ne rendin zbrites jane: ");
        shfaqNumratRendit(a,b,c);
        
    }
    public static void shfaqNumratRendit(double num1, double num2, double num3){
        if(num1 >num2){
            if(num2 > num3)
                System.out.println(num1+" "+num2+" "+num3);
            else if(num3< num1)
                System.out.println(num1+" "+num3+" "+num2);
        }else if(num2 > num3){
            if(num3 > num1)
                System.out.println(num2+" "+num3+" "+num1);
            else System.out.println(num2+" "+num1+" "+num3);
        }else if(num3 > num1){
            if(num1>num2)
                 System.out.println(num3+" "+num1+" "+num2);
            else  System.out.println(num3+" "+num2+" "+num1);
        }
            
    }
}
