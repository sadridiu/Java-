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
 * Shkruani nje program qe i kerkon perdoruesit te jape nje targe makine
 * dhe qe kontrollon nese targa eshte shkruar ne formatin e sakte.
 * Kini kujdes pasi targa duhet
 * if(!input.matches("[A-Z\\s]{1,}"))
        {
            System.out.println("Please enter valid name");
        }
 */
public class Ushtrimi17 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);
        String input=sc.nextLine();
        input=input.toLowerCase();
        char a1=input.charAt(0);
        char a2=input.charAt(1);
        
        char q1=input.charAt(2);
        
        char nr1=input.charAt(3);
        char nr2=input.charAt(4);
        char nr3=input.charAt(5);
        char nr4=input.charAt(6);
        
        char q2=input.charAt(7);
        
        char a3=input.charAt(8);
        char a4=input.charAt(9);
        
        if(a1>=97&&a1<=122)
        {
            if(a2>=97&&a2<=122)
            {
                if(q1==45)
                {
                    if(nr1>=48&&nr1<=57)
                    {
                        if(nr2>=48&&nr2<=57)
                        {
                            if(nr3>=48&&nr3<=57)
                            {
                                if(nr4>=48&&nr4<=57)
                                {
                                    if(q2==45)
                                    {
                                         if(a3>=97&&a3<=122)
                                         {
                                              if(a4>=97&&a4<=122)
                                              {
                                                  System.out.println("Kjo eshte nje targe");
                                              }
                                         }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else System.out.println("Kjo nuk eshte nje targe"+input);
 }
}       
       /*  if(!input.matches("[a-zA-Z_0-9_-]"))
        {
            System.out.println("Ju lutem jepni nje targe te sakte");
        }
        
        aa-3456-vv
       
     
       
        char ch3 = input.charAt(2);
        int q1=(int)ch3;
        
        char ch2 = input.charAt(7);
        int q2=(int)ch2;
        
        if(input.substring(0,2))
        {
           /* if(q1==45){
                 if(input.substring(3,6).matches("[0-9]")){
                    if(q2==45){
                            if(input.substring(8,10).matches("[A-Z]")){
                            
                                System.out.println("Kjo eshte nje targe");
                             
                        }
                       
                    }
                 
             }
             
           
        }
           
       System.out.println("Kjo eshte nje targe");       
}
        else  System.out.println("Kjo nuk eshte nje targe"+input);
    } */
       



