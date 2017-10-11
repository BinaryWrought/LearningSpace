/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/binary-representation-of-next-number/0" target="_blank">GeeksForGeeks Basic Binary Representation of Next Number</a>
 * 
 * To summarize the practice:
 * Given the binary representation of an integer print the binary representation of the next integer (n+1).
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class BinaryOfNextNumber 
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
				String n = scanner.next();															//Get the input
				BigInteger nPlusOne = new BigInteger( n, 2 );										//convert the string to a Big Integer using the radix 2
				nPlusOne = nPlusOne.add( new BigInteger( "1" ) );									//add one to the BigInteger
				n = nPlusOne.toString( 2 );															//convert the new number back to a binary string using radix 2
				System.out.println( n );															//print the result
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{

		}
	}
}