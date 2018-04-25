/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/program-to-print-reciprocal-of-letters/0" target="_blank">GeeksForGeeks Easy Program to print reciprocal of letters</a>
 * 
 * To summarize the challenge:
 * Given a string print the reciprocal. The reciprocal of a letter is find the difference of the letter's position from "a" and then move from "z" that many positions.
 * This implies that the reciprocal of "a" is "z" and vice versa.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class ReciprocalString 
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
                String r = "";                                                                      //container for reciprocal of string
                for( int i = 0; i < s.length(); ++i )                                               //loop through each character in the string
                {
                    if( Character.isAlphabetic( s.charAt( i ) ) )                                   //if this character is a letter
                    {
                        if( Character.isLowerCase( s.charAt( i ) ) )                                //if the character is lower case
                            r += (char)('z' - ( s.charAt( i ) - 'a' ) );                            //add the reciprocal character to the output string
                        else if( !Character.isLowerCase( s.charAt( i ) ) )                          //if this character is upper case
                            r += (char)('Z' - ( s.charAt( i ) - 'A' ) );                            //add the reciprocal character to the output string
                    }
                    else                                                                            //character is not a letter
                        r += s.charAt( i );                                                         //this character is not a letter, just add it to the string as is
                }
                System.out.println( r );                                                            //print the result
                             
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}