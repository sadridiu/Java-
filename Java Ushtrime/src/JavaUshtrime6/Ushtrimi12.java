/*
 Disa website vendosin rregulla te caktuara per fjalkalimet.
Shkruani nje metode qe kontrollon nje string nese eshte fjalkalim i vlefshem.
Supozoni qe rregullat e fjalkalim,it jane
Fjalkalimi duhet te kete te pakten 8 karaktere
Fjalkalimi duhet te kete vetem shkronja dhe shifra
Shkruani nje program qe kerkon perdoruesit te jape fjalkalimin dhe shfaq Fjalkalim i vlefshem
nese eshte sipas rregullave te mesiperm dhe 
fjalkalim jo i vlefshem perndryshe
 */
package JavaUshtrime6;

import java.util.Scanner;

/**
 * 
 * @author sadri
 */
public class Ushtrimi12 {

    
    public static void main(String[] args) {
        System.out.println("Vendosni Fjalkalimin");  
        Scanner scn = new Scanner (System.in);
        String pass = scn.next();
        korrigjoPass( pass);
    }
    public static void korrigjoPass(String pass){
        int n = 0,p=0;
        for(int i = 0; i < pass.length();i++){
            char ch1 = pass.charAt(i);
            n++;
            if(pass.length() >8){
                
            
            if(ch1 >= 48 && ch1 <= 57){
                continue;
            }
            if(ch1 >= 65 && ch1 <= 90){
                continue;
            }
            if(ch1 >= 97 && ch1 <= 122)
           
            continue;
            }
            p++;
            System.out.println("Fjalkalim jo i vlefshem");break;
            
            
        }
        if(n == pass.length() && p == 0){
                System.out.println("Fjalkalim i vlefshem");
            }
}
}

