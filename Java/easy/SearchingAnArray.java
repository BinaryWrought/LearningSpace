/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/searching-in-an-array-where-adjacent-differ-by-at-most-k/0" target="_blank">GeeksForGeeks Easy Searching in an array where adjacent differ by at most k</a>
 * 
 * To summarize the challenge:
 * Given an array find the first occurrence of X.
 * The actual problem statement is a lot more complicated but this really is all they wanted.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class SearchingAnArray 
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
                int n = scanner.nextInt();                                                          //size of the array
                int k = scanner.nextInt();                                                          //step size
                ArrayList<Integer> arr = new ArrayList<>(n);                                        //container for array
                
                for( int i = 0; i < n; ++i )                                                        //loop to populate array
                    arr.add( scanner.nextInt() );                                                   //get next element
                
                int x = scanner.nextInt();                                                          //element to look for
               
                System.out.println( arr.indexOf( x ) );                                             //print the results           
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}