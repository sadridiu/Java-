package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;


class KeyEventPanelRectangle extends JPanel
{
    private int x=50,y=100,w=150,h=50;
    private Rectangle rect;
    private Color ngjyra;
    private int x1=0,x2=100,x3=150;
   
    public KeyEventPanelRectangle() 
    {
        KeyHandler listener=new KeyHandler();
        Mouse listener1=new Mouse();
        addMouseListener(listener1);
        addKeyListener(listener);
        setFocusable(true);
    }
    public void paintComponent(Graphics g)
    {
        rect=new Rectangle(x,y,w,h);
        ngjyra=new Color(x1,x2,x3);
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        g2.setColor(ngjyra);
        g2.fill(rect);
    }
    public void zhvendos(int dx,int dy)
    {
        x=x+dx;
        y=y+dy;
        repaint();
    }
    public void vizato(int dx,int dy)
    {
        x=dx;
        y=dy;
        repaint();
    }
    public void krijoNgjyre(int x,int y,int z)
    {
        x1=x;
        x2=y;
        x3=z;
        repaint();
    }
 
    private class Mouse extends MouseAdapter
    {
        public void mouseClicked(MouseEvent e)
        {
            int x=e.getX();
            int y=e.getY();
            vizato(x,y);
        }
    }
    private class KeyHandler implements KeyListener
    {
        public void keyTyped(KeyEvent e)
        {
            char keyChar=e.getKeyChar();
            if(keyChar=='r')
                krijoNgjyre(255,0,0);
            else  if(keyChar=='g')
                krijoNgjyre(0,255,0);
            else  if(keyChar=='b')
                krijoNgjyre(0,0,255);
            else  if(keyChar=='p')
                krijoNgjyre(255,0,255);
        }

        public void keyPressed(KeyEvent e) 
        {
            int keyCode=e.getKeyCode();
            if(keyCode==KeyEvent.VK_LEFT)
                 zhvendos(-30,0);
            else if(keyCode==KeyEvent.VK_RIGHT)
                 zhvendos(30,0);
            else if(keyCode==KeyEvent.VK_UP)
                 zhvendos(0,-30);
            else if(keyCode==KeyEvent.VK_DOWN)
                 zhvendos(0,30);
            
        }

        public void keyReleased(KeyEvent e) 
        {
          
        }
    }
   }
    