package Skedaret;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;


public class Frame2Prove extends JFrame 
{
    private JLabel lbl;
    private JTextField txt;
    private JButton btn;
    private JTextArea area;
    private JPanel panel1,panel2;
    private int nr=0;
    
    public Frame2Prove()
    {
        setSize(600,600);
        lbl=new JLabel("Fjala");
        txt=new JTextField(10);
        btn=new JButton ("Kontrollo");
        area=new JTextArea(5,15);
        panel1=new JPanel();
        panel2=new JPanel();
        panel1.add(lbl);
        panel1.add(txt);
        panel1.add(btn);
        panel2.add(area);
        Container cp=getContentPane();
        cp.add(panel1,"North");
        cp.add(panel2,"South");
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
         File f=null;Scanner scn=null;
         String fjala=txt.getText();
         JFileChooser chooser=new JFileChooser();
         int vlere=chooser.showOpenDialog(null);
         if(vlere==JFileChooser.APPROVE_OPTION)
         {
             f=chooser.getSelectedFile();
             try
             {
                 scn=new Scanner (f);
                 while(scn.hasNextLine())
                 {
                     String line=scn.nextLine();
                     StringTokenizer tokenizer=new StringTokenizer(line);
                     while(tokenizer.hasMoreTokens())
                     {
                         String token=tokenizer.nextToken();
                         if(token.equalsIgnoreCase(fjala)==true)
                             nr++;
                     }
                 }
                 area.setText("Fjala ndodhet "+nr+ "here ne skedare");
             }
             catch(FileNotFoundException ex)
             {
                 JOptionPane.showMessageDialog(null, "Skedari nuk gjendet");
             }
             finally
             {
                 scn.close();
             }
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
