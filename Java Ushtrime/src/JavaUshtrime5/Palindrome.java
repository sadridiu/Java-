/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaUshtrime5;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Palindrome {
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        
        int fillim=0;
        int fund=s.length()-1;
        
        boolean Palindrome=true;
        while(fillim<fund)
                {
                    if(s.charAt(fillim)!=s.charAt(fund))
                    {
                        Palindrome=false;
                        break;
                    }
                    fillim++;
                    fund--;
                    
                }
        if(Palindrome)
            System.out.println(s+" eshte palindrome");
        else System.out.println(s+" nuk eshte palindrome");
    }
    
     
}
