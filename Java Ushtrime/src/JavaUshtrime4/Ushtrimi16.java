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
 * Shhkruani nje program qe i kerkon perdoruesit te jape nje Shkronje
 * dhe afishon numrin e tij perkates 
 * bazuar ne tastierat tradicionale te telefonave si ne figure.
 * 
 */
public class Ushtrimi16 {
     public static void main(String []args)
    {
        Scanner s=new Scanner (System.in);
        System.out.println("Jeni nje shkronje");
        String shkronja=s.next();
        shkronja=shkronja.toLowerCase();
        char sh=shkronja.charAt(0);
        
        if(sh>=97&&sh<=122)
        {
            if(sh==97||sh==98||sh==99) System.out.println("Shkronja "+sh+" i perket numrit 2 ");
          else  if (sh==100||sh==101||sh==102) System.out.println("Shkronja "+sh+" i perket numrit 3 ");
          else  if (sh==103||sh==104||sh==105) System.out.println("Shkronja "+sh+" i perket numrit 4 ");
          else  if (sh==106||sh==107||sh==108) System.out.println("Shkronja "+sh+" i perket numrit 5 ");
          else  if (sh==109||sh==110||sh==111) System.out.println("Shkronja "+sh+" i perket numrit 6 ");
          else  if (sh==112||sh==113||sh==114||sh==115)System.out.println("Shkronja "+sh+" i perket numrit 7 ");
          else if( sh==116||sh==117||sh==118)System.out.println("Shkronja "+sh+" i perket numrit 8 ");
          else if (sh==119||sh==120||sh==121||sh==122)System.out.println("Shkronja " +sh+" i perket numrit 9 ");
         }
        else System.out.println("Kjo nuk eshte nje shkronje");
        
        
        
      
    }
    
    
}
