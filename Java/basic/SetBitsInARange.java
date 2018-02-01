/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/set-all-the-bits-in-given-range-of-a-number/0" target="_blank">GeeksForGeeks Basic Set all the bits in given range of a number</a>
 * 
 * To summarize the challenge:
 * Given a number N, and a range from L to R set all the bits in the range in the binary representation of N.
 * Print the modified number as a decimal number.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class SetBitsInARange 
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
                BigInteger b = scanner.nextBigInteger();                                            //need to use BigInteger due to constraints of input            
                
                int l = scanner.nextInt() - 1;                                                      //get the left range and subtract one because counting starts at 0
                int r = scanner.nextInt() - 1;                                                      //get the right range and subtract one because counting starts at 0
                
                for( int i = l; i <= r; ++i )                                                       //loop just for the length of the range
                    b = b.setBit( i );                                                              //set the bits in the specified range
                
                System.out.println( b.intValue() );                                                 //print the new number
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{

		}
	}
}