/**
 * Class SodaCan
 * .  constructor
 * .  getSurfaceArea()
 * .  getVolume()
 * 
 *   Ruby Locke, March 31, 2016, rubylocke@hotmail.com
 */

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Color;

public class SodaCan
{
   public static void draw(Graphics g)
   {
      final int width = 35;
      g.setColor(Color.BLUE);
 
      // Top row. Note that the top left corner of the drawing has coordinates (0,0)
      for (int rows = 0; rows < 4; rows++)
      {
          int x = 0;
          int y = rows * width;
          for (int i  = 0; i < 6; i++)
          {
             g.fillOval(x, y, width, width);
             x = x + 1 * width;
          }
      }
   }

   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final int FRAME_WIDTH = 400;
      final int FRAME_HEIGHT = 400;
      
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JComponent component = new JComponent()
      {
         public void paintComponent(Graphics graph)
         {
            draw(graph);
         }
      };

      frame.add(component);
      frame.setVisible(true);
   }
}
