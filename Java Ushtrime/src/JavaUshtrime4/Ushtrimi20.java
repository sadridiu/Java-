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
 */
public class Ushtrimi20 {
    public static void main(String[]args)
    {
        Scanner s=new Scanner (System.in);
        System.out.println("Jepni nje numer telefoni");
        String nr=s.nextLine();
        
        if( nr.length() !=10 && 
                nr.length() !=13 
                && nr.length() !=14  )
            {
                 System.out.println(nr+" nuk eshte nje numer sipas formatit");
            }
        else if(nr.startsWith("+35567")|| nr.startsWith("0035567")||nr.startsWith("067"))
                {
                    System.out.println(nr+" Numri i perket operatorit Eagle");
                }
        else if(nr.startsWith("+35568")|| nr.startsWith("0035568")||nr.startsWith("068"))
        {
            System.out.println(nr+" Numri i perket operatorit Telekom");
        }
        else if(nr.startsWith("+35569")|| nr.startsWith("0035569")||nr.startsWith("069"))
        {
            System.out.println(nr+" Numri i perket operatorit Eagle");
        }
        else  {
            System.out.println(nr+" Nuk eshte nje numer sipas formatit");
        }
    }
    
}
