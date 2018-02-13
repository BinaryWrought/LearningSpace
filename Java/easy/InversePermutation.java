/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/inverse-permutation/0" target="_blank">GeeksForGeeks Easy Inverse Permutation</a>
 * 
 * To summarize the challenge:
 * Given an array of integers create the inverse permutation array.
 * The inverse permutation is found by getting the element at an index and setting the index of the inverse array to that element.
 * 
 * For example, given the array: A = [ 2, 3, 1, 5, 4 ] the inverse array is B = [ 3, 1, 2, 5, 4 ]
 * To explain, here assume the first index is 1 (not 0.)
 * 
 * A[1] = 2 -> B[2] = 1
 * A[2] = 3 -> B[3] = 2
 * A[3] = 1 -> B[1] = 3
 * A[4] = 5 -> B[5] = 4
 * A[5] = 4 -> B[4] = 5
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class InversePermutation 
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
				int n = scanner.nextInt();															//get the number of digits of A                
                int[] b = new int[ n ];                                                             //container for the inverse permutation array
                for( int i = 0; i < n; ++i )                                                        //loop to populate the array 
                {
                    int temp = scanner.nextInt();                                                   //get the next input
                    b[ temp - 1 ] = i + 1;                                                          //set the element in the inverse permutation array (for the challenge it starts at index 1 instead of 0 hence the -1 and +1)
                }               
                
                for( int i = 0; i < n; ++i )                                                        //loop to print the results as specified in the challenge
                {
                    System.out.print( b[ i ] + " " );                                               //print the results
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