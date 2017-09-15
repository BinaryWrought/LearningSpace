/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.Scanner;

/**
 *
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/java-switch-case-statement/0" target="_blank">GeeksForGeeks Java Switch Case Practice.</a>
 * I modified it slightly so it will continue to take test cases until a non integer input is given.
 * 
 * To summarize the practice:
 * Calculate the area of a circle and rectangle depending on user choice.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class SwitchCase 
{
	/**
	 * The main method will take an input from the user, check if it is a valid number (if not the app will exit),
	 * then, as per the problem description there will be two lines of input for each calculation.
	 * The first line will be a 1 or 2 to denote circle or rectangle, respectively.
	 * The second line will be the radius for a circle, or space separated length and width for rectangle.
	 * Lastly, the main will call a method to calculate the area based on the inputs.
	 * 
	 * @param args not used
	 */
	public static void main( String[] args ) 
	{
		Scanner scanner = new Scanner( System.in );													//create a scanner object to get user input
		try																							//this try block is to catch the inevitable exception caused by the user quitting 
		{
			int input = scanner.nextInt();															//get the input from the user
			while( input > 0 )																		//So long as there is a valid input
			{
				switch( input )																		//at this stage only a 1 or 2 is valid input
				{
					case 1:																			//when 1, then a circle area is to be calculated
						int radius = scanner.nextInt();												//get the radius as the next input
						System.out.println( circleArea( radius ) );									//print the result of the area calculation
						break;
					case 2:																			//when 2, then a rectangle is to be calculated
						int length = scanner.nextInt();												//get length as the next input
						int width = scanner.nextInt();												//get width as next input
						System.out.println( rectangleArea( length, width ) );						//print the result of the area calculation
						break;
				}
				input = scanner.nextInt();															//get the next area calculation command from the user
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
	}
	
	/**
	 * This method will simply calculate the area of a circle with given radius
	 * @param radius the radius of the circle whose area will be calculated
	 * @return the result of the area calculation
	 */
	public static double circleArea( int radius )
	{
		return Math.PI * Math.pow( radius, 2 );														//area of a circle is A = pi * r^2
	}
		
	/**
	 * This method will simply calculate the area of a rectangle with given length and width
	 * @param length the length of the rectangle
	 * @param width the width of the rectangle
	 * @return the result of the area calculation
	 */
	public static double rectangleArea( int length, int width )
	{
		return length * width;																		//area of a rectangle is A = l * w
	}
}
