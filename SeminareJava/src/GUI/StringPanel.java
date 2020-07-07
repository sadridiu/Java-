package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class StringPanel extends JPanel
{
    private String str="Welcome to Java";
    private int x=200,y=100;
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        g2.setColor(Color.red);
        g2.drawString(str,x,y);
    }
    public void zhvendos(int dx,int dy)
    {
        x=x+dx;
        y=y+dy;
        repaint();
    }
}