/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrica;

import java.util.Scanner;

/**
 *
 * @author Lab2-1
 */
public class Matrica {

    public static void main(String[] args) {
       Scanner s=new Scanner (System.in);
       System.out.println("Jepni dimensionet e matrices");
       int m=s.nextInt();
       int n=s.nextInt();
       int [][]t=new int[m][n];
       int i,j;
       for(i=0;i<m;i++){
           for(j=0;j<n;j++){
               t[i][j]=s.nextInt();
           }
       }
       System.out.println(Shuma(t));
    }
    public static int Shuma( int [][]a){
        int i,j,sh=0;
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[0].length;j++){
                if(a[i][j]%2==1){
                    sh=sh+a[i][j];
                }
            }
        }
        return sh;
    }
    
}
