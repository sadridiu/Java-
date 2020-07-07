/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaUshtrime4;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi19 {
    public static void main(String[]args)
    {
        Scanner s=new Scanner (System.in);
        System.out.println("Jepni 3 stringje");
        String a1=s.nextLine();
        String a2=s.nextLine();
        String a3=s.nextLine();
        
        if(a1.compareTo(a2)<0)
        {
            if(a2.compareTo(a3)<0)
                {
                    System.out.println(a1+" "+a2+" "+a3);
                }
                else  
                {
                     System.out.println(a1+" "+a3+" "+a2);
                }
        }
        
        else if(a1.compareTo(a3)<0)
                    {
                        if(a2.compareTo(a3)<0)
                        {
                         System.out.println(a2+" "+a1+" "+a3);   
                        }
                        else {
                            System.out.println(a1+" "+a3+" "+a2);
                        }
                    
                    }
        else if(a3.compareTo(a1)<0)
        {
            if(a1.compareTo(a2)<0)
            {
                System.out.println(a3+" "+a1+" "+a2);
            }
            else if(a3.compareTo(a2)<0) 
            { 
                System.out.println(a3+" "+a2+" "+a1);
            }
             else {
            System.out.println(a2+" "+a3+" "+a1);
        }
       }
    }
}
        
    
    

