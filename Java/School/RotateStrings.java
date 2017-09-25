/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.school;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places/0" target="_blank">GeeksForGeeks School Check if string is rotated by two places.</a>
 * 
 * To summarize the practice:
 * Given a string 'a' check if the second string 'b' can be obtained by rotating the string twice.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class RotateStrings 
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
				String a = scanner.next();															//get the firs string input
				String b = scanner.next();															//get the second string input
								
				String firstTwoOfA = a.substring( 0, 1 );											//to check for rotation strip off the first two chars of a
				String lastTwoOfA = a.substring( a.length() - 2, a.length() - 1 );					//also strip off the last two chars of a
				String firstTwoOfB = b.substring( 0, 1 );											//do the same for b stripping off the first two chars
				String lastTwoOfB = b.substring( a.length() - 2, a.length() - 1 );					//and the last two chars
				
				if( firstTwoOfA.equals( lastTwoOfB ) || lastTwoOfA.equals( firstTwoOfB ) )			//check if the first two chars of a equal the last two chars of b or vice versa
					System.out.println( 1 );														//if so, print 1
				else
					System.out.println( 0 );														//if not, print 0
				
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
    }
}