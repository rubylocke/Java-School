package Loops;

import java.util.Scanner;

public class askUser {

	public static void main(String[] args) {
		// Let' average 4 numbers
		// variable declaration and initialization
		int count = 0;
		
		Scanner in = new Scanner(System.in);
		double input =0.0;
		double sum=0.0;
		double average=0.0;
		int counter=0;
		
		// ask the user how many input
		System.out.println("How many numbers do you want to average?");
		
		if (in.hasNext())
		{
			count = in.nextInt();
		}
		else
		{
			System.out.println("Not appropriate inpute, you can average 4 numbers");
			count = 4;
			System.exit(0);
		}
		
		// input and process
		while (counter < count)
		{
			// ask user for number
			System.out.println("Please enter a double");

			// input validation
			if (in.hasNextDouble())
			{
				input = in.nextDouble();
				
				// add to the sum
				sum = sum + input;
				counter++;
			}
			else
			{

				System.out.println("Must enter a double");
			}
			in.nextLine();           //  in has leaves it there.  You have to use nextLine to input it.

		}
		
		// output
		if (count == 0)
		{
			System.out.println("cannot divide by zero");
			average = 0;
				
		}
		else
		{
			average = sum/count;
		}
		
		System.out.println("The average is " + average);

	}

}
