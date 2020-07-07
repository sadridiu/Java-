/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KLASAT;

import java.util.Scanner;

public class TestPunonjes {
    public static void main(String []args)
    {
        Scanner input=new Scanner (System.in);
       
        Punonjes p1=new Punonjes ("beni",20,2000);
        Punonjes p2=new Punonjes ("mira",30,2000);
        System.out.println("Te dhenat e p1: \n"
        +p1.toString());
        System.out.println("Te dhenat e p2: \n"
        +p2.toString());
        p1.krahaso(p2);
    }
}
