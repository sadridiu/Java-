/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.prefix;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class StringPrefix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String s1,s2,s3;
    Scanner input=new Scanner (System.in);
    System.out.println("Jepni stringun e pare");
    s1=input.next();
    System.out.println("Jepni stringun e dyte");
    s2=input.next();
    s3="";
    for(int i=0;i<=s1.length();i++){
        if(s2.length()>i)
            if(s1.charAt(i)==s2.charAt(i))
                s3=s3+s1.charAt(i);
            else break;
    }
    System.out.println("prefix="+s3);
    }
}
