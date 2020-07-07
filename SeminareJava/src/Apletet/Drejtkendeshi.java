
package Apletet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JApplet;

public class Drejtkendeshi extends JApplet {

public void paint(Graphics g){
    Graphics2D g2=(Graphics2D)g;
    Rectangle rect1=new Rectangle(0,0,25,15);
    g2.setColor(Color.green);
    g2.fill(rect1);
    
    }
   
}
