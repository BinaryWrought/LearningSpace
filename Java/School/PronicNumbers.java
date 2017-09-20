/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/pronic-number/0" target="_blank">GeeksForGeeks School Pronic Numbers.</a>
 * I modified it slightly so it will continue to take test cases until a non integer input is given.
 * 
 * To summarize the practice:
 * A pronic number is the product of two consecutive integers. Such as: x = n( n + 1 )
 * Print all the pronic numbers from 0 to n (input)
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class PronicNumbers 
{

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) 
	{
		Scanner scanner = new Scanner( System.in );													//create a scanner object to get user input
		try																							//this try block is to catch the inevitable exception caused by the user quitting 
		{
			while( true )																			//So long as there are more test cases
			{		
				int n = scanner.nextInt();															//get the next pronic number to calculate to
				int pronicNumber;																	//container for the pronic number
				
				for( int i = 0; i <= n; i++ )														//loop to calculate all pronic numbers stopping when the pronic number is >= n
				{
					pronicNumber = i * ( i + 1 );													//pronic number by definition
					if( pronicNumber <= n )
						System.out.print( pronicNumber + " " );										//print the result
					else
					{
						System.out.println();														//add a line between test cases
						break;																		//break the loop as we have found the last number
					}
				}				
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
    }
}
