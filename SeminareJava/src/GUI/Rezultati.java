
package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author sadri
 */
public class Rezultati extends JFrame {
    
    private JLabel lbl1,lbl2,lbl3,lbResult;
    private JTextField item1,item2;
    private JButton btn1,btn2,btn3,btn4;
    private JPanel panel1,panel2,panel3;
    
     double result;
     
    
   public Rezultati ()
    {
        setSize(330,195);
        btn1=new JButton("+");
        btn2=new JButton("-");
        btn3=new JButton("*");
        btn4=new JButton("/");
        
        lbl1=new JLabel("Numri 1");
        item1=new JTextField(10);
        lbl2=new JLabel("Numri 2");
        item2=new JTextField(10);
        lbl3=new JLabel("Rezultati:");
        lbResult=new JLabel("");
        
        
        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        
        
        panel1.add(lbl1);
        panel1.add(item1);
        panel1.setLayout(new GridLayout(2,2));
        
        panel1.add(lbl2);
        panel1.add(item2);
        
        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        panel2.add(btn4);
        
        panel3.add(lbl3);
        panel3.add(lbResult);
        
        
        Container cp=getContentPane(); 
        cp.add(panel1,"North"); 
        cp.add(panel2,"Center");
        cp.add(panel3,"South");
        
        
        ButtonListener listener =new ButtonListener(); 
        
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
            double nr1=Double.parseDouble(item1.getText());
            double nr2=Double.parseDouble(item2.getText());
            result=nr1+nr2;
            lbResult.setText(""+result);
            Object obj=e.getSource();
            if(obj==btn1){
                 nr1=Double.parseDouble(item1.getText());
                 nr2=Double.parseDouble(item2.getText());
               result=nr1+nr2;
               lbResult.setText(""+result);
            }
            else if(obj==btn2)
            {
                nr1=Double.parseDouble(item1.getText());
                nr2=Double.parseDouble(item2.getText());
                result=nr1-nr2;
               lbResult.setText(""+result);
            }
               
            else if(obj==btn3)
            {
                nr1=Double.parseDouble(item1.getText());
                nr2=Double.parseDouble(item2.getText());
                result=nr1*nr2;
               lbResult.setText(""+result);
            }
                
            else if(obj==btn4)
            {
                nr1=Double.parseDouble(item1.getText());
                nr2=Double.parseDouble(item2.getText());
                result=nr1/nr2;
               lbResult.setText(""+result);
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
