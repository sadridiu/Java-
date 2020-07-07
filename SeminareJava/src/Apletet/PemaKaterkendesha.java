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

public class PemaKaterkendesha extends JApplet 
{
    int width=30,height=20,konst=10,x=90,y=20;
    public void paint(Graphics g) 
    {
        int i=0;
          
       Graphics2D g2=(Graphics2D)g;
       while(i<1)
       {Rectangle rect = new Rectangle(x,y,width,height);
         
           if(i%2==0)
           {
               g2.setColor(Color.red);
           }
           else
           {
               g2.setColor(Color.black);
           }
           g2.fill(rect);
           x=x-konst;
           y=y+height;
           width=width+2*konst;
         i++;
       }
    }
}
