/**
 *Different greeting and image
 * 
 * Ruby Locke; Jan 18, 2016; rubylocke@hotmail.com
 */
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LockeP117
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL (
         "http://www.4dsp.com/Pictures/jpeg_compression_result.jpg");
        JOptionPane.showMessageDialog(null, "Beautiful", "Roaring Waves",
           JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}
