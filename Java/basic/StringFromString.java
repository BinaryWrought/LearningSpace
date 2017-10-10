/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/make-a-string-from-another-string/0" target="_blank">GeeksForGeeks Basic Make a string from another string.</a>
 * 
 * To summarize the practice:
 * Given two strings determine if the first string could be constructed using only characters from the second string.
 * Print 0 if not, 1 if so.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class StringFromString 
{

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
				String makeThis = scanner.next();													//get the string to be made
				String fromThis = scanner.next();													//get the string to be used to make the other string
				
				int neededCharIndex = -1;															//container for found char
				
				for( int i = 0; i < makeThis.length(); ++i )										//loop through the chars in the first string
				{
					char needChar = makeThis.charAt( i );
					neededCharIndex = fromThis.indexOf( needChar );									//check if the char from the first string is found in the second string
					if( neededCharIndex != -1 )														//if the char was found (index something other than -1)
						fromThis = fromThis.replaceFirst( Character.toString( needChar ), " ");
					else 
						break;																		//the char was not found in the second array so end the loop
				}
				
				System.out.println( (neededCharIndex == -1 ) ? "0" : "1" );							//print the result
				
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}