
package Arrays;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiJFrame extends JFrame
{
    private JLabel item1;
    
    public GuiJFrame()
    {
        super("The Title bar");
        setLayout(new FlowLayout());
        
        item1=new JLabel("this is a sentence");
        item1.setToolTipText("This is gonna show up on hover");
        add(item1);
    }
    
    
}
