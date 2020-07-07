package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Frame8 extends JFrame 
{
    private JLabel lbl1,lbl2,lbl3;
    private JTextField txt;
    private JComboBox combo1,combo2;
    private JButton btn;
    private JPanel panel1,panel2;
    
    public Frame8() 
    {
        setSize(500,500);
        lbl1=new JLabel("Temp");
        lbl2=new JLabel("Nga");
        lbl3=new JLabel("Ne");
        txt=new JTextField(10);
        btn=new JButton("Konverto");
        combo1=new JComboBox();
        combo2=new JComboBox();
        combo1.addItem("Zgjidh");
        combo1.addItem("Celcius");
        combo1.addItem("kelvin");
        combo2.addItem("Zgjidh");
        combo2.addItem("Celcius");
        combo2.addItem("kelvin");
        panel1=new JPanel();
        panel2=new JPanel();
        panel1.add(lbl1);
        panel1.add(txt);
        panel2.add(lbl2);
        panel2.add(combo1);
        panel2.add(lbl3);
        panel2.add(combo2);
        panel2.add(btn);
        Container cp=getContentPane();
        cp.add(panel1,"North");
        cp.add(panel2,"Center");
        ButtonListener listener=new 
            ButtonListener();
        btn.addActionListener(listener);
        addWindowListener(new WindowCloser());
    }
    private class WindowCloser extends 
            WindowAdapter
    {
        public void windowClosing(
                WindowEvent e)
        {
            System.exit(0);
        }
    }
    private class ButtonListener implements
            ActionListener
    {
        public void actionPerformed(
                ActionEvent e)
        {
            int temp=Integer.parseInt(txt.getText());
            String from=(String)combo1.getSelectedItem();
            String to=(String)combo2.getSelectedItem();
            if( from.equalsIgnoreCase("celcius")==true &&
                to.equalsIgnoreCase("kelvin")==true)
            {
                int result=temp+273;
                JOptionPane.showMessageDialog(null,"Temp ne kelvin = "+result);
            }
            else 
            if( (from.equalsIgnoreCase("kelvin")==true) &&
                 (to.equalsIgnoreCase("celcius")==true))
            {
                int result=temp-273;
                JOptionPane.showMessageDialog(null,"Temp ne celcius = "+result);
            }
            else 
                JOptionPane.showMessageDialog(null,"Konvertim jo i vlefshem");
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
}
