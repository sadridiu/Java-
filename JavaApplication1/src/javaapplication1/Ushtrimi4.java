
package javaapplication1;

import java.util.Scanner;

public class Ushtrimi4 {
    
 
    public static void main(String[] args) {
        int numri,piket,max=-999;
        String emri,shembullori = null;
        Scanner scn=new Scanner (System.in);
        System.out.println("Jepni nr e studenteve ");
        numri = scn.nextInt();
        
        for(int i =1;i<=numri;i++)
        {
            System.out.println("Jepni emrin e studentit"+i);
            emri = scn.next();
            System.out.println("Jepni nr e pikeve te studentit"+i);
            piket = scn.nextInt();
            if (piket > max)
            {
                max=piket;
                shembullori=emri;
            }
            
        }
        System.out.println("Studenti me pike me te larta eshte "+shembullori);
    }
    
}
