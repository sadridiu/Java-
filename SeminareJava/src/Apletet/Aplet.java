package Apletet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JApplet;

public class Aplet extends JApplet 
{
    public void paint(Graphics g)
    {
        Graphics2D g2=(Graphics2D)g;
     Rectangle rect1=new Rectangle(10,10,50,20);
     Rectangle rect2=new Rectangle(70,10,40,40);
     Ellipse2D.Double rreth=new Ellipse2D.Double(10,100,50,50);
     Ellipse2D.Double elips=new  Ellipse2D.Double(70,100,50,20);
     Line2D.Double seg=new  Line2D.Double(10,190,70,190);
     g2.setColor(Color.red);
     g2.fill(rect1);
     g2.setColor(Color.blue);
     g2.draw(rect2);
     g2.setColor(Color.magenta);
     g2.fill(rreth);
     g2.draw(elips);
     g2.draw(seg);
     g2.drawString("Hello", 100, 220);
    }}
