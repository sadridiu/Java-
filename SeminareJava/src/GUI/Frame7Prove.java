
package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Frame7Prove extends JFrame 
{
    private JButton btn1,btn2,btn3,btn4;
    private RpanelProve panel;// Nje panel ku duhet te bejm vizatimin (nuk duhet te jete e tipit JPanel) duhet te jete emer cfardo
    private JPanel panel2;
    
    public Frame7Prove()
    {
        setSize(600,600);
        btn1=new JButton("Left");
        btn2=new JButton("Right");
        btn3=new JButton("Up");
        btn4=new JButton("Down");
        panel=new RpanelProve();
        panel2=new JPanel();
        
        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        panel2.add(btn4);
        
        Container cp=getContentPane();
        cp.add(panel,"Center");
        cp.add(panel2,"South");
        
        ButtonListener listener=new ButtonListener();
        btn1.addActionListener(listener);
        btn2.addActionListener(listener);
        btn3.addActionListener(listener);
        btn4.addActionListener(listener);
        
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
           if(obj==btn1)
               panel.zhvendos(-30, 0);
           else if(obj==btn2)
               panel.zhvendos(30,0);
           else if(obj==btn3)
               panel.zhvendos(0, -30);
           else if(obj==btn4)
               panel.zhvendos(0, 30);
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
