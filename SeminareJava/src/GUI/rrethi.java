/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author sadri
 */
public class rrethi extends JFrame {
    private JLabel lbl;
    private JTextField item1;
    private RrethiPanel rp;
    private JButton btn;
    private JPanel panel1,panel3;
    
    
    public rrethi ()
    {
        setSize(600,600);
        lbl=new JLabel("Rezja");
        item1=new JTextField(10);
        btn=new JButton("Vizato Rrethin");
        
        rp=new RrethiPanel();
        panel1=new JPanel();
        panel3=new JPanel();
        
        panel1.add(lbl);
        panel1.add(item1);
       
        panel3.add(btn);
        
        Container cp=getContentPane();
        cp.add(panel1,"North");
        cp.add(rp,"Center");
        cp.add(panel3,"South");
        
        ButtonListener listener =new ButtonListener();
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
            rp.Vizato(item1.getText());
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
