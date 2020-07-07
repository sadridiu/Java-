/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerkimilinear;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Kerkimilinear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    System.out.println("Jepni numrin e do te kerkoni ne tabele(intervali 0-50");
   
    int []t=new int[50];
    for(int i=0;i<=t.length;i++){
        t[i]=(int)(Math.random()*50);
    }
     int a=input.nextInt();
     int indeksi=gjejNumrin(t,a);
    if (indeksi==-1)
       {System.out.println("numri i kerkuar nuk u gjet!"); }
    else
       {System.out.println("numri"+a+"prezent ne tabele ne pozicionin me indeks"+indeksi);}
    
    System.out.println("elementet e tabeles jane:");
    for(int i=0;i<t.length;i++){
        System.out.println(t[i]);
    }
    
    }
    public static int gjejNumrin(int []t,int a){
        int indeksi=-1;
        for(int i=0;i<t.length;i++){
            if(a==t[i]){
                indeksi=i;
                break;
          }
        }
    return indeksi;
    
}
}