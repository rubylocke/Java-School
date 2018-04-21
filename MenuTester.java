/**
   This program tests the menu class.
*/
public class MenuTester
{
   public static void main(String[] args)
   {
      // Menu mainMenu = new Menu();
      // mainMenu.addOption("Open new account");
      // mainMenu.addOption("Log into existing account");
      // mainMenu.addOption("Help");
      // mainMenu.addOption("Quit");
      // int input = mainMenu.getInput();
      // System.out.println("Input: " + input);
      // System.out.println("  ");
      
      Menu simpleMenu = new Menu();
      simpleMenu.addOption("Ok");
      simpleMenu.addOption("Cancel");
      int response = simpleMenu.getInput();
      System.out.println("  ");
      System.out.println("response: " + response);

   }
}
