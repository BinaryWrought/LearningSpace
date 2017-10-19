/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.HashMap;
import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/key-pair/0" target="_blank">GeeksForGeeks Easy Key Pair</a>
 * 
 * To summarize the practice:
 * Given an array of numbers, and another number X, determine if two numbers in the array sum to X.
 * This solution uses a hash map where the elements from the input array are the keys and the index of the element from the array is the value.
 *
 * Using this method I can print both the index of the elements and the values and still execute in O(n).
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class KeyPairHash 
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
				int[] arr = new int[ n ];
				HashMap< Integer, Integer > map = new HashMap<>( n );								//The key is value in the original array, the value is the index from the array
				for( int i = 0; i < n; ++i )														//loop to populate array
				{
					arr[ i ] = scanner.nextInt();													//populate the array
				}
				
				for( int i = 0; i < n; ++i )														//for each element in the array
				{
					int temp = x - arr[ i ];														//find the difference between the sought after sum and this element
					if( map.containsKey( temp ) )													//if the map has the difference and its not this element
					{
						System.out.print("Values: " + arr[ i ] + " " + temp + " ");					//print the values of the matching elements
						System.out.println("Indices: " + i + " " + map.get( temp ) );				//print the indices of the matching elements
					}
					map.put( arr[ i ], i );															//put the value in the map
				}				

				t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}