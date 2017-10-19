/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/key-pair/0" target="_blank">GeeksForGeeks Easy Key Pair</a>
 * 
 * To summarize the practice:
 * Given an array of numbers, and another number X, determine if two numbers in the array sum to X.
 * This solution uses sort to solve the problem. It is better than brute force. Time complexity is O(nlogn)
 * 
 * This is the only solution (besides brute force) that will work when there are multiple elements with the same value.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class KeyPairSort 
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

				Arrays.sort( arr );																	//Sort the array
				int left = 0;																		//container for left index
				int right = n - 1;																	//container for right index

				while( left < right)																//loop to find if sum exists
				{
					if( arr[ left ] + arr[ right ] < x )											//if the sum is less than x then the element at the left index is too small
						left++;																		//increment the left index
					else if( arr[ left ] + arr[ right ] > x)										//if the sum is greater than x then the element at the right index is too large
						right--;																	//decrement the right index
					else if( arr[ left ] + arr[ right ] == x )										//if the sum is equal to x...
					{
						System.out.print("Values: " + arr[ left ] + " " + arr[ right ] + " ");		//print the values
						System.out.println("Indices: " + left + " " + right + " ");					//print the indices
						left++;																		//move the index
						right--;																	//move the index
					}
				}
				
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}