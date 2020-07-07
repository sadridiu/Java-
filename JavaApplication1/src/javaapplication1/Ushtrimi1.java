
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi1 {
       
    public static void main(String[] args) {
        int x,nrpoz=0,nrneg=0,shuma=0;
        double mes=0;
        Scanner scn = new Scanner(System.in);
        x = scn.nextInt();
        while(x!=0){
             
             System.out.println("Jepni nje numer");
             scn = new Scanner(System.in);
             x=scn.nextInt();
            if(x>0)
                nrpoz++;
            else 
                nrneg++;
            shuma+=x;
            mes=(double)shuma/(nrpoz+nrneg);
            
        }
        System.out.println("Nr pozitiv"+nrpoz+"\n Nr Negativ "+nrneg+"\n Shuma e numrave "+shuma+"\n Mesatarja "+mes);
    }
    
}
