/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/find-winner-of-the-game-of-nim/0" target="_blank">GeeksForGeeks Easy Find Winner of Game of Nim</a>
 * 
 * To summarize the practice:
 * Given a pile of stones and two players alternating picking one stone from the pile, determine who will pick the last stone.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class GameOfNim 
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
				int n = scanner.nextInt();															//get the number of stones
                if( n%2 == 0)
                    System.out.println("Player B");                                                 //If even number of stones, player B will win
                else
                    System.out.println("Player A");                                                 //otherwise Player A will win.
                
				t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}