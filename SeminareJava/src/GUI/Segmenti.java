
package GUI;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Segmenti extends javax.swing.JFrame {
    private JLabel lbl1,lbl2,lbl3;
    private JTextField item1,item2,item3;
    private SegmentPanel sp;
    private JButton vizato, btn1,btn2;
    private JPanel panel1,panel2;
    

    
    public Segmenti() {
        setSize(600,600);
        lbl1=new JLabel("Kordinata x1");
        item1=new JTextField(5);
        lbl2=new JLabel("Kordinata y1");
        item2=new JTextField(5);
        lbl3=new JLabel("Brinja");
        item3=new JTextField(5);
        
        
        vizato=new JButton("Vizato");
        btn1=new JButton("Left");
        btn2=new JButton("Right");
        
        
        sp=new SegmentPanel();
        panel1=new JPanel();
        panel2=new JPanel();
        
        panel1.add(lbl1);
        panel1.add(item1);
        panel1.add(lbl2);
        panel1.add(item2);
        panel1.add(lbl3);
        panel1.add(item3);
        
        panel2.add(vizato);
        panel2.add(btn1);
        panel2.add(btn2);
        
        Container cp=getContentPane();
        cp.add(panel1,"North");
        cp.add(sp,"Center");
        cp.add(panel2,"South");
        
        ButtonListener listener=new ButtonListener();
        vizato.addActionListener(listener);
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
            if(obj==vizato)
            {
                sp.Vizato(item1.getText(),item2.getText(),item3.getText());
            }
          else if(obj==btn1)
                sp.zhvendos(-30,0);
            else if(obj==btn2)
                sp.zhvendos(30,0);
        }
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
