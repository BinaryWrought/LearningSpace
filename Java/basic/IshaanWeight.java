/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.math.BigInteger;
import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/ishaans-weight/0" target="_blank">GeeksForGeeks Basic Ishaan's Weight</a>
 * 
 * To summarize the challenge:
 * Determine how much money Ishaan would make if he gets paid every K push ups the amount of push ups done.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class IshaanWeight 
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
                BigInteger n = scanner.nextBigInteger();                                            //get number of push ups
                int k = scanner.nextInt();                                                          //frequency of payment                
                BigInteger sum = new BigInteger("0");                                               //sum of payment
                
                for( int i = 0; i <= n.intValue(); i+=k )                                           //loop of all push ups
                {
                    sum = sum.add( new BigInteger( Integer.toString( i ) ) );                       //pay Ishaan
                }
                
				System.out.println( sum );                                                          //print the output
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}