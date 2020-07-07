/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apletet;


import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class domino2 extends JApplet{
    
    Rectangle rect1,rect2;
    Ellipse2D.Double rreth1,rreth2;
    
    public void paint (Graphics g){
        Graphics2D g2=(Graphics2D)g;
        
        rect1=new Rectangle(50,100,200,100);
        rect2=new Rectangle(250,100,200,100);
        
        rreth1=new Ellipse2D.Double(140,130,30,30);
        rreth2=new Ellipse2D.Double(340,130,30,30);
        
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