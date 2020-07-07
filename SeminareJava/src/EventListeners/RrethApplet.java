package EventListeners;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.JApplet;

public class RrethApplet extends Applet
{
private Ellipse2D.Double rreth;
private static final double width=30;
private static final double height=50;

public RrethApplet()
{ 
rreth =new Ellipse2D.Double(0,0,width,height);

addMouseListener(new MouseClickListener());
}

public void paint(Graphics g)
{
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

