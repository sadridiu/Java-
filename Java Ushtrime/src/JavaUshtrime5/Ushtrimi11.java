/*
 Shkruani nje program q i kerkon perdoruesit te jape nje numer te 
plote nga 1 ne 15 dhe shfaq piramiden si ne shembullin e meposhtem :
        1
       212
      32123
     4321234
*/
package JavaUshtrime5;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi11 {

   public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Jepni nje numer ");
        int n = scn.nextInt();
        
        for(int i=1;i<=n;i++)
        {   
            int r=i,p=2;
            for(int j=n;j>i;j--)
            {   
                System.out.print(" "+" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(r+" ");
                r--;
            }
            for(int l=i-1;l>=1;l--)
            {
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }
        

    }
    
    
}
