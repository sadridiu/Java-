/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Ushtrimi4Prove extends JFrame {
    private JLabel lbl1,lbl2,lbl3;
    private JTextField item1,item2,item3;
    private RrethiPanelNewProve rp;
    private JButton red,green;
    private JPanel panel1,panel2;
    
    public Ushtrimi4Prove(){
        setSize(600,600);
        lbl1 = new JLabel("Kordinata x1");
        item1 = new JTextField(5);
        lbl2 = new JLabel("Koordinata y1");
        item2 = new JTextField(5);
        lbl3 = new JLabel("Rrezja");
        item3 = new JTextField(5);
        
        red = new JButton("Red");
        green = new JButton("Green");
        rp = new RrethiPanelNewProve();
        panel1 = new JPanel();
        panel2 = new JPanel();
        
        panel1.add(lbl1);
        panel1.add(item1);
        panel1.add(lbl2);
        panel1.add(item2);
        panel1.add(lbl3);
        panel1.add(item3);
        
        panel2.add(red);
        panel2.add(green);
        
        Container cp = getContentPane();
        cp.add(panel1,"North");
        cp.add(rp,"Center");
        cp.add(panel2,"South");
        
        ButtonListener listener = new ButtonListener();
        red.addActionListener(listener);
        green.addActionListener(listener);
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
            Object obj = e.getSource();
            if(obj == red)
                {
                    rp.Vizato(item1.getText(),item2.getText(),item3.getText());
                    rp.krijoNgjyre(255,0,0);
                }
            else if(obj ==green)
            {
                rp.Vizato(item1.getText(),item2.getText(),item3.getText());
                rp.krijoNgjyre(0,255,0);
            }
        }
    }
    
}
