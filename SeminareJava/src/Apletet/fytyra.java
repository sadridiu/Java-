/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apletet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JApplet;


public class fytyra extends JApplet {

    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        Ellipse2D.Double koka = new Ellipse2D.Double(100,100,100,100);
        Ellipse2D.Double syriMajte = new Ellipse2D.Double(120,125,20,20);
        Ellipse2D.Double syriDjathte = new Ellipse2D.Double(160,125,20,20);
        Line2D.Double goja = new Line2D.Double(130,170,170,170);
        g2.setColor(Color.BLUE);
        g2.draw(koka);
        g2.draw(syriMajte);
        g2.draw(syriDjathte);
        g2.draw(goja);
    }
}

