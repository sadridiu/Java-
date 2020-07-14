/*
 Shkruani nje program qe lexon numra te plote, gjen me te madhin prej tyre 
dhe numeron sa here shfaqet ky numer.
Supozoni qe input-i perfundon kur jepet vlera 0.
Pra nese ju jepni vlerat 2 6 5 7 7 7 0; programi gjen si vlere maksimale 7 dhe numeron sa here shfaqet 7
pra 3 here.

 */
package JavaUshtrime5;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi17 {

    public static void main(String[] args) {
        System.out.println("Jepni numrat (0 per te perfunduar)");
        Scanner input = new Scanner(System.in);
        int nr = input.nextInt();
        int max = -999, sum = 0;
        while (nr != 0) {

            if (nr > max) {
                sum = 0;
                max = nr;

            }
            if (nr == max) {
                sum++;
            }
            nr = input.nextInt();
        }
        System.out.println("Numri me i madh eshte " + max + " dhe shfaqet: " + sum + " here");
    }

}
