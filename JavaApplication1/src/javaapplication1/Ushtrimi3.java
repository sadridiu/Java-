
package javaapplication1;

public class Ushtrimi3 {

    public static void main(String[] args) {
        double paga=50000;
        
        for(int i=1;i<=8;i++)
        {
            paga=paga +paga*0.05;
            System.out.println(paga);
        }
        System.out.println("Paga per 8 vite "+ paga);
    }
    
}
