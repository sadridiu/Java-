/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaUshtrime4;

import java.util.Scanner;

/**
 *
 * @author sadri
 * Shkruani nje program qe merr kod ASCII ne input nga perdoruesi 
 * (Nje numer i plote midis 0 dhe 127 ) dhe afishon 
 * karakterin e tij korrespodent,
 * ndersa kur perdoruesit i kerkojm nje karakter ne input programi afishon Unicode-in e tij,
 */
public class Ushtrimi14 {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Jepni nje kod ASCII nje numer te plote midis (0 dhe 127)");
        int a=s.nextInt();
        char ch1=(char)a;
        System.out.println(ch1);
        
        System.out.println("Jepni nje karakter:");
        String ch2=s.next();
        char ch3 = ch2.charAt(0);
        int ch4=(int)ch3;
        System.out.println(ch4);
    }
    
    
}
