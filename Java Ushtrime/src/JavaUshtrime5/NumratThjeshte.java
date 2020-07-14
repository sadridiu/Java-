/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaUshtrime5;

/**
 *
 * @author sadri
 */
public class NumratThjeshte {
    public static void main(String[]args)
    {
        final int SASIA_NR_TE_THJESHTE=20;
        final int SASIA_NR_TE_THJESHTE_PER_RRESHT=10;
        int sasia=0;
        int numer=2;
        
        System.out.println("20 numrat e pare thjeshte janne:\n");
        
        while (sasia < SASIA_NR_TE_THJESHTE){
        
            boolean iThjeshte=true;
        
        for(int plotpjestues = 2;plotpjestues <= numer/2;plotpjestues++){
            if(numer % plotpjestues == 0){
                iThjeshte = (false);
                break;
            }
            if(iThjeshte){
                sasia++;
                
                if(sasia % SASIA_NR_TE_THJESHTE_PER_RRESHT == 0){
                    System.out.println(numer);
                }
                else System.out.println(numer+" ");
            }
            numer++;
        }
    }
    }
    
}
