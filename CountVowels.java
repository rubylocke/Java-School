/**
 * CountVowels.
 *   Count the vowels in a given word
 *   
 *   Ask user for input
 *   Count all the vowels in the word
 *   Display the WORD, the vowels, and the count
 *   
 * Ruby-Anne Locke, Feb 07, 2016, rubylocke@hotmail.com
 */ 

import java.util.Scanner; 

public class CountVowels
{
   public static void main(String[] args)
    {
        int count = 0;
        char[] vowels = new char[] {'a','e','i','o','u','y','A','E','I','O','U','Y'};
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter a word - no spaces "); 
        String wordInput = in.next();
        for (int x = 0; x < wordInput.length(); x++)
        {
            for (int y = 0; y < 12; y++)
            {
                if((wordInput.charAt(x)) == vowels[y])
                {
                    count++;
                }
            }
        }
        if (count > 0)
        {
            System.out.println("Number of Vowels present in the word " + wordInput + " " + count);
        }
        else {
            System.out.println("There are no vowels present in the word " + wordInput);
        }
    }
}