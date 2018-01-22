/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/even-odd-turn-game/0" target="_blank">GeeksForGeeks Basic Even-Odd Turn Game</a>
 * 
 * To summarize the challenge:
 * Given three numbers, X, Y, and P determine the value of max(X,y) / min(x,y) after P turns.
 * On each turn if the turn is odd multiple X by 2, on even turns multiple Y by 2.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class EvenOddTurnGame 
{

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) 
	{
		Scanner scanner = new Scanner( System.in );													//create a scanner object to get user input
		try																							//this try block is to catch any exception caused by invalid inputs
		{
			int t = scanner.nextInt();																//get number of test cases
            
            while( t > 0 )																			//So long as there are more test cases
			{		
				int x = scanner.nextInt();                                                          //get the integer that is X
                int y = scanner.nextInt();                                                          //get the integer that is Y
                int p = scanner.nextInt();                                                          //get the integer that is P
                                
                System.out.println( ( p % 2 == 0 )? ( Math.max( x, y )/Math.min( x, y ) ) : ( Math.max( 2*x, y )/Math.min( 2*x, y ) ) );
                //To explain how the above solves the challenge:
                //Double both x and y won't change the end result if both x and y are doubled.
                //Because of this, the check if p is even or odd at the starts means that either both x and y will be doubled equally (even) or not (odd)
                //As such, if p is odd then at the very end on x will have double once more than y.
                //That is why the division in the second part multiples x by 2, but not y, and why neither is multipled in the first part.
                
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}