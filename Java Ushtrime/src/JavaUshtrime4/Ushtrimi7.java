/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaUshtrime4;

/**
 *
 * @author sadri
 * A mund te lejohen konvertimet e meposhtme duke perdorur operatorin cast?
 * nese po gjeni rezultatet e konvertuara
 */
public class Ushtrimi7 {
    public static void main(String[]args)
    {
        char c='A';
        int i=(int)c;
        
        float f=1000.34f;
        int o=(int) f;
        
        double d=1000.34;
        int p=(int)d;
        
        int a=97;
        char b=(char)a;
        
        System.out.println("i="+i+"\n o="+o+"\n p="+p+"\n b="+b);
        
    }
    
}
