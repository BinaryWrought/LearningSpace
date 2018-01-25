/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/crazy-string/0" target="_blank">GeeksForGeeks Basic Crazy String</a>
 * 
 * To summarize the challenge:
 * Given a string if the first char is lower case then make the string alternate lower, upper, lower, etc.
 * Else if the first char is upper case make the string alternate upper, lower, upper, etc.
 * Print the string
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class CrazyString 
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
				String s = scanner.nextLine();                                                      //get the string to be converted for this test case
                boolean makeUpper = Character.isUpperCase( s.charAt( 0 ) );                         //check if the first char is upper case or not
                String result = "";                                                                 //container for end result string
                for( int i = 0; i < s.length(); ++i )                                               //loop through all the characters of the string
                {
                    if( makeUpper )                                                                 //if this char is to be upper case
                        result += Character.toUpperCase( s.charAt( i ) );                           //make it upper case and add it to the end string
                    else
                        result += Character.toLowerCase(s.charAt( i ) );                            //otherwise make the char lower case and add to the end string
                    makeUpper = !makeUpper;                                                         //reverse the case for the next char
                }   
                
                System.out.println(result);                                                         //print the resultant string
                
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}