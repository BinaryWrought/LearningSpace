/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.school;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/form-largest-number-from-digits/0" target="_blank">GeeksForGeeks School Largest Number from Digits.</a>
 * 
 * To summarize the practice:
 * Given an array of natural numbers, form the largest single number.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class LargestNumber 
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
				int n = scanner.nextInt();															//get the length of the array
				int[] num = new int[ n ];															//create the array
				while( n > 0 )																		//loop to populate the array
				{
					num[ n-1 ] = scanner.nextInt();													//populate the array at the index
					n--;																			//get next input
				}
					
				Arrays.sort( num );																	//use sort algorithm to get array in ascending order
				
				for( int i = num.length - 1; i >= 0; i-- )											//loop to print result
				{
					System.out.print( num[ i ] );													//print in reverse to make largest number
				}
				
				System.out.println();																//add a line between test cases
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
    }
}