/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktor;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class testAktor {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        Aktor a1=new Aktor();
        System.out.println("Jepni emrin e aktorit/es");
        a1.emri=input.next();
        System.out.println("Jepni mbiemrin e aktorit/es");
        a1.mbiemri=input.next();
        System.out.println("Jepni vendlindjen e aktorit/es");
        a1.vendlindja=input.next();
        System.out.println("Jepni datelindjen e aktorit/es");
        a1.ditelindja=input.next();
        System.out.println("Jepni moeshn e aktorit");
        a1.mosha=input.nextInt();
        a1.AfishoTeDhena();
    }
    
}
