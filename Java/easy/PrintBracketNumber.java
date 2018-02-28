/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;
import java.util.Stack;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/print-bracket-number/0" target="_blank">GeeksForGeeks Print Bracket Number</a>
 * 
 * To summarize the challenge:
 * Given a string of parentheses, print the bracket number.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class PrintBracketNumber 
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
                char[] exp = scanner.nextLine().toCharArray();                                      //get the expression as a char array                
                int count = 1;                                                                      //container for bracket position number
                Stack<Integer> s = new Stack<>();                                                   //stack to hold bracket position
                
                for( int i = 0; i < exp.length; ++i )                                               //loop through the expression
                {
                    if( exp[ i ] == '(' )                                                           //if the char is an opening parenthesis...
                    {
                        System.out.print( count + " " );                                            //print the current position number
                        s.push( count );                                                            //add this position number to the stack
                        count++;                                                                    //increase the position number
                    }
                    else if( exp[ i ] == ')' )                                                      //if the char is a closing parenthesis...
                    {
                        System.out.print( s.pop() + " " );                                          //pop the last position number from the stack
                    }
                }
                
                System.out.println();
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}