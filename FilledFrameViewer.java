import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
   This program shows a frame that is filled with two components.
*/
public class FilledFrameViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      
      JButton button = new JButton("Click me!");
      JLabel label = new JLabel("Hello, World!");
      JButton button1 = new JButton();
      
      //JPanel panel = new JPanel();
      //panel.add(button);
      //panel.add(label);
      //frame.add(panel);
      final int FRAME_WIDTH = 600;
      final int FRAME_HEIGHT = 600;
      
      final int BUTTON_WIDTH = 20;
      final int BUTTON_HEIGHT = 30;
      
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("A frame with two components");
      button1.setSize(300,300);
      button1.setText("Here is Button");
           
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      button1.setVisible(true);
   }
}
