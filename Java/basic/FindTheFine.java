/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/find-the-fine/0" target="_blank">GeeksForGeeks Basic Find the Fine.</a>
 * 
 * To summarize the practice:
 * Given a date, and array of car numbers, and an array of fines, report the total fine collected.
 * Even car numbers are collected on odds dates. Odd car numbers are collected on even dates.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class FindTheFine 
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
				int n = scanner.nextInt();															//get the size of the array
				int date = scanner.nextInt();														//get the date
				boolean isEven = false;																//container for the date being even or odd
				
				if( date % 2 == 0 )																	//if this is true...
					isEven = true;																	//then the given date is even
				
				int[] cars = new int[n];															//container for the car numbers
				
				for( int i = 0; i < n; ++i )														//try and get into the habit of always ++i never i++
				{
					cars[i] = scanner.nextInt();													//get the car number
				}
								
				int fine = 0;																		//container for the total fine
				for( int i = 0; i < n; ++i )														//loop to sum fines
				{
					int temp = scanner.nextInt();
					if( cars[ i ] % 2 == 0 && !isEven )												//if the car number is even but the date is not...
						fine += temp;																//add the fine for this car to the total
					else if( cars[ i ] % 2 != 0 && isEven )											//if the car number is not even but the date is...
						fine += temp;																//add the fine for this car to the total
				}
				
				System.out.println( fine );															//print the result
				
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}