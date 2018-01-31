/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/stuti-and-her-problem/0" target="_blank">GeeksForGeeks Basic Stuti and her Problem.</a>
 * 
 * To summarize the challenge:
 * Given an integer, determine if it is the sum of the first "n" natural numbers. If so, print "n" else print "-1."
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class StutiProblem 
{

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) 
	{
		Scanner scanner = new Scanner( System.in );													//create a scanner object to get user input
		try																							//this try block is to catch an exception caused by invalid input
		{
			int t = scanner.nextInt();																//get number of test cases
			
			while( t > 0 )																			//So long as there are more test cases
			{	
				int in = scanner.nextInt();                                                         //container for the given integer
                
                int n = -1;                                                                         //container for the result                
                int sum = 0;                                                                        //container for the sum of n natural numbers
                
                for( int i = 1; i < in && sum < in; i++ )                                           //loop through the natural numbers stopping when the sum surpasses the given input
                {
                    sum += i;                                                                       //add the natural number to the sum
                    if( sum == in )                                                                 //if the sum equals the given input
                        n = i;                                                                      //save how many natural numbers it took
                }
                
				System.out.println( n );                                                            //print the result
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}