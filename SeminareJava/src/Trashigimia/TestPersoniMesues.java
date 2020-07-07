/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trashigimia;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class TestPersoniMesues {
    public static void main(String []args)
   
  {
  Scanner scn=new Scanner(System.in);
  String []lendet=new String[50];
  System.out.println("Jepni nr e lendeve");
  int n=scn.nextInt();
  System.out.println("Jepni lendet");
  for(int i=0;i<n;i++)
  {
      System.out.println("Jepni lenden");
      lendet[i]=scn.next();
  }
  Mesues mesuesi=new Mesues("beni","tr",
          "mesues1",lendet,n);
  System.out.println("Te dhenat e mesuesit:"
       +mesuesi.toString());
  System.out.println("Lista e lendeve");
  mesuesi.afishoLendet();
  mesuesi.shtoLende("web");
  System.out.println("Lista e lendeve mbas shtimit");
  mesuesi.afishoLendet();
  }
}
