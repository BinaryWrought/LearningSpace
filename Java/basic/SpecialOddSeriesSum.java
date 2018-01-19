/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/special-odd-series-sum/0" target="_blank">GeeksForGeeks Basic Special Odd Series Sum</a>
 * 
 * To summarize the practice:
 * Given a number n, find the sum of the series where the ith term is the sum of the first i odd natural numbers.
 * For example: input of 3:
 * (1) + (1+3) + (1+3+5) = 14
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class SpecialOddSeriesSum 
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
				int n = scanner.nextInt();                                                          //get the input number    
                int sum = 0;                                                                        //container for sum of the series
                for( int i = 1; i <= n; ++i )                                                       //loop for calculating the series
                    sum = sum + (i*i);                                                              //the series
                System.out.println( sum );                                                          //print the sum
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}