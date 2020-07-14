/*
 Nje numer i plote quhet perfekt nese ai eshte i barabarte me shumen e te gjithe plotpjestuesve te tije,
duke perjashtuar veten. Per shembull, 
6 eshte numer perfekt sepse 6 = 3 + 2 + 1.
I radhes eshte 28 sepse 28 = 14 + 7 +4 +2 + 1.
Jane 4 numra perfeklt me te vegjel se 10000.
Shkruani nje program per te gjetjen e ketyre numrave.
 */
package JavaUshtrime5;

/**
 *
 * @author sadri
 */
public class Ushtrimi16 {

    public static void main (String []args){
        
        for(int i=2;i <10000; i++){
            if (nrPerfekt(i)){
		              System.out.println(i);

	}
    }
    }
    
    
    public static boolean nrPerfekt(int vlera) {
        	int shumaplote=1;
		for(int i=2;i<=vlera/2;i++){
		
		if(vlera%i==0){
			shumaplote+=i;
		}
		
	}
	if(shumaplote==vlera)return true;
	else return false;
	
    }
    
}
	
        
    
    

