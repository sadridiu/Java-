
package GUI;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

public class RrethiPanelNew extends JPanel {
    private Ellipse2D.Double rreth;
    private int x=200,y=200,w=50;
    private Color ngjyra;
    private int p1=0,p2=100,p3=150;

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        rreth=new Ellipse2D.Double(x,y,w,w);
        ngjyra=new Color(p1,p2,p3);
        g2.setColor(ngjyra);
        g2.fill(rreth);
    }
    public void Vizato(String xx1,String yy1,String xx2)
        {
             x=Integer.parseInt(xx1);
             y=Integer.parseInt(yy1);
             w=Integer.parseInt(xx2);
             repaint();
        }
    
        
    
     public void krijoNgjyre(int pp1,int pp2,int pp3)
    {
        p1=pp1;
        p2=pp2;
        p3=pp3;
        repaint();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
