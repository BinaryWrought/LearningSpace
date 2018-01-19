/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/check-for-three-consecutive-numbers/0" target="_blank">GeeksForGeeks Basic Check for Three Consecutive Numbers</a>
 * 
 * To summarize the practice:
 * Given an integer, determine if it could be expressed as the sum of three consecutive integers.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class CheckThreeConsecutiveNumbers 
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
				int n = scanner.nextInt();                                                          //get the int that is the input          
                if( n%3 != 0 )                                                                      //if the number is divisible by 3 it can be expressed as a sum of three numbers
                    System.out.println( "-1" );                                                     //if not, print -1
                else
                    System.out.println( ( ( n/3 ) - 1 ) + " " + ( n/3 ) + " " + ( ( n/3 ) + 1 ) );  //print the three consecutive numbers
                
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}