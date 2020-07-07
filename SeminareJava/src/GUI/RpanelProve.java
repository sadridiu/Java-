
package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RpanelProve extends JPanel
{
    private Rectangle rect;
    private int x=200,y=100,w=100;
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        rect=new Rectangle(x,y,w,w);
        g2.setColor(Color.blue);
        g2.fill(rect);
    }
    
    public void zhvendos(int dx,int dy)
    {
        x=x+dx;
        y=y+dy;
        repaint();
    }
}