
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ushtrimi3A extends JFrame {

    private JLabel lb1;
    private JTextField item1;
    private JButton btn;
    private JPanel panel,panel1;


    public ushtrimi3A() 
    {
      setSize(400,400) ;
      lb1=new JLabel("Jepni nr");
      item1=new JTextField(10);
      
      
     
       
       btn=new JButton("Kontrollo");
       
       panel=new JPanel();
       panel1=new JPanel();
       panel.add(lb1);
       panel.add(item1);
       
       
       
       
      
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
            
              
            Object obj=e.getSource();
            
            if(nr1%2==0)
               JOptionPane.showMessageDialog(null, "Nr eshte Cift");
            else
                JOptionPane.showMessageDialog(null, "Nr eshte Tek");
        }
    
    }

    
    

}
    @SuppressWarnings("unchecked")
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ushtrimi3A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ushtrimi3A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ushtrimi3A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ushtrimi3A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ushtrimi3A().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
