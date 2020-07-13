/*
    Shkruani nje cikel for te nderfutur qe afishon figuren e meposhtme:
           1
         1 2 1
       1 2 4 2 1
     1 2 4 8 4 2 1
 */
package JavaUshtrime5;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi13 {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Jepni nje numer ");
        int n = scn.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {   
                System.out.print(" "+" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print((int)(Math.pow(2,k-1))+" ");
            }
            for(int l=i-1;l>=1;l--)
            {
                System.out.print((int)(Math.pow(2,l-1))+" ");
            }
            System.out.println();
        }
        

    }
    
}
