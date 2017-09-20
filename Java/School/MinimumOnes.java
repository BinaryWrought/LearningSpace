/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/row-with-minimum-number-of-1s/0" target="_blank">GeeksForGeeks School Row with minimum number of 1's.</a>
 * 
 * To summarize the practice:
 * Print the index of the row of the matrix that has the least number of 1's in it.
 * If no rows have a 1 then print -1.
 * If more than one row has the same number of minimum 1s the print the lowest index.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class MinimumOnes 
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
				int n = scanner.nextInt();															//get the rows of the matrix
				int m = scanner.nextInt();															//get the columns of the matrix				
				int[][] matrix = new int[n][m];														//create the matrix
				
				int index = -1;																		//the index of the row with the least number of ones				
				int previousCount = m;																//the previously found lowest number of ones in a row - initialized to m as that implies an entire row is full of 1s.
				
				for( int i = 0; i < n; i++ )														//loop through each row of the matrix
				{		
					int countOnes = 0;																//container to count the ones in the row
					for( int j = 0; j < m; j++ )													//loop through each column of the matrix
					{
						matrix[i][j] = scanner.nextInt();											//populate the matrix
						if( matrix[i][j] == 1 )														//check if this entry is a one
							countOnes++;															//if it is a one, add to the count of ones for this row
					}
					
					if( countOnes > 0 )																//after populating the row, check if there were ones
					{
						if( index == -1 )															//if no index was found yet
							index = i;																//set the index regardless (this will cover a special case where all rows contain all 1s.
						
						if( countOnes < previousCount )												//check if this count is less than the previous count
						{
							previousCount = countOnes;												//set the previous count to the newly found one
							index = i;																//set the index to that of the row with the least number of 1's
						}
					}					
				}
				
				System.out.println( index );														//print the result				
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
    }
}
