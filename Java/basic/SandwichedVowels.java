/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/sandwiched-vowels/0" target="_blank">GeeksForGeeks Basic Sandwiched Vowels</a>
 * 
 * To summarize the practice:
 * Given a string, remove any vowels that are sandwiched between adjacent consonants and print the new string.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class SandwichedVowels 
{
    /**
     * This method is used to determine if a given character is a vowel or not
     * @param c the char to check if it is a vowel or not
     * @return true if the given char a vowel, else false for consonants
     */
    public static boolean isVowel( char c )
    {
        if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            return true;
        else
            return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) 
	{
		Scanner scanner = new Scanner( System.in );													//create a scanner object to get user input
		try																							//this try block is to catch the inevitable exception caused by the user quitting 
		{
			int t = scanner.nextInt();																//get number of test cases
			
			while( t > 0 )																			//So long as there are more test cases
			{		
				String s = scanner.next();                                                          //get the input string
                String result = "";
                for( int i = 0; i < s.length(); ++i )                                               //loop through all the characters in the given string
                {
                    if( isVowel( s.charAt( i ) ) && i > 0 && i < s.length()-1 )                     //check if the current character in the loop is a vowel and that the loop is within the bounds (ignoring the first and last chars because it is impossible for those to be sandwiched)
                    {
                        if( !isVowel( s.charAt( i-1 ) ) && !isVowel( s.charAt( i+1 ) ) )            //check if both the previous and next chars are not vowels
                        {
                            continue;                                                               //if so, this is a sandwiched vowel and is not to be included in the string
                        }
                        else
                            result += s.charAt( i );                                                //otherwise this vowel is not sandwiched and must be included
                    }
                    else
                    {
                        result += s.charAt( i );                                                    //this character is not a vowel and must be included in the result
                    }
                }
				System.out.println( result );                                                       //print the result
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}