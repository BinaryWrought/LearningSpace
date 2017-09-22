/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This is just a practice to demonstrate iterating through an int.
 * I noticed a couple of challenges needed this capability.
 * To satisfy those challenges I simply made the number a string, iterated through each char while converting the char to an int.
 * It works, but the more mathematical solution is to use mod 10.
 * This class should demonstrate that by iterating through an int in reverse.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class IterateThroughInt 
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
				int n = scanner.nextInt();															//Get the int to be iterated through	
				int[] result = toIntegerArray( n );
				Integer[] resultsToo = toDigitArray( n );
				List<Integer> results = toIntegerList( n );
				
//				while( n > 0 )																		//loop through all the digits in the int
//				{
//					int temp = n % 10;																//container for the digit
//					n /= 10;																		//remove the digit
//					System.out.print( temp + " " );													//print the digits
//				}
				
				System.out.println();																//add a line between test cases
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
    }
	/**
	 * This method is a combination of the two above.
	 * It will break the number into its digits using a list.
	 * But then using a method of the list class it will return a fixed array.
	 * This eliminates the extra loop needed to determine the size of the array.
	 *
	 * @param n the number to be broken into its digits
	 * @return an array of digits
	 */
	public static Integer[] toDigitArray( int n )
	{
		List<Integer> results = new ArrayList<>(0);
		int num = n;
		
		while( num > 0 )																			//loop through all the digits in the int
		{
			results.add( 0, num % 10 );																//store the digit
			num /= 10;																				//remove the digit
		}
		
		Integer[] result = new Integer[ results.size() ];
		result = results.toArray( result );
		
		return result;
	}
	
	/**
	 * This method takes some integer and breaks it into an array of integers that are the individual digits of the original integer.
	 * It first has to determine the size of the final array which is a whole extra loop.
	 * 
	 * @param n the number to be broken into digits
	 * @return an array with each digit at its own index
	 */
	public static int[] toIntegerArray( int n )
	{
		int num = n;
		int count = 0;
		
		while( num > 0 )
		{
			num /= 10;
			count++;
		}
		
		int[] result = new int[ count ];
		
		num = n;
		while( num > 0 )																			//loop through all the digits in the int
		{
			count--;
			result[ count ] = num % 10;																//store the digit
			num /= 10;																				//remove the digit			
		}
		
		return result;
	}
	
	/**
	 * This method takes an integer and breaks it down by digit and returns a list of the digits in order.
	 * 
	 * @param n the number to be broken into its digits
	 * @return a list of the digits at their own index
	 */
	public static List<Integer> toIntegerList( int n )
	{
		List<Integer> results = new ArrayList<>(0);
		int num = n;

		while( num > 0 )																			//loop through all the digits in the int
		{
			results.add( 0, num % 10 );																//store the digit
			num /= 10;																				//remove the digit			
		}
				
		return results;
	}
	
}