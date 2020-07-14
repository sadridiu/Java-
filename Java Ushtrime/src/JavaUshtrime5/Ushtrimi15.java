/*
 Shkruani nje program qe shfaq te gjithe vitet e brishte, 
10 per rresht nga 101 deri ne 2100,
te ndare nga nje hapesire. 
Shfaqni numrin e viteve te brishte ne kete periudhe kohe.

Viti i brishtë është viti në të cilin muaji Shkurt i ka 29 ditë. Kjo dukuri paraqitet çdo katër vite.
Momentalisht viti i fundit i brishtë është viti 2020. Viti tjetër i brishtë është 2024, pastaj 2028 e kështu me radhë. 
Domethënë vitet e brishta janë shumëfisha të numrit 4
Çdo vit ka 365 ditë , por viti i brishtë ka 366 ditë , pasi që muaji Shkurt në çdo 4 vite ka 29 ditë.
 */
package JavaUshtrime5;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi15 {

    public static void main(String[] args) {
        
        int nrViteve=0;
        
        for(int i = 101;i <=2100; i++){
        
            if ((i%4==0 && i%100!=0) || (i%400==0)){
            nrViteve++;
             
        
            if(nrViteve %10 == 0){
            System.out.println(i);
            }
            else
                System.out.print(i+" ");
            }   
        }
            System.out.println("\nNumri i viteve te brishte ne kete periudhe kohe 101-2100 eshte: "+nrViteve);
    }
}
