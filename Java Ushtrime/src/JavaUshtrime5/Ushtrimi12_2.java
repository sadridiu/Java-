/*
123456
12345
1234
123
12
1
 */
package JavaUshtrime5;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi12_2 {

    
    public static void main(String[] args) {
        System.out.println("Jepni nr e rreshtave");
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        for (int i = 1;i <= n;i++)
        {
            for(int j = n; j>0; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    }
    

