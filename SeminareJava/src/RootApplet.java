import java.awt.*;

public class RootApplet extends javax.swing.JApplet{
    int number;
    
    public void init() {
        number =1000;
    }
    
    public void paing(Graphics screen) {
        Graphics2D screen2D=(Graphics2D) screen;
        screen2D.drawString("the Square root of"+
                number+
                " is "+
                Math.sqrt(number),5,50);
    }
}