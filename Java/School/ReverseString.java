/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/reverse-the-string/0" target="_blank">GeeksForGeeks School Reverse the String.</a>
 * 
 * To summarize the practice:
 * Given a string print it in reverse.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class ReverseString 
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

				//Use string builder to simply reverse it automatically
				String reverse = new StringBuilder( scanner.next() ).reverse().toString();
				System.out.println( reverse );
					
				//One char at a time
//				String s = scanner.next();															//Get the test case			
//				
//				for( int i = s.length()-1; i >= 0; i-- )											//Loop through the string in reverse
//				{
//					System.out.print( s.charAt( i ) );												//Print the char at the index while looping in reverse
//				}	
//				
//				System.out.println();																//Add a line between test cases
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
    }
}