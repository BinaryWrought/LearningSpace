/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/repeated-character/0" target="_blank">GeeksForGeeks Basic Repeated Character.</a>
 * 
 * To summarize the practice:
 * Given a string, find the first character that is repeated.
 * Print the repeated char if found, -1 if not.
 * Note that in the string "geeksforgeeks" 'g' is the first repeated character, not 'e'.
 * This is because 'g' DOES repeats and it appears in the string before 'e'
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class FirstRepeatedCharacter 
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
				String s = scanner.next();															//get the string to be converted					
				int i = 0;																			//container for index at which repeated char is found
				
				for( i = 0; i < s.length(); i++ )													//loop through all the chars in the string
				{
					if( s.indexOf( s.charAt( i ), i+1 ) != -1 )										//check if this char occurs somewhere later in the string
					{
						System.out.println( s.charAt( i ) );										//repeated char found, print the char
						break;																		//repeated chard was found, break the loop
					}
				}
				if( i >= s.length() )																//if no repeated char was found...
					System.out.println( "-1" );														//print a -1 as per the requirements
				
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}