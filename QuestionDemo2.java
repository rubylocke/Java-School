/**
 * Tester Class:  QuestionDemo2
 * 
 * added:  NumericQuestion section
 * Ruby-Anne Locke, April 15, 2016, rubylocke@hotmail.com
 */
import java.util.Scanner;

/**
   This program shows a simple quiz with two choice questions.
*/
public class QuestionDemo2
{
   public static void main(String[] args)
   {
      ChoiceQuestion first = new ChoiceQuestion();
      first.setText("What was the original name of the Java language?");
      first.addChoice("*7", false);
      first.addChoice("Duke", false);
      first.addChoice("Oak", true);
      first.addChoice("Gosling", false);

      ChoiceQuestion second = new ChoiceQuestion();
      second.setText("In which country was the inventor of Java born?");
      second.addChoice("Australia", false);
      second.addChoice("Canada", true);
      second.addChoice("Denmark", false);
      second.addChoice("United States", false);

      ChoiceQuestion third = new ChoiceQuestion();
      third.setText("Who teaches this class?");
      third.addChoice("Teacher", false);
      third.addChoice("neighbour", false);
      third.addChoice("Joe S", true);
      third.addChoice("uh", false);
      
      presentQuestion(first);
      System.out.println(" ");  // break between questions
      presentQuestion(second);
      System.out.println(" ");  // break between questions
      presentQuestion(third);
      System.out.println(" ");  // break between questions
      
      // Added NumericQuestion subclass tester
      NumericQuestion fifth = new NumericQuestion();   // fifth object
      fifth.setText("What is 5 x 4?");                 // set question for fifth
      fifth.setAnswer(20.0);                           // set answer for fifth to 20.0
      presentQuestion(fifth);                          // present question to viewer
   }

   /**
      Presents a question to the user and checks the response.
      @param q the question
   */
   public static void presentQuestion(ChoiceQuestion q)
   {
      q.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
   }
   /**
    * Presents a question to the user for NumericQuestion
    * @param q:  the question
    */
   public static void presentQuestion(NumericQuestion q)
   {
      q.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      boolean result = q.checkAnswer(response);
      // System.out.println(q.checkAnswer(response));  comment out original code from previous entry
      // Provide if the user got it "correct" or "wrong with the correct answer"
      if (result)
      {
         System.out.println("You got it right");
      }
      else
      {
        System.out.println("Wrong.  Answer is " + q.getResult());        
      };
   }
}

