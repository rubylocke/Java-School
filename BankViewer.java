import javax.swing.JFrame;

/**
* Driver for Bank
* 
* Ruby-Anne Locke, rubylocke@hotmail.com, April 24, 2016
*/
public class BankViewer
{  
   public static void main(String[] args)
   {  
      JFrame bankFrame = new Bank();
      bankFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      bankFrame.setVisible(true);
   }
}
