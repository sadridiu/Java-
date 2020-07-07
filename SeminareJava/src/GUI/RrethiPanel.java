/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

/**
 *
 * @author sadri
 */
public class RrethiPanel extends JPanel {
    private Ellipse2D.Double rreth;
    private int x=100,y=150,w;
    
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        rreth=new Ellipse2D.Double(x,y,w,w);
        g2.setColor(Color.red);
        g2.fill(rreth);
    }
    
    public void Vizato(String r)
    {
        int rr=Integer.parseInt(r);
        w=rr*2;
        repaint();
    }
    
}
