
package Apletet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JApplet;


public class Segment extends JApplet {

    public void paint(Graphics g)
    {
     Graphics2D g2=(Graphics2D)g;
     Line2D.Double seg=new  Line2D.Double(10,20,50,20);
     g2.setColor(Color.red);
     g2.draw(seg);
     }
}
