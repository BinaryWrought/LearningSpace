/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/extra-perfect-numbers/0" target="_blank">GeeksForGeeks Easy Extra Perfect Numbers</a>
 * 
 * To summarize the challenge:
 * Given a number N, count the numbers in the range from 1 to N that are "extra perfect."
 * An extra perfect number has only the first and last bit set.
 * 
 * I did some binary math and found that extra perfect numbers are found with: 1 + 2^i (i = 0 to n)
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class ExtraPerfect 
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
				int n = scanner.nextInt();															//get the number N
                
                int count = 0;                                                                      //container to hold the number of perfect numbers
                
                for( int i = 0; i <= n; ++i )                                                       //loop to count all the perfect numbers
                {
                    int temp = 1 + (int)Math.pow( 2, i );                                           //find a perfect number using this formula
                    if( temp <= n )                                                                 //so long as the perfect number is less than or equal to N
                        count++;                                                                    //increase the count
                    else
                        break;                                                                      //otherwise end the loop
                }
                
                System.out.println( count );                                                        //print the result              
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}