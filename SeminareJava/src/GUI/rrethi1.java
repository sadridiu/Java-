/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;



/**
 *
 * @author Albani
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class rrethi1 extends JFrame {

    private JLabel lbl;
    private JTextField item1;
    private RrethiPanel1 rp;
    private JButton btn;
    private JPanel panel1,panel2,panel3;
   
    public rrethi1 ()
    {
        setSize(600,600);
        lbl=new JLabel("Rezja");
        item1=new JTextField(10);
        btn=new JButton("Vizato Rrethin");
        
        rp=new RrethiPanel1();
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

}
