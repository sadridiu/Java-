/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apletet;

import javax.swing.JApplet;

/**
 *
 * @author sadri
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JApplet;

/**
 *
 * @author xhezi
 */
public class rrathetOlimpik extends JApplet {
public void paint(Graphics g)
{ 
    int x1=100,y1=100,x2,y2,x3,y3,x4,y4,x5,y5;
    int w=100,h=100;
    Graphics2D g2 = (Graphics2D)g;
    x2=x1+w;
    x3=x2+w;
    y2=y1;
    y3=y1;
    x4=x1+(w/2);
    y4=y1+(h/2);
    x5=x4+w;
    y5=y4;
    Ellipse2D.Double rreth1= new Ellipse2D.Double(x1,y1,w,h);
    Ellipse2D.Double rreth2= new Ellipse2D.Double(x2,y2,w,h);
    Ellipse2D.Double rreth3= new Ellipse2D.Double(x3,y3,w,h);
    Ellipse2D.Double rreth4= new Ellipse2D.Double(x4,y4,w,h);
    Ellipse2D.Double rreth5= new Ellipse2D.Double(x5,y5,w,h);
    g2.setColor(Color.BLUE);
    g2.draw(rreth1);
    g2.setColor(Color.BLACK);
    g2.draw(rreth2);
    g2.setColor(Color.RED);
    g2.draw(rreth3);
    g2.setColor(Color.yellow);
    g2.draw(rreth4);
    g2.setColor(Color.GREEN);
    g2.draw(rreth5);
}
    
}
