/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shumaindekskolonmatric;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Shumaindekskolonmatric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Jepni dimensionet e matrices");
    Scanner input=new Scanner(System.in);
    int m=input.nextInt();
    int n=input.nextInt();
    int [][]t=new int[m][n];
    System.out.println("Jepni elementet e matrices");
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            t[i][j]=input.nextInt();
        }
    }
    System.out.println(Shumaindekskolone(t,1));
    
    }
    public static int Shumaindekskolone(int [][]a,int indekskolone){
        int shuma=0;
        for(int i=0;i<a.length;i++){
            shuma+=a[i][indekskolone];
        }
        return shuma;
    }
}
