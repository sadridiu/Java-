/*
Shkruani nje metode e cila merr si parameter nje numer te plote
dhe e kontrollon nese eshte palindrome, duke perdorur metoden e mesiperme invers
public static int invers(int numer)

public static boolean eshte palindrome(int numer);
 */
package JavaUshtrime6;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi3 {

    
   public static void main(String[] args) {
        Scanner scn = new Scanner( System.in);
        System.out.println("Jepni nje numer te plote: ");
        int nr = scn.nextInt();
        
        System.out.println(eshtePalindrome(nr));
        
    }
    public static int invers(int numer){
        int nr_ri = 0,mbetja = 0;
        while(numer!=0){
            mbetja = numer %10;
            numer /=10;
            nr_ri =nr_ri * 10 +mbetja ;
        }
        return nr_ri;
    }
    public static boolean eshtePalindrome(int numer){
        if(invers(numer) != numer )
            return false;
        else return true;
    }
}
