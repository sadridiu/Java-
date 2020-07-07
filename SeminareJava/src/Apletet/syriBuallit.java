/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apletet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JApplet;

/**
 *
 * @author xhezi
 */
public class syriBuallit extends JApplet {

    public void paint(Graphics g)
    {
        int konst=20,konst1=40;
        int x=100,y=100,w=300,h=300;
        Graphics2D g2 = (Graphics2D)g;
        Ellipse2D.Double elips1 = new Ellipse2D.Double(x,y,w,h);
        x=x+konst;y=y+konst;w=w-konst1;h=h-konst1;
        Ellipse2D.Double elips2 = new Ellipse2D.Double(x,y,w,h);
        x=x+konst;y=y+konst;w=w-konst1;h=h-konst1;
        Ellipse2D.Double elips3 = new Ellipse2D.Double(x,y,w,h);
        x=x+konst;y=y+konst;w=w-konst1;h=h-konst1;
        Ellipse2D.Double elips4 = new Ellipse2D.Double(x,y,w,h);
        x=x+konst;y=y+konst;w=w-konst1;h=h-konst1;
        Ellipse2D.Double elips5 = new Ellipse2D.Double(x,y,w,h);
         g2.setColor(Color.BLACK);
         g2.fill(elips1);
         g2.setColor(Color.WHITE);
         g2.fill(elips2);
         g2.setColor(Color.BLACK);
         g2.fill(elips3);
         g2.setColor(Color.WHITE);
         g2.fill(elips4);
         g2.setColor(Color.BLACK);
         g2.fill(elips5);
    }
    
}
