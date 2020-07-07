
package KLASAT;

import java.util.Scanner;


public class TestAutorLiber {
      public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
        
        Autor a1=new Autor();
        Autor a2=new Autor("beni","Beni@yahoo.com");
        System.out.println("Jepni emrin dhe emailinin e Autor3");
        String name=scn.next();
        String email=scn.next();
        Autor a3=new Autor(name,email);
        System.out.println("Te dhenat e p1: \n"+a1.toString());
        System.out.println("Te dhenat e p2: \n"+a2.toString());
        System.out.println("Te dhenat e p3: \n"+a3.toString());
        System.out.println("Metoda getAutor e p3: \n"+a3.getAutor());
        
        Liber l1=new Liber();
        Liber l2=new Liber("Titulli",1000);
        Liber l3=new Liber("the power of now",1000," Eckhart Tolle");
        System.out.println("Te dhenat e p1: \n"+l1.toString());
        System.out.println("Te dhenat e p2: \n"+l2.toString());
        System.out.println("Te dhenat e p3: \n"+l3.toString());
    }
}

