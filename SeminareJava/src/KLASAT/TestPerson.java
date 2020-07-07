
package KLASAT;
import java.util.*;

public class TestPerson 
{
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
        
        Person p1=new Person();
        Person p2=new Person("beni",20,'m');
        System.out.println("Jepni te dhenat e p3");
        String name=scn.next();
        int mosha=scn.nextInt();
        String gjinia=scn.next();
        char gjender=gjinia.charAt(0);
        Person p3=new Person(name,mosha,gjender);
        System.out.println("Te dhenat e p1: \n"+p1.toString());
         System.out.println("Te dhenat e p2: \n"+p2.toString());
          System.out.println("Te dhenat e p3: \n"+p3.toString());
        p2.setMosha(22);
         System.out.println("Mbas ndryshimit mosha e p2 eshte"+p2.getMosha());
    }
}
