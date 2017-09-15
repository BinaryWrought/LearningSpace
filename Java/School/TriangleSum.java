/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.Scanner;

/**
 *
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles/0" target="_blank">GeeksForGeeks School Sum of upper and lower triangles.</a>
 * I modified it slightly so it will continue to take test cases until a non integer input is given.
 * 
 * To summarize the practice:
 * Given a matrix print the sum of the upper and lower triangular elements.
 * Upper is the diagonal and elements above it.
 * Lower is the diagonal and elements below it.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class TriangleSum 
{

    /**
	 * The main method will get the input matrix size from the user,
	 * then it will get the array elements and compute the sums.
	 * 
     * @param args the command line arguments
     */
    public static void main( String[] args ) 
	{
		Scanner scanner = new Scanner( System.in );													//create a scanner object to get user input
		try																							//this try block is to catch the inevitable exception caused by the user quitting 
		{
			int n = scanner.nextInt();																//get the input from the user
			while( n > 0 )																			//So long as there is a valid input
			{
			    int[][] arr = new int[n][n];														//create a matrix from the specified size				
				int upperSum = 0;																	//container for the sum of the upper triangle
				int lowerSum = 0;																	//container for the sum of the lower triangle
				
				for( int i = 0; i < n; i++ )														//outer loop to populate the matrix
				{
					for( int j = 0; j < n; j++ )													//inner loop to populate the matrix
					{
						arr[i][j] = scanner.nextInt();												//the elements in the matrix are populated at i, j
						if( i <= j )																//Upper triangle is every element where i <= j
						    upperSum += arr[i][j];													//upper sum
					    if( i >= j )																//Lower triangle is every element where i >= j
					        lowerSum += arr[i][j];													//lower sum
					}
				}
				
				System.out.println( upperSum + " " + lowerSum );									//print the results				
				n = scanner.nextInt();																//get the next test case				
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
	}
}