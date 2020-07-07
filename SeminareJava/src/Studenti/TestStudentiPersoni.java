package Studenti;

import java.util.*;
public class TestStudentiPersoni 
{
  public static void main(String []args)
  {
  Scanner scn=new Scanner(System.in);
  String []lendet=new String[50];
  int []notat=new int[50];
  System.out.println("Jepni nr e lendeve");
  int n=scn.nextInt();
  System.out.println("Jepni lendet dhe "
          + "notat");
  for(int i=0;i<n;i++)
  {
      System.out.println("Jepni lenden");
      lendet[i]=scn.next();
      System.out.println("Jepni noten");
      notat[i]=scn.nextInt();
  }
  Studenti s=new Studenti("ana","tr",
          "s1",lendet,notat,n);
  System.out.println("Te dhenat e s:"
       +s.toString());
  System.out.println("Lista e notave:");
  s.afishoListeNotash();
  System.out.println("mes="+s.mesatare());
  s.shtoNote("c++", 8);
  s.shtoNote("web", 9);
  System.out.println("Notat mbas shtimit");
  s.afishoListeNotash();
  System.out.println("mes="+s.mesatare());
  }
}
