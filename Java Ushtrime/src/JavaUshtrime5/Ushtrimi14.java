/*
 Modifikoni programin 5.9 (NumratThjeshte) per te shfaqur numrat e thjeshte
ndermjet2 dhe 1000 duke perfshire te dyja vlerat. SHfaqni 8 numra te thjeshte per cdo rresht.
Numrat ndahen nga nje hapesire. 
 */
package JavaUshtrime5;

/**
 *
 * @author sadri
 */
public class Ushtrimi14 {

     public static void main(String[]args)
    {
        final int SASIA_NR_TE_THJESHTE=20;
        final int SASIA_NR_TE_THJESHTE_PER_RRESHT=8;
        int sasia=0;
        int numer=2;
        
        System.out.println("20 numrat e pa re thjeshte janne:\n");
        
        while (numer<=1000){
        
            boolean iThjeshte=true;
        
        for(int plotpjestues=2;plotpjestues<=numer/2;plotpjestues++){
            if(numer %plotpjestues==0){
                iThjeshte=false;
                break;
            }
            if(iThjeshte){
                sasia++;
                if(sasia % SASIA_NR_TE_THJESHTE_PER_RRESHT==0){
                    System.out.println(numer);
                }
                else System.out.println(numer+" ");
            }
            
            numer++;
            
        }
    }
    }
}
