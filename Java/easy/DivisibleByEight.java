/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/check-if-a-number-is-divisible-by-8/0" target="_blank">GeeksForGeeks Easy Check If a Number is Divisible By 8</a>
 * 
 * To summarize the challenge:
 * Given a number check if it is divisible by 8.
 * 
 * This challenge looks like its a lot harder to do in C/C++.
 * For once I'm happy to use the BigInteger class!
 * 
 * After solving it using multiple variables I decided to condense it down to a single line.
 * Now that's functional.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class DivisibleByEight 
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
//				BigInteger n = scanner.nextBigInteger();											//get the input for the test case
//                BigInteger r = n.mod( new BigInteger("8", 10 ) );                                   //check if the number is divisible by 8 by using mod 8.
//                System.out.println( ( r.intValue() == 0 )? "1" : "-1" );                            //print the result       
                
                //just for fun, here's the above code all on one line!
                System.out.println( ( scanner.nextBigInteger().mod( new BigInteger("8", 10 ) ).intValue() == 0 )? "1" : "-1" );
                
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}