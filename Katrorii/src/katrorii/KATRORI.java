/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katrorii;

import java.util.Scanner;

/**
 *
 * @author Instam
 */
public class KATRORI {
    public static void main (String[]args){
        Scanner s=new Scanner (System.in);
        System.out.println("Jepni brinjen e katrorit");
        int a=s.nextInt();
        Katrorii k1=new Katrorii(a);
       System.out.println("Katrori me brinje"+k1.setbrinja()+" ka siperfaqe "+k1.setSiperfaqe());
      k1.AfishoTeDhena();
}
}
