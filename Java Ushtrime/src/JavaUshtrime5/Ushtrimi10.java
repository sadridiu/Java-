/*
 Shkruani nje program qe lexonn nje numer te plote dhe shfaq te gjithe plotpjestuesit e tije me te vegjel ne rendin rrites.
Per shembull, nese numri i plote eshte 144 atehere duhet te afishohet numri 2,2,2,2,3,3.
 */
package JavaUshtrime5;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi10 {

    
    public static void main(String[] args) {
       Scanner scn = new Scanner (System.in);
        System.out.println("Jepni nje numer");
        
        int nr=scn.nextInt();
        for(int i = 2; i<=nr/2 ; i++)
        {
            while( nr % i == 0)
            {   nr = nr/i;
                
                System.out.print(i+" ");
            }
        }
    }
    
}
