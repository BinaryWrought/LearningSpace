/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/find-the-closest-number/0" target="_blank">GeeksForGeeks Basic Find the Closest Number.</a>
 * 
 * To summarize the challenge:
 * Given an array of integers and a given integer K find the element in the array closest to K.
 * If more than one element has the same difference, print the larger of the two.
 * For example if K = 3 and the array contains both 2 and 4, since both have a difference of 1 (from K) then print 4 as it is higher.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class FindClosestNumber 
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
				int size = scanner.nextInt();														//container for size of array
				int k = scanner.nextInt();															//the number we're looking for
                
                int element = Integer.MAX_VALUE;                                                    //initialize this to a number that will not appear in the array
				int diff = Integer.MAX_VALUE;                                                       //initialize to an impossibly high difference (the actual range is 100000, so this more than covers it)
				
				for( int i = 0; i < size; ++i )														//loop to get all the numbers
				{
					int a = scanner.nextInt();														//get the next number
                    int tempDiff = Math.abs( a - k );                                               //find the difference between this number and K
                    
                    if( tempDiff < diff )                                                           //if the difference is strictly less than the previous difference
                    {
                        diff = tempDiff;                                                            //save this new difference
                        element = a;                                                                //and save the element found
                    }
                    else if( tempDiff == diff )                                                     //if the difference is strictly equal to the previous difference
                    {
                        if( a > element )                                                           //check if this element is strictly greater than the previous element
                            element = a;                                                            //save the new element
                    }
				}							
                
				System.out.println( element );                                                      //print the found element
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}