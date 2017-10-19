/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/sum-of-digit-modified/0" target="_blank">GeeksForGeeks Basic Magic Number </a>
 * 
 * To summarize the practice:
 * Given a number, sum its digits and continue to sum the digits of the result until it is a one digit number.
 * If that one digit is a "1" print Magic, if not print "Not Magic"
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class MagicNumber 
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
				int n = scanner.nextInt();															//get the test case
				System.out.println( ( sumDigits( n ) == 1 )? "Magic" : "Not Magic"  );				//print the result
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
	
	/**
	 * Recursive method to sum the digits of an int
	 * 
	 * @param n the integer to have its digits summed
	 * @return the result of summing the digits
	 */
	public static int sumDigits( int n )
	{
		int sum = 0;
		while( n >= 10 )
		{
			sum += n % 10;
			n /= 10;
		}
		sum += n;
		
		if( sum >= 10 )
			sum = sumDigits( sum );
		
		return sum;
	}
}