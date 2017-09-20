/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/segregate-0s-and-1s/0" target="_blank">GeeksForGeeks School Segregate 0s and 1s.</a>
 * 
 * To summarize the practice:
 * Given an array of 1s and 0s separate them such that 0s are on the left and 1s on the right.
 * This is one of those problems where given the looseness of the constraints one doesn't need to bother sorting the array.
 * Instead just read the data as it comes in and build two strings on the fly.
 * But keeping with the spirit of the challenge, I have made another attempt that involves sorting.
 * That one is the class SegregateWithArray.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class Segregate 
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
				int n = scanner.nextInt();															//get the number of inputs
				String zeros = "";																	//a container for the zeros
				String ones = "";																	//a container for the ones
				
				for( int i = 0; i < n; i++ )														//loop through all the inputs
				{
					if( scanner.nextInt() == 0 )													//if the next input is a zero
						zeros += "0 ";																//add a zero and a space to the zeros string
					else
						ones += "1 ";																//otherwise by the constraints of the challenge it must be a one so add a one and a space to that string
				}
				
				System.out.println( zeros + ones );													//print the results
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
    }
}