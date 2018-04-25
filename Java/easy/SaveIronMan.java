/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/save-ironman/0" target="_blank">GeeksForGeeks Easy Save IronMan</a>
 * 
 * To summarize the challenge:
 * Given a string, check if it is a palindrome.
 * Ignore case, symbols, and whitespace. Only check letters and numbers.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class SaveIronMan 
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
                String s = scanner.nextLine();                                                      //input string
                s = s.replaceAll( "\\s|\\W|\\b", "");                                               //strip all white space non-word characters (leaves letters and numbers), and border characters (like tab, new line, underscore)
                s = s.toLowerCase();                                                                //ignore case of palindrome                
                String r = new StringBuilder( s ).reverse().toString();                             //reverse the string                
                System.out.println( ( s.equals( r ) ) ? "YES" : "NO" );                             //compare reversed string to regular string, if equal then is palindrome
                             
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}