/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chasemuajibreak;

import java.util.Scanner;

/**
 *
 * @author Instam
 */
public class Chasemuajibreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    Scanner s=new Scanner(System.in);
    System.out.println("Jepni nje vlere nga 1 ne 4");
    int muaji=s.nextInt();
      switch(muaji){
          case 1: System.out.println("Muaji Janar");break;
          case 2: System.out.println("Muaji Shkurt");break;
          case 3: System.out.println("Muaji Mars");break;
          case 4:System.out.println("Muaji Prill");break;
          default:System.out.println("Muaji nuk eshte midis vlerave");break;}
                    
    }
    

}
 