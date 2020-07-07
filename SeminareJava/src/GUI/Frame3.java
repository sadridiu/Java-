
package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Frame3 extends JFrame {

    private JLabel lbl; 
    private JButton btn;
    private int nr=0;
    private JPanel panel1,panel2;
    
    public Frame3()
    {
        setSize(600,600);
        lbl=new JLabel("Numero");
        btn=new JButton("Kliko");
        panel1=new JPanel();
        panel2=new JPanel();
        panel1.add(lbl);
        panel2.add(btn);
        
        Container cp=getContentPane(); 
        cp.add(panel1,"North");
        cp.add(panel2,"South");
        
        ButtonListener listener= new ButtonListener();
        btn.addActionListener(listener);
        addWindowListener(new WindowCloser());       
    }
    
    private class WindowCloser extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
    
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            nr++;
            lbl.setText("Butoni eshte klikuar "+nr+" here ");
            
        }
        
    }
   
    

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
