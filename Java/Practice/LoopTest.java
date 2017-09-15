/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.Scanner;

/**
 *
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/java-loops-set-1/0" target="_blank">GeeksForGeeks Java Loops Practice.</a>
 * I modified it slightly so it will continue to take test cases until a non integer input is given or a value less than 1.
 * 
 * To summarize the practice:
 * This will take a single integer input N and print space separated sums of the even and odd integers of the first N natural numbers.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class LoopTest 
{    
	/**
	 * The main method will get an integer input from the user.
	 * If a noninteger or integer less than 1 is given the program will exit.
	 * 
	 * @param args not used
	 */
	public static void main( String[] args ) 
	{
    	Scanner scanner = new Scanner( System.in );		//create a scanner object to get user input
		try												//this try block is to catch the inevitable exception caused by the user quitting 
		{
			int input = scanner.nextInt();				//get the input from the user
			while( input > 0 )							//only execute if the input is greater than 0
			{
				sumEvensAndOdds( input );				//call the method to find the sums
				input = scanner.nextInt();				//get the next input from the user
			}
		}
		catch( Exception e )							//catch the inevitable exception thrown by the user
		{
			
		}
	}
	
	/**
	 * This method will print space separated sums of the even and odd integers of the first n natural numbers.
	 * 
	 * @param n the range of natural numbers
	 */
	public static void sumEvensAndOdds( int n )
	{
		int even = 0;									//container for even sums
		int odd = 0;									//contain for odd sums
		
		for( int i = 1; i <= n; i++)					//loop through the natural numbers up to n
		{
			if( i % 2 == 0 )							//mod 2 to check for evens
				even += i;								//add this number to the even sum
			else
				odd += i;								//otherwise it is odd so add the number to the odd sum
		}
		
		System.out.println( even + " " + odd );			//print the even and odd sums with a space separating them on their own line
		
	}
}
