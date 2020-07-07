/*
 Skedari student.txt mban ne cdo rekord emrin e studentit dhe piket qe ka marre 
ne cdo pyetje te nje provimi. 
Afishoni per cdo student emrin dhe totalin e pikeve qe ai ka marre ne provim. 
Afishoni emrin e studentit qe ka marre me shume pike.

 */
package Skedaret;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class TotaliNotave extends javax.swing.JFrame 
{private JTextArea area;
    private JButton btn;
    private JPanel panel,panel2;
    private Scanner scn=null;
    private JTextField txt;
    private JLabel lbl;
    public TotaliNotave()
    {
        setSize(600,600);
        area=new JTextArea(8,15);
        btn=new JButton("Afisho");
        txt=new JTextField(10);
        txt.setEditable(false);
        lbl=new JLabel("Studenti me me shume pike: ");
        panel=new JPanel();
        panel2=new JPanel();
        panel.add(area);panel.add(btn);
        panel2.add(lbl);panel2.add(txt);
        Container cp=getContentPane();
        cp.add(panel,"Center");
        cp.add(panel2,"South");
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
            File f=new File("C:/Users/sadri/Documents/student.txt");
            String emri = null;
            int piket = 0;
            int shuma = 0;
            int max=-999;
            String shembullori=null;
            try
            {
                scn=new Scanner(f);
                while(scn.hasNextLine())
                {
                    String line=scn.nextLine();
                    StringTokenizer tokenizer=new StringTokenizer(line);
                        while(tokenizer.hasMoreTokens())
                        {
                            String token=tokenizer.nextToken();
                            if (!token.matches("[a-zA-Z_]+"))
                            {
                             piket=Integer.parseInt(token);
                            }
                            else
                            {
                             emri=token;
                            }
                        }
                 shuma+=piket;
                 if(shuma>max)
                 {
                    max=shuma;
                    shembullori=emri;
                 }
                  area.setText(area.getText()+"\n"+ emri+" ka  total  prej "+ piket +" pikesh "); 
                  txt.setText(shembullori);
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
