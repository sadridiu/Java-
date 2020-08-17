/*
Shkruani nje metode qe printon karakteret duke perdorur deklarimin e meposhtem:
public static void printoKaraktere(char k1, char k2,int nr_per_rhjesht);
Kjo metode printo karaktere ndermjet k1 dhe k2 sipas numrit te percaktuar per rrjesht.
Shkruani nje program qe printon 15 karaktere per rresht nga 1 ne Z;
Karakteret ndahen saktesisht nga nje hapesire;
 */
package JavaUshtrime6;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi8 {

    
    public static void main(String[] args) {
        System.out.println("Jepni karakterin e pare: ");
        Scanner scn = new Scanner (System.in);
        String a1 = scn.next();
        char a = a1.charAt(0);
        System.out.println("Jepni karakterin e dyte: ");
        String b1 = scn.next();
        char b = b1.charAt(0);
        System.out.println("Jepni nr e karaktereve per rrjesht");
        int nr = scn.nextInt();
        printoKaraktere(a,b,nr);
    }
    public static void printoKaraktere(char k1, char k2,int nr_per_rhjesht){
        int sasia = 0;
        
        for (int i = 0;i <=nr_per_rhjesht;i++){
        if(sasia % nr_per_rhjesht == 0){
            System.out.println((char)(k1 + Math.random() * (k2-k1+1))+" ");
            sasia++;
        }
        else System.out.print((char)(k1 + Math.random() * (k2-k1+1))+" ");
        }
    }
}
