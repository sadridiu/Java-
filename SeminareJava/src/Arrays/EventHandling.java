/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class EventHandling extends JFrame
{
    private JTextField item1,item2,item3;
    private JPasswordField passwordField;
    
    public EventHandling()
    {
        super("THe Title");
        setLayout(new FlowLayout());
        
        item1=new JTextField(10);
        add(item1);
        
        item2 = new JTextField("Enter text here");
        add(item2);
        item3 = new JTextField("uneditable",20);
        item3.setEditable(false);
        add(item3);
        
        passwordField=new JPasswordField("My pass");
        add(passwordField);
        
        thehandler handler = new thehandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }
    
    private class thehandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String string="";
            if(event.getSource()==item1)
            {
                string=String.format("Field 1: %s",event.getActionCommand());
            }
            else if(event.getSource()==item2)
            {
                string=String.format("Field 2: %s",event.getActionCommand());
            }
            else if(event.getSource()==item3)
            {
                string=String.format("Field 3: %s",event.getActionCommand());
            }
            else if(event.getSource()==passwordField)
            {
                string=String.format("Password field is :%s",event.getActionCommand());
            }
            JOptionPane.showMessageDialog(null,string);
        }
    }
    
    
    
}
