/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventListeners;


import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.JApplet;
/**
 *
 * @author sadri
 */
public class RrethApplet2 extends Applet 
{
private Ellipse2D.Double rreth ;
private final static double width=30;
private final static double height=50;

public RrethApplet2(){
    rreth=new Ellipse2D.Double(0,0,width,height);
    MouseClickListener listener=new MouseClickListener();
    addMouseListener(listener);
}
public void paint(Graphics g){
    Graphics2D g2=(Graphics2D)g;
    g2.draw(rreth);
}
private class MouseClickListener extends MouseAdapter
{
    public void mouseClicked(MouseEvent event)
    {
        int mouseX=event.getX();
        int mouseY=event.getY();
        rreth.setFrame(mouseX,mouseY,width,height);
        repaint();
    }
}
}
