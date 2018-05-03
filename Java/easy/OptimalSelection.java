/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/the-optimal-selection/0" target="_blank">GeeksForGeeks Easy The Optimal Selection</a>
 * 
 * To summarize the challenge:
 * Given an array of integers select them all in the way that acheives the most "points" - print the number of points.
 * Points are earned by: (SelectedInteger * Number of integers selected before )
 * 
 * Obviously the trick is to always select the next lowest integer.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class OptimalSelection 
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
                ArrayList<Integer> input = new ArrayList<>(n);                                      //container for input array
                
                for( int i = 0; i < n; ++i )                                                        //loop to populate array
                {
                    input.add( scanner.nextInt() );                                                 //get the element and add to array
                }
                
                Collections.sort( input );                                                          //ensure the array is sorted in ascending order
                int points = 0;                                                                     //container for points achieved
                
                for( int i = 0; i < input.size(); ++i )                                             //loop to calculate points achieved
                {
                    points += ( input.get( i ) * i );                                               //point is = element value * number of elements selected previously
                }                
                
                System.out.println( points );                                                       //print the result              
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}