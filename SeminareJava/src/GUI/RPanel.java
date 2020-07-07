
package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RPanel extends JPanel {
    private Rectangle rect;
    private int x=200,y=100,w=100; //vetem gjeresin =katror
    
    public void paintComponent(Graphics g) //
    {
        super.paintComponent(g); 
        Graphics2D g2=(Graphics2D)g; // konvertimine Graphics2D te objektit te marre si parameter nga metoda
        rect=new Rectangle(x,y,w,w);
        g2.setColor(Color.blue);
        g2.fill(rect);
    }
    
    public void zhvendos( int dx,int dy)
    {
        x=x+dx;
        y=y+dy;
        repaint();
    }
    
    
}
