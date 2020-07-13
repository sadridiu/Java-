/*
 Perdorni ciklet e nderfutur per te shfaqur format e meposhtme:
1
12
123
1234
 */
package JavaUshtrime5;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi12_1 {

    
    public static void main(String[] args) {
        System.out.println("Jepni nr e rreshtave");
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        for (int i = 1;i <= n;i++)
        {
            for(int j = 1; j<= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
