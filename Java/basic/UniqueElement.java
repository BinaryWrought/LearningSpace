/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/find-unique-element/0" target="_blank">GeeksForGeeks Basic Find Unique Element.</a>
 * 
 * To summarize the practice:
 * Given an array of integers, find the one that only appears once.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class UniqueElement 
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
				int n = scanner.nextInt();															//container for size of array
				int k = scanner.nextInt();															//I don't see the point of k in the problem statement
				
				Map< Integer, Integer > map = new HashMap<>();										//container for the numbers
				
				for( int i = 0; i < n; ++i )														//loop to get all the numbers
				{
					int a = scanner.nextInt();														//get the next number
					if( map.containsKey( a ) )														//check if the map already has this number
					{
						int val = map.get( a ) + 1;													//if so, get the current value
						map.put( a, val );															//update the value for the key
					}
					else
						map.put( a, 1 );															//otherwise, add the new key with a value of 1
				}
				
				for( Integer i: map.keySet() )														//iterate through the map
				{
					if( map.get( i ) == 1 )															//if the value is 1 then this is the answer
					{
						System.out.println( i );													//print the result
						break;																		//end the loop as the answer was already found
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