/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complete_java_gui;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;

/**
 *
 * @author sadri
 */
public class MainFrame extends JFrame 
{
    private TextPanel textPanel;
    
    private Toolbar toolbar;
    
    public MainFrame()
    {
        super("Hello World");
        
        setLayout(new BorderLayout());
        toolbar=new Toolbar();
        textPanel=new TextPanel();
        
        toolbar.setTextPanel(textPanel);
        
        
        
        
        add(toolbar,BorderLayout.NORTH);
        add(textPanel,BorderLayout.CENTER);
        
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
