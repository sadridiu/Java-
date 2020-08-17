/*
Shkruani nje metode per te njehesuar shumen e meposhtme
m(i)= 1/2+ 2/3 + ... i/i+1
 */
package JavaUshtrime6;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi9 {

    
    public static void main(String[] args) {
        System.out.println("Jepni numrin e rreshtave");
        Scanner scn = new Scanner(System.in);
        int numriRreshtave =scn.nextInt();
        shuma(numriRreshtave);
    }
    public static void shuma(int nr){
        double mi = 0;
        for(int i = 1;i <=nr; i ++){
            double n = i+1;
            mi += i/n;
            System.out.println(i + "    "+mi);
        }
    }
}
