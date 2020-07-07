/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaUshtrime5;

/**
 *
 * @author sadri
 */
public class Ckilifor {
    public static void main(String []args)
    {
      double  shuma=0;
        double vleraaktuale=0.01;
        for(int i=0;i<100;i++)
        {
            shuma+=vleraaktuale;
            vleraaktuale+=0.01;
        }
        System.out.println(shuma);
    }
}
