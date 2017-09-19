/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.Scanner;

/**
 *
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 */
public class NumbersWithZero 
{

	/**
	 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/numbers-with-0-as-a-digit/0" target="_blank">GeeksForGeeks School Numbers with 0 as a digit.</a>
	 * I modified it slightly so it will continue to take test cases until a non integer input is given.
	 * 
	 * To summarize the practice:
	 * Count all integers from 1 to N that have a zero as at least one of their digits.
	 * 
	 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
	 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
	 */
    public static void main( String[] args ) 
	{
    	Scanner scanner = new Scanner( System.in );													//create a scanner object to get user input
		try																							//this try block is to catch the inevitable exception caused by the user quitting 
		{
			while( true )																			//only execute if the input is greater than 0
			{		
				int n = scanner.nextInt();
				int count = 0;
				for( int i = 1; i <= n; i++ )
				{
					if( Integer.toString( i ).contains( "0" ) )										//Check if the integer has a zero somewhere in its string
						count++;																	//If so, add it to the count.
				}
				System.out.println( count );														//print the total count when done.
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
	}

}
