
package Skedaret;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;


public class Frame1 extends JFrame 
{
    private JTextArea area;
    private JButton btn;
    private JPanel panel;
    private File f=null;
    private Scanner scn=null;
    
    public Frame1()
    {
        setSize(600,600);
        area=new JTextArea(8,15);
        btn=new JButton("Afisho");
        panel=new JPanel();
        panel.add(area);panel.add(btn);
        Container cp=getContentPane();
        cp.add(panel,"Center");
        ButtonListener listener=new ButtonListener();
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
            area.setText("");
            JFileChooser chooser=new JFileChooser();
            int result=chooser.showOpenDialog(null);
            if(result==JFileChooser.APPROVE_OPTION)
                f=chooser.getSelectedFile();
            try
            {
                scn=new Scanner(f);
                while(scn.hasNextLine())
                {
                    String line=scn.nextLine();
                    area.setText(area.getText()+"\n"+line);
                }
            }
            catch(FileNotFoundException ex)
            {
                System.out.println("error");
            }
            finally
            {
                scn.close();
                        
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
