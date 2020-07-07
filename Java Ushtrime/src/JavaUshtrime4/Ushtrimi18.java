/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaUshtrime4;

import java.util.Scanner;

/**
 *
 * @author sadri
 * Shkruani nje program qe i kerkon perdoruesit te jape dy stringje
 * ne input dhe kontrollon nese njera nga ato eshte nenstring e tjetres.
 * 
 */
public class Ushtrimi18 {
    public static void main(String[]args)
    {
        Scanner s=new Scanner (System.in);
        System.out.println("JEpni dy stringje: ");
        String a1=s.next();
        String a2=s.next();
        if(a1.contains(a2))
        {
             System.out.println(a2+" eshte nje nenstring e "+a1);
        }
        else if(a2.contains(a1))
        {
            System.out.println(a1+" eshte nje nenstring e "+a2);
        }
        else 
            System.out.println(a2+" nuk eshte nje nenstring e "+a1);
    }
    
}
