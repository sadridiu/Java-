
package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Frame4 extends javax.swing.JFrame 
{
    private JButton btn1,btn2;
    private JPanel panel;

    public Frame4() 
    {
        setSize(500,500);
        btn1=new JButton("New");
        btn2=new JButton("Exit");
        panel=new JPanel();
        panel.add(btn1);
        panel.add(btn2);
        
        Container cp=getContentPane();
        cp.add(panel,"Center");
        
        ButtonListener listener=new ButtonListener();
        btn1.addActionListener(listener);
        btn2.addActionListener(listener);
        
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
            Object obj=e.getSource();
            if(obj==btn1){
                Frame2 frame=new Frame2();
                frame.show();
            }
            else if(obj==btn2)
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
