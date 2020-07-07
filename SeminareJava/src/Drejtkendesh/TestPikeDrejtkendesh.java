/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drejtkendesh;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class TestPikeDrejtkendesh {
    public static void main(String []args)
    {
        Scanner input=new Scanner (System.in);
       
        System.out.println("Jepni kordinatat x,y, gjeresine dhe lartesine e Drejtkendeshit: ");
        double x=input.nextDouble();
        double y=input.nextDouble();
        double w=input.nextDouble();
        double h=input.nextDouble();
        Drejtkendesh d1=new Drejtkendesh(x,y,w,h);
        System.out.println(d1.toString());
        d1.Siperfaqe();
        System.out.println("Jepni kordinatat e pike se kerkuar: ");
        x=input.nextDouble();
        y=input.nextDouble();
        Drejtkendesh d2=new Drejtkendesh(x,y,0,0);
        Pike p2=new Pike(x,y);
        d2.krahaso(d1);
}
}
