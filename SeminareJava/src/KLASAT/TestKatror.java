/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KLASAT;

public class TestKatror {
    public static void main(String []args)
    {
        Katror k1=new  Katror(2,5,10);
        Katror k2=new Katror(5,8,20);
        System.out.println("Te dhenat e p1: \n"
        +k1.toString());
        System.out.println("Te dhenat e p2: \n"
        +k2.toString());
        k1.krahaso(k2);
    }
    
}
