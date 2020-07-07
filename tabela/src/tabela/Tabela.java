/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabela;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Tabela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int []tabela=new int [7];
     Scanner input=new Scanner (System.in);
     for (int i=0;i<tabela.length;i++){
         System.out.println("Jepni numrin e "+(i+1));
         tabela[i]=input.nextInt();
     }
     System.out.println("te dhenate e tabeles jane:");
     System.out.println("------");
             for(int i=0;i<tabela.length;i++){
                 if(i!=tabela.length-1)
                     System.out.println(tabela[i]+", ");
                 else 
                     System.out.println(tabela[i]);
             }
             System.out.println("--------------");
    }
    
}
