
package GUI;
import java.awt.*;
import javax.swing.*;

public class SegmentPanel extends JPanel {
    private Rectangle rect;
    private int x1=200,y1=200,brinja=50;
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        rect=new Rectangle(x1,y1,brinja,brinja);
        g2.setColor(Color.red);
        g2.fill(rect);
    }
    public void Vizato(String xx1,String yy1,String xx2)
        {
             x1=Integer.parseInt(xx1);
             y1=Integer.parseInt(yy1);
             brinja=Integer.parseInt(xx2);
             repaint();
        }
    
        public void zhvendos( int dx,int dy)
    {
        x1=x1+dx;
        y1=y1+dy;
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
