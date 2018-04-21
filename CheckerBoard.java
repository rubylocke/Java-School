/**
 * Checkerboard.
 * BAsed on TwoRowsofSquares
 * .  change the colour to Black
 * .  use a quick and dirty way to do the graphics with some online help
 * .     learned about extends online which help finish this.
 * .  one problem...keep getting lower line at top
 * Ruby-Anne Locke, March 27, 2016, rubylocke@hotmail.com
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class CheckerBoard extends JFrame
{

   public void paint(Graphics g)
   {
      int row;
      int col;
      int x;
      int y;

      for ( row = 0;  row < 9;  row++ )
      {
         for ( col = 0;  col < 8;  col++)
         {
            x = col * 40;
            y = row * 40;
            if ( (row % 2) == (col % 2) )
               g.setColor(Color.WHITE);
            else
               g.setColor(Color.BLACK);

            g.fillRect(x, y, 40, 40);
         }
      }
   }

   public static void main(String args[]) {
        CheckerBoard check = new CheckerBoard();
        check.setTitle("CheckerBoard");
        check.setSize(500, 500);
        check.setDefaultCloseOperation(EXIT_ON_CLOSE);
        check.setVisible(true);
    }
}


