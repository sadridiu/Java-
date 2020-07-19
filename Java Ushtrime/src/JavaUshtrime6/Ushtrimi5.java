/*
 Shkruani nje metode per te shfaqur figuren e meposhtme sipas deklarimit
te metodes
public static void afishoFigure(int n)
    1
   21
  321
 */
package JavaUshtrime6;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi5 {

    
    public static void main(String[] args) {
        System.out.println("Jepni nr e rreshtave:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        afishoFigure(n);
    }
    public static void afishoFigure(int n){
        
        for (int i = 1; i <= n; i++) {
            int r = i;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(r);
                r--;
            }
            System.out.println("");
        }
        
    }
    
}
