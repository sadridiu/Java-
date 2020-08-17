/*
 shkruani nje metode qe shfaq nje matrice n dhe n duke perdorur deklarimin e meposhtem
public static void printMatrix(int n)
chdo element eshte 0 ose 1 , te cilet gjenerohen ne menyre te rastesishme.
Shkruani nje program test qe kerkon perdoruesit te jape n dhe te shfaq matricen 
n x n , sipas shembullit te meposhtem
010
000
111
 */
package JavaUshtrime6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi11 {

    
    public static void main(String[] args) {
        System.out.println("Jepni permasat e matrices n");
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        printMatrix( n);
    }
    public static void printMatrix(int n){
        for (int i = 0; i < n;i++){
            for(int j = 0; j < n;j++){
                System.out.print((int) ( Math.random()*2));
            }
            System.out.println();
        }
    }
}
