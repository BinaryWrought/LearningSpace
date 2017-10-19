/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/key-pair/0" target="_blank">GeeksForGeeks Easy Key Pair</a>
 * 
 * To summarize the practice:
 * Given an array of numbers, and another number X, determine if two numbers in the array sum to X.
 * This solution uses brute force. Time complexity in worst case scenario is O(n^2)
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class KeyPairBruteForce 
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
				int n = scanner.nextInt();															//get the size of the array
				int x = scanner.nextInt();															//get the sum to look for
				int[] arr = new int[n];																//container for input
				for( int i = 0; i < n; ++i )														//loop to populate array
				{
					arr[i] = scanner.nextInt();														//populate array
				}
				
				boolean found = false;																//flag for found sum
				for( int i = 0; i < n && !found; ++i )												//loop to find sum
				{
					for( int j = 1; j < n && !found; j++ )											//loop to find sum
					{
						if( arr[i] + arr[j] == x )													//if the two elements sum to x...
							found = true;															//found an answer, set flag
					}
				}
				
				System.out.println( found? "Yes" : "No");											//print result
				
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}