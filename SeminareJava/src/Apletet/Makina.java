/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apletet;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JApplet;

/**
 *
 * @author xhezi
 */
public class Makina extends JApplet 
{
    public void paint(Graphics g)
    {
        Graphics2D g2=(Graphics2D)g;
        Line2D.Double line1=new Line2D.Double(20,40,40,10);
        Line2D.Double line2=new Line2D.Double(40,10,70,10);
        Line2D.Double line3=new Line2D.Double(70,10,90,40);
        Rectangle rect = new Rectangle(10,40,90,30);
        Ellipse2D.Double rrota1= new Ellipse2D.Double(40,70,10,10);
        Ellipse2D.Double rrota2= new Ellipse2D.Double(70,70,10,10);
        g2.draw(line1);
        g2.draw(line2);
        g2.draw(line3);
        g2.draw(rect);
        g2.draw(rrota1);
        g2.draw(rrota2);
    }
    }
