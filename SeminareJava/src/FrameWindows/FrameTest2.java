/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameWindows;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author sadri
 */
public class FrameTest2 {


public static void main (String[]args)
{
    EmptyFrame2 frame2 =new EmptyFrame2();
    frame2.setTitle("Frame Test2");
    frame2.show();
}
}
class EmptyFrame2 extends JFrame
{
    public  EmptyFrame2()
    {
      final  int  DEFAULT_FRAME_WIDTH=300;
      final  int   DEFAULT_FRAME_HEIGHT=300;
      setSize(DEFAULT_FRAME_WIDTH,DEFAULT_FRAME_HEIGHT);
      
      WindowClose listener =new WindowClose();
      addWindowListener(listener);
    }

private class WindowClose extends WindowAdapter
{
    public void windowClose(WindowEvent e)
    {
        System.exit(0);
    }
}
}




