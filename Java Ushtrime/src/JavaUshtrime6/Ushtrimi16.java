/*
 Nje numer i thjeshte Palindrome eshte nje numer
i thjeshte qe gjithashtu  eshte Palindrome;.
Psh 131 eshte i thjeshte dhe gjithashtu eshte Palindrome
sic jane 313 757 .
Shkruani nje program qe shfaq 20 numrat e pare 
te thjeshte palindrome.
Shkruani 5 numra per rresht te ndare saktesisht nga nje hapesire si ne vazhdim:


 */
package JavaUshtrime6;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi16 {

    
    public static void main(String[] args) {
        
        
        int sasia = 0;
        int numer = 101;
        
        
        
         for(int i = 100; i <= numer; i++){
             String s = numer +"";
             int fund=s.length()-1;
             int fillim=0;
            
        boolean Palindrome=true;
        while(fillim < fund)
                {
                    if(s.charAt(fillim)!=s.charAt(fund))
                    {
                        Palindrome=false;
                        break;
                    }
                    fillim++;
                    fund--;
                    
                }
        if(Palindrome){
            
                if(numer  % i == 0)
                    continue;
                else {
                        if(sasia % 5 == 0 ){
                             System.out.println(numer);
                     
                        }else { 
                            
                            System.out.print(numer +" ");
                
                }
                    sasia++; 
                    if(sasia % 20 == 0){
                        break;
                    }
                }
        }
        
        numer++;
        
        }
         
    }
    
}

