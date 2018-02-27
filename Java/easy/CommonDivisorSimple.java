/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/common-divisor/0" target="_blank">GeeksForGeeks Easy Common Divisor</a>
 * 
 * To summarize the challenge:
 * Given two integers find the number of common divisors.
 * 
 * This one is a solution I saw someone else use. It is much simpler than my original one.
 * I still kept my original one because it was the first time I felt compelled to use the intersection of two sets.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class CommonDivisorSimple 
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
                int p = scanner.nextInt();                                                          //get the first input
                int q = scanner.nextInt();                                                          //get the second input
                int count = 0;
                
                for( int i = 1; i <= p; ++i )
                {
                    if( p % i == 0 && q % i == 0 )
                        count++;
                }
                
                System.out.println( count );
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}