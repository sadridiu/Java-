package Apletet;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class Dopio1 extends JApplet 
{
    Rectangle rect1;
    Rectangle rect2;
    Ellipse2D.Double rreth1;
    Ellipse2D.Double rreth2;
    
    public void paint(Graphics g){
    Graphics2D g2=(Graphics2D)g;
    rect1 =new Rectangle(50,100,200,100);
    rect2=new Rectangle(250,100,200,100);
    rreth1=new Ellipse2D.Double(140,130,30,30);
    rreth2=new Ellipse2D.Double(330,130,30,30);
    
    g2.setColor(Color.BLACK);
    g2.fill(rect1);
    g2.fill(rect2);
    g2.setColor(Color.white);
    g2.draw(rect1);
    g2.draw(rect2);
    g2.fill(rreth1);
    g2.fill(rreth2);
}
}
