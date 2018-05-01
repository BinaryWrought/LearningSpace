/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/program-for-length-of-the-longest-word-in-a-sentence/0" target="_blank">GeeksForGeeks Easy Program for length of the longest word in a sentence</a>
 * 
 * To summarize the challenge:
 * Given a string determine which word is the longest.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class LengthOfLongestWord 
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
				String s = scanner.nextLine();														//get the number of digits of A  
                String[] words = s.split( "\\s");                                                   //split the sentence into words by looking for spaces
                
                int longest = 0;                                                                    //container for length of longest word
                
                for( int i = 0; i < words.length; ++i )                                             //loop through all the words in the sentence
                {
                    if( words[ i ].length() > longest )                                             //if the length of this word is longer than the last found longest length
                        longest = words[ i ].length();                                              //store the new length
                }
                
                System.out.println( longest );                                                      //print the result              
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}