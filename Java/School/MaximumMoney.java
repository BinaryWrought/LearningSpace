/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/maximum-money/0" target="_blank">GeeksForGeeks School Maximum Money.</a>
 * 
 * To summarize the practice:
 * Consider a row of houses with money in them and a thief that wants to rob those houses.
 * But the thief will not rob any adjacent houses.
 * Find the maximum amount of money the thief can get.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class MaximumMoney 
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
				int n = scanner.nextInt();															//get the number of houses on the street
				int m = scanner.nextInt();															//get the amount of money the thief can steal from a house
				int total = 0;																		//container for the total amount of money that can be stolen
				
				for( int i = 1; i <= n; i++ )														//loop through each house
				{
					if( i % 2 != 0 )																//cannot rob adjacent houses so use mod 2
						total += m;																	//add the total from the odd houses
				}
				
				System.out.println( total );														//print the total
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
    }
}