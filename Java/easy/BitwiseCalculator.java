/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/ishaans-curiosity/0" target="_blank">GeeksForGeeks Easy Ishaan's Curiosity</a>
 * 
 * To summarize the challenge:
 * Given two integers A dn B, calculate the bitwise OR of all integers in range from A to B inclusive.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class BitwiseCalculator 
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
     
                BigInteger a = scanner.nextBigInteger();                                            //get low end of range
                BigInteger b = scanner.nextBigInteger();                                            //get high end of range
                
                BigInteger output = a;                                                              //container for result
                
                BigInteger i = a.add( new BigInteger( "1" ) );
                
                while( i.intValue() <= b.intValue() )
                {
                    output = output.or( i );
                    i = i.add( new BigInteger( "1" ) );
                }
                
                System.out.println( output.intValue() );                                            //print the result
                             
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}