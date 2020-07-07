/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shumaelementevesimetrik_vektor;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Shumaelementevesimetrik_vektor {

   public static void shumaELS(int[]a){
       int max=-999,poz1=-1,poz2=-1;
       for(int i=0;i<a.length/2;i++){
       if(a[i]+a[a.length-i-1]>max){
           max=a[i]+a[a.length-i-1];
       poz1=i;
       poz2=a.length-i-1;
       }
    }
       
    System.out.println("elementet simetrik me shume me te madhe jane"+a[poz1]+" dhe "+a[poz2]);
   }
    
    public static void main(String[] args) {
       System.out.println("Jepni gjatesine e vek");
       Scanner s=new Scanner (System.in);
       int n=s.nextInt();
       int []a=new int[n];
       for(int i=0;i<a.length;i++){
           a[i]=s.nextInt();
       }
       shumaELS(a);
    }
    
}
