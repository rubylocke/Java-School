import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Try
{

public static void main(String[] args){
    JFrame frame = new JFrame();
    JButton b1 = new JButton();
    JLabel label = new JLabel("Click Me");
    frame.setSize(300,300);     
    b1.setSize(150,150);
    //b1.setBackground(Color.BLACK);
    //b1.setForeground(Color.GRAY);
    b1.setVisible(true);
    b1.setText("HelloWorld");
    b1.add(label);
    frame.add(b1);
    frame.setVisible(true);
}
}
