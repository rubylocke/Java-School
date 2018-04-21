/**
   This program tests the CashRegister class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
      CashRegister register2 = new CashRegister(7.5);
      CashRegister register3 = new CashRegister(0.0);
      register2.addItem(3.95, false);
      register2.addItem(19.95, true);
      register3.addItem(19.95, true);
      System.out.println(register2.getCount());
      System.out.println("Expected: 2");
      System.out.printf("%.2f\n", register2.getTotal());
      System.out.println("Expected: 25.40");
      System.out.printf("reg3 %.2f\n", register3.getTotal());
   }
}
