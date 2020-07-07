
package javaapplication1;

import java.util.Scanner;


public class Ushtrimi5 {

   
    public static void main(String[] args) {
       int nr,piket,max1=-999,max2=-999;
       String emri,shembullor1 = null,shembullor2 = null;
       Scanner scn = new Scanner (System.in);
        System.out.println("Jepni nr e studenteve");
        nr = scn.nextInt();
        for(int i = 0;i < nr;i++)
        {
            System.out.println("Jepni emrin e studentit te "+i);
            emri = scn.next();
            System.out.println("Jepni nr e pikeve te studentit "+i);
            piket = scn.nextInt();
            
            if(piket > max1)
            {   
                max1 = piket;
                shembullor1 = emri;
                
            }
            else if(piket > max2 && piket < max1)
            {
                max2 = piket;
                shembullor2 = emri;
            }
            else 
            {
               max1 = piket;
               shembullor1 = emri; 
               max2 = piket;
                shembullor2 = emri;
            }
            
            
            
          
        }  
        System.out.println("Studenti ne vendin e pare eshte "+shembullor1+"\n Studenti ne vendin e dyte eshte "+shembullor2);
    }
    
}
