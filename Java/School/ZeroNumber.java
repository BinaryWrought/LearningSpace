/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.Scanner;

/**
 *
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/zero-number/0" target="_blank">GeeksForGeeks School Zero Number.</a>
 * I modified it slightly so it will continue to take test cases until a non integer input is given.
 * 
 * To summarize the practice:
 * Determine if the given input is a zero a number.
 * A zero number is any number that contains a zero but does not start with a zero.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class ZeroNumber 
{
	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner( System.in );													//create a scanner object to get user input
		try																							//this try block is to catch the inevitable exception caused by the user quitting 
		{
			String input = scanner.next();															//get the input from the user
			while( !input.isEmpty() )																//only execute if the input is greater than 
			{
				Long.parseLong(input );
			    System.out.println( ( input.contains( "0" ) && !input.startsWith( "0" ) )? "YES" : "NO" );
				input = scanner.next();
			}
		}
		catch( NumberFormatException e )															//catch the inevitable exception thrown by the user
		{
			
		}
	}
}
