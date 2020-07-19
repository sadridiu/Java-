/*
Programi 6.6 MetodaNumraThjeshte.java ka nje metode iThjeshte(int nr)
qe teston nese nje numer eshte i thjeshte .
Perdorni kete metode per te gjetur sasine e numrave te thjeshte me te vegjel se 10000;

 */
package JavaUshtrime6;

import static JavaUshtrime6.Ushtrimi7.printoNumratThjeshte;

/**
 *
 * @author sadri
 */
public class Ushtrimi7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Numrat e thjeshte me te vegjel se 10.000 jane :");
        printoNumratThjeshte(10000);
        
        
    }
    public static void printoNumratThjeshte( int nrThjeshte){
        final int SASIA_NR_TE_THJESHTE_PER_RRESHT = 10;
        int sasia = 0;
        int numri = 2;
        
        while(numri<nrThjeshte){
            if(iThjeshte(numri)){
                sasia++;
                if(sasia%SASIA_NR_TE_THJESHTE_PER_RRESHT == 0){
                    System.out.println(numri+" ");
                }
                else 
                    System.out.print( numri+" ");
            }
            numri++;
        }
    }
    public static boolean iThjeshte(int nr){
        for(int i = 2; i <=nr/2; i++){
            if(nr%i == 0){
                return false;
            }
           
        } return true;
    }
}
