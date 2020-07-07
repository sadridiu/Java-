/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.mbrapsht;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class StringMbrapsht {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);
String s1,s2;
s2="";
System.out.println("Jepni stringun");
s1=input.next();
for(int i=s1.length()-1;i>=0;i--){
    s2=s2+s1.charAt(i);
}
System.out.println("Stringu mbrapsht eshte:"+s2);
    }
    }