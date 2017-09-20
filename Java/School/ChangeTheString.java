/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/change-the-string/0" target="_blank">GeeksForGeeks School Change the String.</a>
 * 
 * To summarize the practice:
 * Given a string, if the first character is capitalized, then capitalize the entire string.
 * If the first character of the given string is lower case, then make all characters in the string lower case.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class ChangeTheString 
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
				
				if( Character.isUpperCase( s.charAt( 0 ) ) )										//check if the first char is upper case or not
					System.out.println( s.toUpperCase() );											//if so, make the whole string upper case
				else
					System.out.println( s.toLowerCase() );											//if not, make it all lower case
				
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
    }
}