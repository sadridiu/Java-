/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apletet;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

/**
 *
 * @author xhezi
 */
public class growMethod extends JApplet {
public void paint (Graphics g)
{
    Graphics2D g2=(Graphics2D)g;
    Rectangle rect = new Rectangle(100,100,50,50);
    g2.setColor(Color.GREEN);
    g2.draw(rect);
    rect.grow(25, 25);
    rect.translate(25, 25);
    g2.draw(rect);
    int w = rect.width;
    
}
   }
