package Loops;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		// Variable declarations
		boolean greaterThan;
		boolean lessThan;
		boolean equalTo;
		String input;
		double number1, number2;

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter a double ");
		input = in.nextLine();
		number1 = Double.parseDouble(input);

		System.out.println("Please enter a double ");
		input = in.nextLine();
		number2 = Double.parseDouble(input);

		lessThan = number1 < number2;
		greaterThan = number1 > number2;
		equalTo = number1 == number2;

		System.out.println(number1 + " less than " + number2 + " is " + lessThan);
		System.out.println(number1 + " equal to " + number2 + " is " + equalTo);
		System.out.println(number1 + " greater than " + number2 + " is " + greaterThan);

	
		 /* unnecessary repeated code!! Use a loop!
		 * System.out.println("Please enter a double "); input = in.nextLine();
		 * number1 = Double.parseDouble(input);
		 * 
		 * System.out.println("Please enter a double "); input = in.nextLine();
		 * number2 = Double.parseDouble(input);
		 * 
		 * lessThan = number1 < number2; greaterThan = number1 > number2;
		 * equalTo = number1 == number2;
		 * 
		 * System.out.println(number1 + " less than " + number2 + " is " +
		 * lessThan); System.out.println(number1 + " equal to " + number2 +
		 * " is " + equalTo); System.out.println(number1 + " greater than " +
		 * number2 + " is " + greaterThan);
		 */
		/*
		System.out.println("How many sets of numbers do you want to compare");
		int numberOfInput = Integer.parseInt(in.nextLine());
		int numberCompleted = 0;

		while (numberCompleted < numberOfInput) {
			System.out.println("Please enter a double ");
			input = in.nextLine();
			number1 = Double.parseDouble(input);

			System.out.println("Please enter a double ");
			input = in.nextLine();
			number2 = Double.parseDouble(input);

			lessThan = number1 < number2;
			greaterThan = number1 > number2;
			equalTo = number1 == number2;

			System.out.println(number1 + " less than " + number2 + " is " + lessThan);
			System.out.println(number1 + " equal to " + number2 + " is " + equalTo);
			System.out.println(number1 + " greater than " + number2 + " is " + greaterThan);

			//numberCompleted++;
		} */
		for (int counter = 1; counter <= 5; counter++)
		{
			System.out.println(counter);
		}
		System.out.println("**************************");
		for (int counter = 0; counter <= 50; counter= counter + 5)
		{
			System.out.println(counter);
		}
		System.out.println("**************************");
		for (int counter = 100; counter > 0; counter-=5 )
		{
			System.out.println(counter);
		}
		
		
	}

}

