/*
 Find the larges n such that n3 (n*n*n) <12000
Use a while loop to find the larges integer n such that n3 is less than 12000
 */
package Ushtrimi5;

/**
 *
 * @author sadri
 */
public class Ushtrimi5_13 {

    
    public static void main(String[] args) {
       int n  = 0;
       while( n*n*n < 12000)
       {
           n++;
       }
        System.out.println((n -1)+" ^3 is the larges number" + (n-1) +" that is less than 12000");
    }
    
}
