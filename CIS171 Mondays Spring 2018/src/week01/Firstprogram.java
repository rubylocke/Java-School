package week01;

import java.util.Scanner;

/**
 * 
 * @author Ruby-Anne Locke
 *
 */

public class Firstprogram {

	public static void main(String[] args) {
		System.out.println("hello World");
		System.out.println("yeah");
		
		// declaring variables and initialization
		
		Scanner in = new Scanner(System.in);
		boolean myBoolean = true;
		int age = 21;
		double cost = 5.65;
		float tempature = 32.7f;     // = is assignment operator  
		char letter = 'c';     // use single quotes
		String words = "something to write";  // use double quotes       STRING is a class
		                                      //                            methods included
		String name = "name";
		
		final int CONSTANT_INTEGER;
		int yearsAtCompany; // camelcase 
		int years = 15;
		years = 20;
		
		age = 25;   // change the value
		
		char myChar = 'm';
		int myInt = 0 + myChar;
		
		System.out.println("Send output " + years);   // Output: Send output 20
		System.out.println("Boolean " + myBoolean);   // Output: Boolean true
		System.out.println("char " + myInt);   // Output:   109    because m asci is 108
		
		myInt++;      // only adds 21
		myInt += 5;   // adds 5
		
		int s1 = in.nextInt();
		int s2 = in.nextInt();
		int s3 = in.nextInt();

		double average = (double)((s1 + s2 + s3)/3);
		// double average1 = (s1 + s2 + s3)/3.0;
		System.out.println("output " + average);
		// System.out.println("output " + average1);
	}
}
