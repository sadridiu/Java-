/*
Shkruani nje metode sipas percaktimit te meposhtem per te afishuar nje numer te plote invers.
public static void invers (int numer);
psh invers 2345 afishon 5432
Shkruani nje program test qe i kerkon perdoruesit te jape nje numer te plote 
dhe te afishoj ate invers;
 */
package JavaUshtrime6;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in);
        System.out.println("Jepni nje numer te plote: ");
        int nr = scn.nextInt();
        invers(nr);
    }
    public static void invers(int numer){
        int nr_ri = 0,mbetja = 0;
        while(numer!=0){
            mbetja = numer %10;
            numer /=10;
            nr_ri =nr_ri * 10 +mbetja ;
        }
        System.out.println("inversi i tij eshte "+nr_ri);
    }
    
}
