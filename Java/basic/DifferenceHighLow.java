/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.HashMap;
import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/difference-between-highest-and-lowest-occurrence/0" target="_blank">GeeksForGeeks Basic Difference between highest and lowest</a>
 * 
 * To summarize the practice:
 * Given an array, find the difference between the highest and lowest numbers in the array.
 * Print the difference.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class DifferenceHighLow 
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
				int n = scanner.nextInt();															//get the size of the input array
				HashMap< Integer, Integer > map = new HashMap<>();									//create a map
				for( int i = 0; i < n; ++i )														//loop to populate array
				{
					int key = scanner.nextInt();													//get the input
					if( map.containsKey( key ) )													//check if the map already has the key
					{
						int val = map.get( key ) + 1;												//if so, get the current value
						map.put( key, val );														//and update the key
					}
					else
						map.put( key, 1 );															//otherwise, add the new key with initial value 1
				}
				
				int max = -1;																		//container for most frequent occurance
				int min = 111111;																	//container for least frequent occurance
				
				for( Integer i : map.values() )														//iterate through the map
				{
					if( i > max )																	//look for the largest occurrance
						max = i;																	//set it to the container
					if( i < min )																	//look for the smallest occurrance
						min = i;																	//set it to the container
				}
				
				System.out.println( ( max - min ) );												//print the difference
				
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}