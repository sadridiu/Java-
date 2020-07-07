
package GUI;

import javax.swing.*;
import java.awt.event.*;
public class Frame2 extends JFrame
{
    public Frame2()
    {
     final int Width=300;
     final int Height=300;
     setSize(Width,Height);
     WindowCloser listener=new WindowCloser();
     addWindowListener(listener);
    }
    private class WindowCloser extends WindowAdapter
    {
       public void windowCloser(WindowEvent event) 
       {
           System.exit(0);
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
