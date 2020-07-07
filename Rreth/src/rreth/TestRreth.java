/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rreth;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class TestRreth {
    public static void main(String[]args){
        
        Scanner input =new Scanner(System.in);
        Rreth r1=new Rreth();
        System.out.println("Jepni rrezen e rrethit");
        Rreth r2=new Rreth (input.nextInt());
        System.out.println("Siperfaqja ee rrethit r1 me rreze"+r1.rreze+"cm eshte"+r1.llogaritSiperfaqe());
        System.out.println("perimetri i rrethit r1 me rreze"+r1.rreze+"cm eshte"+r1.llogaritPerimeter());
        System.out.println("Siperfaqja e rrethit me r2 me rreze"+r2.rreze+"cm eshte"+r2.llogaritSiperfaqe());
        System.out.println("Perimetri i rrethit r2 me rreze"+r2.rreze+"cm eshte "+r2.llogaritPerimeter());
    }
}
