/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.Scanner;

/**
 *
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class DifferenceInSums 
{

    /**
	 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/difference-between-sums-of-odd-and-even-digits/0" target="_blank">GeeksForGeeks School Difference between sums of odd and even digits.</a>
	 * I modified it slightly so it will continue to take test cases until a non integer input is given.
	 * 
	 * To summarize the practice:
	 * Given a long integer, determine if the difference between the sum of digits present at the odd positions and sum of digits present at even positions is 0 or not.
	 * Print Yes if difference is zero, No if not.
	 * 
     * @param args the command line arguments
     */
    public static void main( String[] args ) 
	{
		Scanner scanner = new Scanner( System.in );													//create a scanner object to get user input
		try																							//this try block is to catch the inevitable exception caused by the user quitting 
		{
			int t = scanner.nextInt();
			while( t > 0 )																			//only execute if the input is greater than 0
			{		
				String n = scanner.next();															//get the input string
				int sumOdd = 0;																		//container for the sum of odd digits
				int sumEven = 0;																	//container for the sum of even digits
				
				for( int i = 1; i <= n.length(); i++ )												//loop through all the digits
				{
					String temp = "" + n.charAt( i-1 );												//convert an individual digit from a char to a string
					if( i % 2 == 0 )																//check if this is an even digit
						sumEven += Integer.valueOf( temp );											//if even, add to the sum of evens
					else
						sumOdd += Integer.valueOf( temp );											//if odd add to the sum of odds
				}
					
				System.out.println( ( sumOdd - sumEven ) == 0? "Yes" : "No" );						//check the difference and print the result
				t--;																				//next test case
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
    }

}
