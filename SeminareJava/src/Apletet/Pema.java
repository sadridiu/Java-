/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apletet;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JApplet;

/**
 *
 * @author xhezi
 */
public class Pema extends JApplet 
{
    public void paint(Graphics g) 
    {
           Graphics2D g2=(Graphics2D)g;
           Line2D.Double line1=new Line2D.Double(120,60,140,20);
           Line2D.Double line2=new Line2D.Double(120,60,160,60);
           Line2D.Double line3=new Line2D.Double(140,20,160,60);
           Line2D.Double line4=new Line2D.Double(140,60,180,100);
           Line2D.Double line5=new Line2D.Double(140,60,100,100);
           Line2D.Double line6=new Line2D.Double(100,100,180,100);
           Line2D.Double line7=new Line2D.Double(140,100,80,140);
           Line2D.Double line8=new Line2D.Double(140,100,200,140);
           Line2D.Double line9=new Line2D.Double(80,140,200,140);
           Line2D.Double line10=new Line2D.Double(110,140,110,200);
           Line2D.Double line11=new Line2D.Double(110,200,170,200);
           Line2D.Double line12=new Line2D.Double(170,140,170,200);
           g2.draw(line1);
           g2.draw(line2);
           g2.draw(line3);
           g2.draw(line4);
           g2.draw(line5);
           g2.draw(line6);
           g2.draw(line7);
           g2.draw(line8);
           g2.draw(line9);
           g2.draw(line10);
           g2.draw(line11);
           g2.draw(line12);
           
    }
   
}
