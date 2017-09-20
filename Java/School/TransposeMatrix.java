/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/transpose-of-matrix/0" target="_blank">GeeksForGeeks School Transpose of Matrix.</a>
 * 
 * To summarize the practice:
 * Given a square array, transpose the matrix such that rows become columns and columns become rows.
 * This is another situation where the spirit of the challenge can be violated by cleverly manipulating the data as it comes in.
 * But looking at other solutions, they basically do the same thing I did anyway.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class TransposeMatrix 
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
				int[][] m = new int[n][n];
				
				for( int i = 0; i < n; i++ )														//loop to populate the rows of the matrix
				{
					for( int j = 0; j < n; j++ )													//loop to populate the columns of the matrix
					{
						m[ j ][ i ] = scanner.nextInt();											//by flipping the column and row indices we can populate the matrix in its transposed form
					}
				}
				
				for( int i = 0; i < n; i++ )														//loop to print the rows of the matrix
				{
					for( int j = 0; j < n; j++ )													//loop to print the columns of the matrix
					{
						System.out.print( m[ i ][ j ] + " " );										//print the elements of the matrix, space separated
					}
				}
				
				//Instead of populating the matrix flipped then printing it normal, one can also populate matrix normal and print it flipped as below:
//				for( int i = 0; i < n; i++ )														//loop to populate the rows of the matrix
//				{
//					for( int j = 0; j < n; j++ )													//loop to populate the columns of the matrix
//					{
//						m[ i ][ j ] = scanner.nextInt();											//populate matrix as normal
//					}
//				}
//								
//				for( int i = 0; i < n; i++ )														//loop to print the rows of the matrix
//				{
//					for( int j = 0; j < n; j++ )													//loop to print the columns of the matrix
//					{
//						System.out.print( m[ j ][ i ] + " " );										//print the elements of the matrix, space separated
//					}
//				}
				
				System.out.println();																//add a line between test cases
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
    }
}