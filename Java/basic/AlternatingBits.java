/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/product-of-digits/0" target="_blank">GeeksForGeeks Basic Numbers having alternate bits</a>
 * 
 * To summarize the practice:
 * Given an integer, determine if its binary representation has alternating zeros and ones.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class AlternatingBits 
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
				long n = scanner.nextLong();														//get the integer to check for alternating bits
				
				String s = Long.toBinaryString( n );												//convert the integer to a binary string
				boolean doesAlternate = true;														//container to keep track of whether the bits alternate or not
				
				boolean zeroFirst = true;															//flag for checking current bit
				if( s.charAt( 0 ) == '1' )															//determine if the first char was a zero or one
					zeroFirst = false;																//first char was actually a 1
				
				for( int i = 1; i < s.length(); ++i )												//loop through all the bits
				{
					if( zeroFirst && s.charAt( i ) == '1' )											//if the previous bit was a zero and this bit is a 1...
					{
						zeroFirst = false;															//so far the string does alternate, flip the flag for the next loop
					}
					else if( !zeroFirst && s.charAt( i ) == '0' )									//if the previous bit was not a zero and this bit is a zero...
					{
						zeroFirst = true;															//so far the string does alternate, flip the flag for the next loop
					}
					else																			//if the conditionals above fail then this string does not alternate bits
					{
						doesAlternate = false;														//set the flag false
						break;																		//break the loop as it was already determine to not alternate
					}
				}
				
				System.out.println( ( doesAlternate ) ? "1" : "0" );								//print the result
				
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}