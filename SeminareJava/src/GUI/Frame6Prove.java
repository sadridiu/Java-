
package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Frame6Prove extends JFrame 
{
    private JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6;
    private JTextField txt1, txt2;
    private JComboBox combo;
    private JRadioButton rb1,rb2;
    private JCheckBox chck1,chck2;
    private JTextArea area;
    private JButton btn;
    private JPanel panel1,panel2,panel3;
    
   public Frame6Prove ()
   {
       setSize(800,600);
       lbl1 = new JLabel("Emer");
       lbl2 = new JLabel("Mosha");
       lbl3 = new JLabel("Qyteti");
       lbl4 = new JLabel("Gjinia");
       lbl5 = new JLabel("Gjuhe prog");
       lbl6 = new JLabel("Koment");
       txt1 = new JTextField(10);
       txt2 = new JTextField(10);
       combo = new JComboBox();
       combo.addItem("Zgjidh");
       combo.addItem("Tirane");
       combo.addItem("Durres");
       combo.addItem("Vlore");
       rb1 = new JRadioButton("F");
       rb2 = new JRadioButton("M");
       ButtonGroup group = new ButtonGroup();
       group.add(rb1);
       group.add(rb2);
       chck1 = new JCheckBox("Java");
       chck2 = new JCheckBox("Web");
       area  = new JTextArea(5,15);
       btn = new JButton("Afisho");
       panel1 = new JPanel();
       panel2 = new JPanel();
       panel3 = new JPanel();
       panel1.add(lbl1);
       panel1.add(txt1);
       panel1.add(lbl2);
       panel1.add(txt2);
       panel1.add(lbl3);
       panel1.add(combo);
       panel1.add(lbl4);
       panel1.add(rb1);
       panel1.add(rb2);
       panel1.add(lbl5);
       panel1.add(chck1);
       panel1.add(chck2);
       panel2.add(lbl6);
       panel2.add(area);
       panel3.add(btn);
       
       Container cp = getContentPane();
       cp.add(panel1,"North");
       cp.add(panel2,"Center");
       cp.add(panel3,"South");
       
       ButtonListener listener = new ButtonListener();
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
           String emer = txt1.getText();
           int age = Integer.parseInt(txt2.getText());
           String qyteti = (String) combo.getSelectedItem();
           String koment = area.getText();
           String gjinia = "";
           if(rb1.isSelected()==true)
               gjinia = rb1.getText();
           else if(rb2.isSelected()==true)
               gjinia = rb2.getText();
           String gjuheProg = "";
           if(chck1.isSelected()==true)
               gjuheProg = gjuheProg +" "+chck1.getText();
           if(chck2.isSelected()==true )
                gjuheProg = gjuheProg + " "+ chck2.getText();
           JOptionPane.showMessageDialog(null, "Emer:"+emer+"\n mosha:"+age+"\n qyteti:"+qyteti
              +"\n gjinia"+gjinia+"\n gjuhe Programimi:"+gjuheProg+"\n komente:"+koment);
     
   
    
    
    

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