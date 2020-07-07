
package complete_java_gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author sadri
 */
public class App {
    
    public static void main(String [] args)
    {   SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run() {
            new MainFrame();
    
        }
    });
        
    }
    
}
