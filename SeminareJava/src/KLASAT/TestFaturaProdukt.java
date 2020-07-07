
package KLASAT;

import java.util.Scanner;


public class TestFaturaProdukt {

    
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      
      Produkt p1=new Produkt();
      Produkt p2=new Produkt("makarona",100);
      
      Fatura f1 =new Fatura();
      Fatura f2 =new Fatura("126");
      Fatura f3 =new Fatura("126","oriz",150);
      
      System.out.println("Te dhenat e p1: \n"+p1.toString());
      System.out.println("Te dhenat e p2: \n"+p2.toString());
      System.out.println("Te dhenat e f1: \n"+f1.toString());
      System.out.println("Te dhenat e f2: \n"+f2.toString());
      System.out.println("Te dhenat e f3: \n"+f3.toString());
    }
    
}
