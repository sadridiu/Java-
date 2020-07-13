/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaUshtrime5;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi12_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Jepni nr e rreshtave");
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt(); 
        
        for(int i = n; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    }
    

