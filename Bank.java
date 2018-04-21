/**
 *  Class for Bank
 *  Deposits and Withdrawals
 *  
 *  Ruby-Anne Locke, rubylocke@hotmail.com, April 24, 2016
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
*   A frame that allows Deposits and Withdrawals
*   and running total
*/
public class Bank extends JFrame
{
   private static final int FRAME_WIDTH = 400;
   private static final int FRAME_HEIGHT = 250;
   
   private static final int AREA_ROWS = 10;
   private static final int AREA_COLUMNS = 30;

   private static final double DEFAULT_AMT = 0;
   private static final double INITIAL_BALANCE = 1000;   
     
   private JLabel labelAmount;
   private JTextField amount;
   private JButton buttonDeposit;
   private JButton buttonWithdrawal;
   private JTextArea resultArea;
   private double balance;
 
   public Bank()
   {  
      balance = INITIAL_BALANCE;
      resultArea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
      resultArea.setText(balance + "\n");
      resultArea.setEditable(false);
            
      createTextField();
      createButton();
      createPanel();

      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      setTitle("Banking");
   }
   /**
      Create area to enter Amoount
   */
   private void createTextField()
   {
      labelAmount = new JLabel("Amount: ");

      final int FIELD_WIDTH = 30;
      amount = new JTextField(FIELD_WIDTH);
      amount.setText("" + DEFAULT_AMT);
   }
   /**
    *  Deposits:  ActionListener
    *  @parms: amount of deposit
    *  @return:  balance
   */
   class AddDepositListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         double depAmt = Double.parseDouble(amount.getText());
         balance = balance + depAmt;
         // System.out.println("Deposit clicked " + balance);   this is acted upon
         resultArea.append(balance + "\n");
         amount.setText("" + DEFAULT_AMT);
      }            
   }
   /**
    *  Withdrawals:  ActionListener
    *  @parms: amount of withdrawal
    *  @return:  balance
   */
   class AddWithdrawalListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         double withAmt = Double.parseDouble(amount.getText());
         balance = balance - withAmt;
         // System.out.println("Withrawal clicked " + balance);   this is acted upon
         resultArea.append(balance + "\n");
         amount.setText("" + DEFAULT_AMT);
      }            
   }
   /**
    *  Create Deposit and Withdrawal buttons
    *  @parms : none
    *  @return: none
   */
   private void createButton()
   {
      buttonDeposit = new JButton("Deposit");      
      ActionListener listenerDeposit = new AddDepositListener();
      buttonDeposit.addActionListener(listenerDeposit);

      buttonWithdrawal = new JButton("Withdrawal");      
      ActionListener listenerWithdrawal = new AddWithdrawalListener();
      buttonWithdrawal.addActionListener(listenerWithdrawal);
    }
   /**
    *  Create Panels for Deposits, Withdrawals
    *  and running total
    *  @parms : none
    *  @return: none
   */
   private void createPanel()
   {
      JPanel panel = new JPanel();
      panel.add(labelAmount);
      panel.add(amount);
      panel.add(buttonDeposit);
      panel.add(buttonWithdrawal);

      JScrollPane scrollPane = new JScrollPane(resultArea);
      panel.add(scrollPane);      
      add(panel);
   }
}
