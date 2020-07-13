/*
 Shkruani nje program qe shfaq te gjithe numrat nga 100 ne 1000 dhjete per rrjesht qe jane te plotpjestueshem nga 7 e 8.
Numrat jane te ndare ekzaktesisht nga nje hapesire.
 */
package JavaUshtrime5;


public class Ushtrimi6 {

  
      public static void main(String[]args)
    {   
        int sasia=0;
        
        for (int i=100;i<=1000;i++){
            if(i %7 ==0 && i%8==0)
            {
                sasia++;
                if(sasia%10 ==0)
                {
                    System.out.println(i+" ");
                }
                else System.out.print(i+" ");
            }
        }
        
    }
    }
    

