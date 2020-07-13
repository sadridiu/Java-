/*
    1
   12
  123
 1234
12345
 */
package JavaUshtrime5;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi12_3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Jepni nr e rreshtave"); 
        int n = scn.nextInt();

        for (int i = 0; i <= n; i++) {
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
        scn.close();

    }

}
