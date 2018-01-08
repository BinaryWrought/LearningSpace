/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array/0" target="_blank">GeeksForGeeks Easy Move All Zeroes To End Of Array</a>
 * 
 * To summarize the practice:
 * Given an array of numbers, push all the zeroes to the end of the array.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class MoveZeroes 
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
				int[] arr = new int[n];
                
                int j = n - 1;
                int k = 0;
                for( int i = 0; i < n; i++ )
                {
                    int in = scanner.nextInt();
                    
                    if( in == 0 )
                        arr[j--] = in;
                    else
                        arr[k++] = in;
                }

                //System.out.println( Arrays.toString( arr ) );                                     //This prints the array just fine, but GFG doesn't like the fact that it includes brackets and commas.
                for( int i = 0; i < n; i++ )
                {
                    System.out.print( arr[i] + " ");
                }
                System.out.println();
                
				t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}