/*
 
 */
package JavaUshtrime5;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi12_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Jepni nr e rreshtave");
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        for(int i = n;i >= 1;i--)
        {
            for(int j = 1;j <= n-i;j++){
                System.out.print(" ");
            }
            for(int h=1; h<= i;h++){
                System.out.print(h);
            }
            System.out.println();
        }
    }
    
}
