/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/easy-string/0" target="_blank">GeeksForGeeks Easy Easy String</a>
 * 
 * To summarize the challenge:
 * Given a string, compress it such that the output is the count of the individual characters and the character.
 * For example: aaABBb = 3a3b (because there are 3 a's and 3 b's )
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class EasyString 
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
				char[] c = scanner.next().toLowerCase().toCharArray();								//get the string as a char array in lower case (as per the requirements)
                
                int count = 1;                                                                      //container for counting repeating chars (initialized to 1 because the first char of the string will appear)
                char x = c[0];                                                                      //container for the current char of the string (initialzied to the first char)
                
                for( int i = 1; i < c.length; ++i )                                                 //loop through all the chars in the string
                {
                    if( c[i] != x )                                                                 //if this char is not the same as the previous one...
                    {
                        System.out.print( count + "" + x );                                         //print the count and the char
                        count = 1;                                                                  //reset the count
                        x = c[i];                                                                   //save the current char
                    }
                    else                                                                            //still counting the same char
                    {
                        count++;                                                                    //increase the count
                    }                    
                }                
                
                System.out.println( count + "" + x );                                               //print the result of the last char
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}