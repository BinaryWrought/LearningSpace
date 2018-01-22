/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/narcissistic-number/0" target="_blank">GeeksForGeeks Basic Narcissistic Number</a>
 * 
 * To summarize the challenge:
 * Given an integer, determine if the number is a narcissistic number.
 * A narcissistic number is defined as a number N where the sum of its digits raised to the power of the number of digits equals the original number N.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class NarcissisticNumber 
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
            scanner.nextLine();
            
            while( t > 0 )																			//So long as there are more test cases
			{		
				String n = scanner.nextLine();                                                      //get the integer that is the input as a string for parsing
                int N = Integer.parseInt( n );                                                      //get the input as an integer for comparison
                int sum = 0;                                                                        //container for the sum
                for( int i = 0; i < n.length(); ++i )                                               //loop through each digit of the input number
                {
                    sum += Math.pow( Integer.parseInt( String.valueOf( n.charAt( i ) ) ), n.length() ); //sum each digit raised to the power of the number of digits
                }
                
                System.out.println( ( sum == N )? "Yes" : "No" );                                   //compare the sum to the original and print the result
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}