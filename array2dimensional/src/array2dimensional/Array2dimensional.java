/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2dimensional;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Array2dimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
     System.out.println("Jepni dimensionet e tabeles");
      int m=input.nextInt();
      int n=input.nextInt();
      int [][]t=new int[m][n];
      
      for( m=0;m<t.length;m++){
          for( n=0;n<t[m].length;n++)
              t[m][n]=n;
      }
      sum(t);
      
    }
    
                 
     public static void sum(int[][] m){
        int row,column;
        for( row=0;row<m.length;row++){
           
            for( column=0;column<m[row].length;column++){
                 System.out.print(m[row][column]+" ");
             
        }    
        System.out.println();  
        }
     }
}
