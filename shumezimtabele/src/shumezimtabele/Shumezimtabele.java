/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shumezimtabele;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Shumezimtabele {

   
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    System.out.println("Jepni gjatesine e tabeles");
    double []tabela=new double[input.nextInt()];
    for(int i=0;i<tabela.length;i++){
        System.out.println("Jepni elementin e "+(i+1));
        tabela[i]=input.nextInt();
    }
    System.out.println("Shumezimi i elementeve te teabeles eshte"+shumezimiTab(tabela));
    }
    public static double shumezimiTab(double[]tabela){
   double totalishumezimit=1;
   for(int i=0;i<tabela.length;i++){
       totalishumezimit*=tabela[i];
   }
   return totalishumezimit;
    }
}
