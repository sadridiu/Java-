/*
SHkruani nje metode qe numeron sasine e karaktereve 
ne nje string duke perdorur deklarimin e meposhtem te metodes
public static int NumeroString(String s);
Shkruani nje program test qe kerkon perdoruesit nje String dhe
shfaq numrin e karaktereve te tij

 */
package JavaUshtrime6;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi14 {

    
    public static void main(String[] args) {
        System.out.println("Jepni nje String");
        Scanner scn = new Scanner (System.in);
        String s = scn.nextLine();
        System.out.println("Stringu ka " +NumeroString(s)+" karaktere");
    }
    public static int NumeroString(String s){
//        for(int i = 0 ; i <= s.length();i++)
//        {
//            
//        }
        int nr = s.length();
        return nr;
    }
}
