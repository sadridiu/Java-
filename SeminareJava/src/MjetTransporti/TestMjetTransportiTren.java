/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MjetTransporti;

import java.util.Scanner;

/**
 *
 * @author Instam
 */
public class TestMjetTransportiTren {
    public static void main(String []args)
    {
       Scanner scn=new Scanner(System.in);
       System.out.println("Jepni te dhenat e trenit te pare");
       int shpejtesi1=scn.nextInt();
       int nrPasagjere1=scn.nextInt();
       int nrVagona1=scn.nextInt();
       Tren treni1=new Tren(nrVagona1,shpejtesi1,nrPasagjere1);
       System.out.println("Jepni te dhenat e trenit te dyte");
       int shpejtesi2=scn.nextInt();
       int nrPasagjere2=scn.nextInt();
       int nrVagona2=scn.nextInt();
       Tren treni2=new Tren(nrVagona2,shpejtesi2,nrPasagjere2);
    System.out.println("Te dhenat e tren1: \n"
    +treni1.toString());
    System.out.println("Te dhenat e tren2: \n"
    +treni2.toString());
    treni1.krahaso(treni2);
    }
}
