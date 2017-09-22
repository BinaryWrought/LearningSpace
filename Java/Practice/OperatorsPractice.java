/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/java-operatorsarithmetic-set-1/0" target="_blank">GeeksForGeeks Practice Operators.</a>
 * 
 * To summarize the practice:
 * Find the root of the quadratic equation.
 * Root can be found with: x = (-b +/- sqrt( b^2 - 4ac))/2a
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class OperatorsPractice 
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
				double a = scanner.nextDouble();													//Get the value of A in the equation
				double b = scanner.nextDouble();													//Get the value of B in the equation
				double c = scanner.nextDouble();													//Get the value of C in the equation
				double x1, x2;																		//containers for the two roots
				
				x1 = ( -b + Math.sqrt( Math.pow( b, 2 ) - (4 * a * c ) ) ) / (2 * a );				//Calculate the first root by the quadratic formula
				x2 = ( -b - Math.sqrt( Math.pow( b, 2 ) - (4 * a * c ) ) ) / (2 * a );				//Calculate the second root by the quadratic formula
				
				if( Double.isNaN( x1 ) || Double.isNaN( x2 ) )										//Check if either root is NaN
					System.out.println( "COMPLEX" );												//if so, print COMPLEX as per requirements
				else
					System.out.println( ( x2 > x1 )? x1 + " " + x2 : x2 + " " + x1 );				//if both roots are valid print then roots in ascending order
				
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
    }
}