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
 * A	E	Ë	I	O	U	Y  zanoret
 * Shkruani nje program qe i kerkon perdoruesit te jape nje shkronje
 * dhe te kontrolloj nese eshte zanore apo bashketingellore.

 */
public class Ushtrimi15 {
    public static void main(String []args)
    {
        Scanner s=new Scanner (System.in);
        System.out.println("Jeni nje shkronje");
        String shkronja=s.next();
        shkronja=shkronja.toLowerCase();
        char sh=shkronja.charAt(0);
        char a ='a',e='e',ë='ë',i='i',o='o',u='u',y='y';
        if (sh>=97&&sh<=122)
        {
            if(sh==(a)) System.out.println("Shkronja eshte zanore"); 
            else if(sh==(e)) System.out.println("Shkronja eshte zanore"); 
            else if(sh==(ë)) System.out.println("Shkronja eshte zanore"); 
            else if(sh==(i))System.out.println("Shkronja eshte zanore"); 
            else  if(sh==(o))System.out.println("Shkronja eshte zanore"); 
            else if(sh==(u)) System.out.println("Shkronja eshte zanore"); 
            else if(sh==(y))System.out.println("Shkronja eshte zanore"); 
                
            else 
                System.out.println("Shkronja eshte bashketingellore");
                              
                            
            
       
        }
      else   System.out.println("Kjo nuk eshte nje shkronje");
    }
}
                     
       
        
                
    
  

