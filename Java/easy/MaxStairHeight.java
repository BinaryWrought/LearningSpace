/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/maximum-height-of-the-staircase/0" target="_blank">GeeksForGeeks Easy Maximum Height of the Staircase</a>
 * 
 * To summarize the challenge:
 * Given a number of blocks N, determine the maximum height of a staircase made from those blocks.
 * The first floor requires 1 block, second floor 2, third 3, and so on.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class MaxStairHeight 
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
				int n = scanner.nextInt();															//get the number of blocks
                int floors = 0;                                                                     //container for the number of floors
                for( int i = 1; i <= n; ++i )                                                       //loop to build the staircase
                {
                    floors++;                                                                       //increment the number of floors each loop
                    n -= i;                                                                         //decrease n by i
                }

                System.out.println( floors );                                                       //print the result
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}