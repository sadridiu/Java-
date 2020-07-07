
package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Frame5 extends JFrame 
{
    private JTextArea area;
    private JButton btn1,btn2;
    private JLabel lbl1,lbl2;
    private JTextField txt;
    private JPanel panel1,panel2;
    private JMenu menu;
    private JMenuItem item1,item2;
    private int s=0;
    private double sh=0,mes=0;
    

   
    public Frame5() {
        setSize(250,350);
        menu=new JMenu("File");
        item1=new JMenuItem("Open");
        item2=new JMenuItem("Close");
        menu.add(item1);menu.add(item2);
        JMenuBar menuBar=new JMenuBar();
        menuBar.add(menu);
        setJMenuBar(menuBar);
        
        
        lbl2=new JLabel("Mesatarja");
        area=new JTextArea(11,10);
        btn1=new JButton("Jep Notat");
        btn2=new JButton("LLogarit ");
        btn2.setEnabled(false);
        txt=new JTextField("Hello",10);
        txt.setEditable(false);
        panel1=new JPanel();
        panel1.setLayout(new GridLayout(2,1));
        panel2=new JPanel();
        panel2.setLayout(new GridLayout(4,1));
        panel1.add(lbl1);
        panel1.add(area);
        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(lbl2);
        panel2.add(txt);
        
        Container cp=getContentPane();
        cp.add(lbl1=new JLabel("Notat"),"West");
        cp.add(panel2,"East");
        ButtonListener listener=new ButtonListener();
        btn1.addActionListener(listener);
        btn2.addActionListener(listener);
        item1.addActionListener(listener);
        item2.addActionListener(listener);
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
            Object obj=e.getSource();
            if(obj==btn1)
            {
                for(int i=1;i<=10;i++)
                {
                    String input=JOptionPane.showInputDialog("Jepni noten e std"+i);
                    int nota=Integer.parseInt(input);
                    s=s+nota;
                    area.setText(area.getText()+"\n"+nota);
                }
                sh=(double)s;
                mes=sh/10;
                btn2.setEnabled(true);
            }
            else if(obj==btn2)
            {
                txt.setText(mes+"");
                area.setText("");
                btn2.setEnabled(false);
            }
            else if (obj==item1)
            {
                Frame3 frame=new Frame3();
                frame.show();
            }
            else if(obj==item2)
            {
                System.exit(0);
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
