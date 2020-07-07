/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shumamatricave;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Shumamatricave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    int[][]m=new int[3][3];
    System.out.println("Enter"+m.length+"rows and"+m[0].length+"columns:");
    for(int i=0;i<m.length;i++){
        for(int j=0;j<m[i].length;j++)
            m[i][j]=(int)(Math.random()*50);
    }
   
    sum(m);
    }
    public static void sum(int[][] m){
        int row,column;
        for( row=0;row<m.length;row++){
           
            for( column=0;column<m[row].length;column++){
                
                System.out.println(m[row][column]+" "); 
                    
                    
              
        }
        }
        
      
    }
}
