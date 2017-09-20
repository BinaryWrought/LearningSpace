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
 * Because of the loose constraints I already solved this without dealing with the array directly.
 * But in order to keep with the spirit of the challenge I will do an attempt with sorting involved.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class SegregateWithArray 
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
				int[] c = new int[n];																//create the array
				
				for( int i = 0; i < n; i++ )														//loop to populate array
				{
					c[ i ] = scanner.nextInt();														//populate index
				}
				
				//apparently one can just call sort to get the array in ascending order then print the result
				//Arrays.sort( c );																	
				//if not using sort then try:
				
				int front = 0;																		//container for an index from the front of the array
				int back = n - 1;																	//container for an index from the back of the array
				
				//this loop is basically going to go from both ends of the array simultaneously
				while( front < back )																//so long as the front and back haven't crossed...
				{
					if( c[ front ] == 0 )															//check the front of the array for a 0
						front++;																	//if it is, increase the front index
					else if( c[ back ] == 1 )														//if not, check the back of the array for a 1
						back--;																		//if it is, increase the back index
					else																			//otherwise, we can safely swap the front and back elements
					{
						int temp = c[ front ];														//container for a swap
						c[ front ] = c[ back ];														//set the front element to the back element
						c[ back ] = temp;															//set the back element to the front element
					}
				}
				
				for( int i = 0; i < n; i++ )														//loop to print the array
				{
					System.out.print( c[ i ] + " ");												//each element is to be on the same line separated by a space
				}
				
				System.out.println();																//add a line between test cases				
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
    }
}