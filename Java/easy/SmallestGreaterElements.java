/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/smallest-greater-elements-in-whole-array/0" target="_blank">GeeksForGeeks Easy Smallest Greater Elements in whole array</a>
 * 
 * To summarize the challenge:
 * Given an array, print the array with the same order but with the next greatest element instead of the original element.
 * For the largest element (there is no greater) print "_"
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class SmallestGreaterElements 
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
                int n = scanner.nextInt();                                                          //get the size of the array
                int[] arr = new int[n];
                int[] sorted = new int[n];
                
                for( int i = 0; i < n; ++i )
                {                    
                    arr[i] = scanner.nextInt();
                    sorted[i] = arr[i];
                }
                Arrays.sort( sorted );
                
                for( int i = 0; i < n; ++i )
                {
                    int j = 0;
                    
                    while( j < n )
                    {
                        if( arr[i] < sorted[j] )
                             break;
                        else
                            j++;
                    }
                    
                    if( j == n )
                        System.out.print( "_ ");
                    else
                        System.out.print( sorted[j] + " " );
                    
                }                
                
                System.out.println();                                                               //add a line between test cases
                             
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}