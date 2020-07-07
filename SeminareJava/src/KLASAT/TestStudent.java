/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KLASAT;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class TestStudent {
    public static void main(String []args){
        Scanner input=new Scanner (System.in);
        System.out.println("Jepni te dhenat e studentit te pare: \n");
        System.out.println("Emir: ");
        String emri=input.next();
        System.out.println(" Dega: ");
        String dega=input.next();
        System.out.println(" Nr krediteve: ");
        int k=input.nextInt();
        Student s1=new Student (emri,dega,k);
        
        System.out.println("Jepni te dhenat e studentit te Dyte: \n");
         System.out.println("Emir: ");
        emri=input.next();
        System.out.println(" Dega: ");
        dega=input.next();
        System.out.println(" Nr krediteve: ");
        k=input.nextInt();
        Student s2=new Student (emri,dega,k);
        System.out.println("Te dhenat e s1: \n"
        +s1.toString());
        System.out.println("Te dhenat e s2: \n"
        +s2.toString());
        s1.krahaso(s2);
    
}
}