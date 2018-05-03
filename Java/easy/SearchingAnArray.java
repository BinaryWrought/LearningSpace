/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/ishaans-birthday/0" target="_blank">GeeksForGeeks Easy Ishaan's Birthday</a>
 * 
 * To summarize the challenge:
 * Given an array of integers that represents quantities of letters ( index 0 = A, index 1 = B and so on ) determine what is the cheapest exchange for all letters to one other letter.
 * An exchange is the difference in value between two letters. 
 * 
 * For example, if I have 4 A's and 2 C's then the to exchange A for C would be: 4 * ( 3 - 1 ) = 8. 
 * If instead I exchange C for A the difference would be 2 * ( 3 - 1 ) = 4.
 * So in this example exchanging C for A would be cheaper. 
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