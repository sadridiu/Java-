/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katror;

import java.util.Scanner;

/**
 *
 * @author Lab2-1
 */
public class Katrori {
    public static void main(String[]args){
        Scanner s=new Scanner (System.in);
        System.out.println("Jepni brinjen e katrorit");
        double a=s.nextDouble();
        Katror k=new Katror (a);
        System.out.println("Brinja e katrorit eshte"+k.getBrinja());
        System.out.println("Siperfaqja eshte"+k.getSiperfaqe());
        k.AfishoTeDhena();
    }
}
