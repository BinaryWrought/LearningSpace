/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/connell-sequence/0" target="_blank">GeeksForGeeks Easy Connell Sequence</a>
 * 
 * To summarize the challenge:
 * Given an integer N print the first N terms of the Connell Sequence.
 * The Connell Sequence is defined as the first odd number (1) the next two even numbers (2, 4) the next three odd numbers (5, 7, 9), the next four even numbers ... and so on.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class ConnellSequence 
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
                int n = scanner.nextInt();                                                          //number of terms to get
                int sequence = 1;                                                                   //current term in the sequence, starts at 1
                int count = 0;                                                                      //number of terms in the current set (1 odd, 2 even, 3 odd, etc...)            
                
                for( int i = 0; i < n; ++i )                                                        //loop to get all the terms
                {
                    for( int j = 0; count < n && j <= i; ++j )                                      //loop to get a set of terms (1 odd, 2 even, 3 odd, 4 even, etc...)
                    {
                        System.out.print( sequence + " " );                                         //print the current term in the sequence
                        sequence += 2;                                                              //increment the sequence by 2 to get the next even or odd number
                        count++;                                                                    //increase the count of terms found
                    }
                    sequence -= 1;
                }
                
                System.out.println();                                                               //print the result
                             
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}