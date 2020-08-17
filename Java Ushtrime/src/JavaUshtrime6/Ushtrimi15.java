/*
Shkruani nje metode qe numeron sasine e  karaktereve
ne nje string duke perdorur deklarimin e meposhtem 
te metodes :
public static int Numero String(String s);
Shkruani nje program test qe i kerkon perodruesit 
nje strig te ndjekur nga nje karakter dhe shfaq sa here perseritet 
karakteri ne ate string
 */
package JavaUshtrime6;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Jepni nje String");
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println("Jepni nje karakter");
        char ch = scn.next().charAt(0);
        
        System.out.println("Karakterin ndodhet "+NumeroString(s, ch) +" here ne string");
    }
    public static int NumeroString(String s, char ch){
        int nr = 0;
        for(int i = 0 ; i < s.length();i++)
      {
           char ch1 = s.charAt(i); 
           if (ch1 == ch){
               nr ++;
           }
      }
      return nr;
    }
}
