/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/tidy-number/0" target="_blank">GeeksForGeeks School Tidy Number.</a>
 * 
 * To summarize the practice:
 * Given a number, check if it is tidy or not.
 * A tidy number is a number whose digits are in ascending order.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class TidyNumber 
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

				boolean isTidy = true;
				String n = scanner.next();															//Get the test case	
				for( int i = 0; i < n.length()-1; i++ )
				{
					int atI = Integer.parseInt( Character.toString( n.charAt( i ) ) );				//get the integer at this index
					int next = Integer.parseInt( Character.toString( n.charAt( i + 1 ) ) );			//get the integer at the next index
					if( atI > next )																//not a tidy number
					{
						isTidy = false;																//set the flag
						break;																		//might as well break since it was alreayd shown to be not tidy
					}
				}
				System.out.println( isTidy? "1" : "0" );											//print the result
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
    }
}

/*
 * Note about the solution above:
 * I effectively used a string as a char array and compared the chars converted to ints.
 * I did this because I wasn't sure how to iterate through a number one digit at a time.
 * I found a solution on stack overflow that would be useful for iterating through an int.
 * But I will keep my char solution here and make a demo program that iterates through an int.
 */