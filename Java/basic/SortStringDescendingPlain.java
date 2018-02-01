/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/sort-the-string-in-descending-order/0" target="_blank">GeeksForGeeks Basic Sort the string in descending order</a>
 * 
 * To summarize the challenge:
 * Given a string sort the characters in descending order.
 * 
 * This is how I solved the challenge the first time without getting too fancy.
 * But according to GFG it takes too long.
 * Hence the third attempt "SortStringDescendingAlso" (the second attempt was the fancy one)
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class SortStringDescendingPlain 
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
			scanner.nextLine();
            
			while( t > 0 )																			//So long as there are more test cases
			{            
                char[] arr = scanner.nextLine().toCharArray();
                Arrays.sort( arr );                                                                 //sort the array in descending order
                for( int i = arr.length - 1; i >= 0; --i )                                          //loop to print the chars in the array in reverse
                    System.out.print( arr[i] );                                                     //print the char
                
                System.out.println();                                                               //add a line between test cases
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{

		}
	}
}