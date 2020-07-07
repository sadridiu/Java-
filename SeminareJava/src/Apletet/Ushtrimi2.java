
package Apletet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.Ellipse2D;
import javax.swing.JApplet;

public class Ushtrimi2 extends JApplet {

public void paint(Graphics g){
    Graphics2D g2=(Graphics2D)g;
    Ellipse2D.Double rect1=new Ellipse2D.Double(30,70,200,200);
    g2.setColor(Color.green);
    g2.fill(rect1);
    
    }
   
}
