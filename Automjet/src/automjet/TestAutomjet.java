/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automjet;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class TestAutomjet {
    public static void main(String[] args) {    
        Automjet a1 = new Automjet(); 
 
Scanner input = new Scanner (System.in); 
 
System.out.println("Jepni marken e automjetit");   
a1.marka = input.next(); 
System.out.println("Jepni ngjyren automjetit"); 
a1.ngjyra = input.next();
System.out.println("Jepni vitin e automjetit"); 
a1.viti = input.nextInt();
System.out.println("Jepni targen e automjetit"); 
a1.targa = input.next(); 
System.out.println("Jepni karburantin e automjetit"); 
a1.karburant = input.nextInt();
System.out.println("Jepni kilometrat e automjetit");
a1.kilometra = input.nextInt(); 
System.out.println("Jepni fuqin e automjetit");
a1.kuajFuqi = input.nextInt();
System.out.println("Jepni kambion e automjetit");
a1.kambio = input.next(); 
 
a1.toString(); 
 } 
}
