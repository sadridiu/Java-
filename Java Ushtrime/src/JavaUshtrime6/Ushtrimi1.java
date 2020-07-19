/*
Shkruani nje metode qe njeheson shumen e shifrave te nje numri te plote.
Perdorni kete deklarim metode:
public static int shumaShifrave(long n);
psh shumaShifrave (345) kthen 12, (3+4+5)
 */
package JavaUshtrime6;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Jepni nje numer");
        int a = scn.nextInt();
        System.out.println(shumaShifrave(a));
        
        
    }
    public static int shumaShifrave(long n){
        int shuma = 0;
        long temp = 0;
        while (n != 0){
            temp = n%10;
            shuma +=temp;
            n = n/10;
        }
        return shuma;
    }
}
