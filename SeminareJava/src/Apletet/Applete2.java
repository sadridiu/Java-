
package Apletet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JApplet;

public class Applete2 extends JApplet {

public void paint(Graphics g){
    Graphics2D g2=(Graphics2D)g;
    Rectangle rect1=new Rectangle(50,50,40,40);
    Rectangle rect2=new Rectangle(100,50,40,60);
    
    Ellipse2D.Double rreth1=new Ellipse2D.Double(50,150,40,40);
    Ellipse2D.Double rreth2=new Ellipse2D.Double(150,150,50,90);
    
    Line2D.Double seg=new Line2D.Double(50,250,200,100);
    
    g2.setColor(Color.BLUE);
    g2.draw(rect1);
    g2.fill(rect2);
    g2.setColor(Color.magenta);
    g2.draw(rreth1);
    g2.fill(rreth2);
    g2.draw(seg);
    
    g2.drawString("hello", 200, 200);
    
    }
   
}
