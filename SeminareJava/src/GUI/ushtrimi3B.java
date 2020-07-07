package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ushtrimi3B extends JFrame {

    private JLabel lb1,lb2;
    private JTextField item1,item2;
    private JButton btn;
    private JPanel panel,panel1;


    public ushtrimi3B() 
    {
      setSize(400,400) ;
      lb1=new JLabel("Numri1");
      item1=new JTextField(10);
      lb2=new JLabel("Numri2");
      item2=new JTextField(10);
     
       
       btn=new JButton("Kontrollo");
       
       panel=new JPanel();
       panel1=new JPanel();
       panel.add(lb1);
       panel.add(item1);
       
       
       panel.add(lb2);
       panel.add(item2);
      
       panel1.add(btn);
       
     
       
       
       Container cp=getContentPane();  
        cp.add(panel,"Center");
        cp.add(panel1,"South"); 
      
        
        
       ComponentListener listener=new ComponentListener();
        
         btn.addActionListener(listener);
     
    }
    private class ComponentListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double nr1=Double.parseDouble(item1.getText());
              double nr2=Double.parseDouble(item2.getText());
              
            Object obj=e.getSource();
            
            if(obj==btn)
                
             if(nr1>nr2)
               JOptionPane.showMessageDialog(null, "Nr me i madh "+nr1);
            else
                JOptionPane.showMessageDialog(null, "Nr me i madh "+nr2);
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

