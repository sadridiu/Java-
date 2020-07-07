/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apletet;

import java.applet.Applet;
import java.awt.event.MouseEvent;
import javax.swing.JApplet;

/**
 *
 * @author sadri
 */

    public class MouseSpyApplet extends Applet
{ 
 public MouseSpyApplet()
{ MouseSpy listener = new MouseSpy();
addMouseListener(listener);
}

public interface MouseListener
{ void mouseClicked(MouseEvent event);
// Called when the mouse has been clicked on a component
void mouseEntered(MouseEvent event);
// Called when the mouse enters a component
void mouseExited(MouseEvent event);
// Called when the mouse exits a component
void mousePressed(MouseEvent event);
// Called when a mouse button has been pressed on a component
void mouseReleased(MouseEvent event);
// Called when a mouse button has been released on a component
}
   
class MouseSpy implements MouseListener
{ public void mouseClicked(MouseEvent event)
{ System.out.println("Mouse clicked.x="
+ event.getX()+"y="+ event.getY());
}
public void mouseEntered(MouseEvent event)
{ System.out.println("Mouse entered.x="
+ event.getX()+"y="+ event.getY());
}
public void mouseExited(MouseEvent event)
{ System.out.println("Mouse exited.x="
+ event.getX()+"y="+ event.getY());
}
public void mousePressed(MouseEvent event)
{ System.out.println("Mouse pressed.x="
+ event.getX()+"y="+ event.getY());
}
public void mouseReleased(MouseEvent event)
{ System.out.println("Mouse released.x="
+ event.getX()+"y="+ event.getY());
}
}
}