/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trashigimia;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class TestPersonPensionist {
    public static void main(String []args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Jepni te dhenat e Personit: ");
        System.out.println("Jepni emrin e personit: ");
        String emri=input.next();
        System.out.println("Jepni moshen e personit: ");
        int mosha=input.nextInt();
        System.out.println("Jepni gjinin e personit: ");
        char gjini=input.next().charAt(0);
        System.out.println("Jepni pensionin mujor te personit: ");
        double p=input.nextDouble();
        Pensionist p1=new Pensionist(emri,mosha,gjini,p);
        System.out.println( p1.toString());
        p1.krahaso();
        }
    
}
