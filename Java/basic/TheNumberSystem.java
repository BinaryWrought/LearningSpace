/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/the-number-system/0" target="_blank">GeeksForGeeks Basic The Number System</a>
 * 
 * To summarize the challenge:
 * Convert any given decimal number into the specified base.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class TheNumberSystem 
{
    
    /**
     * This method will take any given decimal number 'n' and convert it to base 'k'
     * Note that this will only work for a base less than or equal to 10
     * @param n - the decimal number to convert
     * @param k - the base to convert to
     * @return - a string representation of the result
     */
    public static String convertToBaseK( int n, int k )
    {
        String r = "";
        if( k <= 10 )
        {
            while( n > 0 )
            {
                r += n%k;
                n /= k;
            }
        }
        
        return new StringBuilder( r ).reverse().toString();
    }
    
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
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                
                System.out.println( convertToBaseK( n, k ) );                                       //print the results
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}