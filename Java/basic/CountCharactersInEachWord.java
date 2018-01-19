/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/count-the-characters-in-each-word-in-a-given-sentence/0" target="_blank">GeeksForGeeks Basic Count the characters in each word</a>
 * 
 * To summarize the practice:
 * Given a sentence count and print the number of characters in each word in the sentence.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class CountCharactersInEachWord 
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
				String s = scanner.nextLine();                                                      //get the string that is the input sentence
				String[] results = s.split( " " );                                                  //split the sentence into words
                
                for( int i = 0; i < results.length; ++i )                                           //loop through each word in the sentence
                    System.out.print( results[i].length() + " " );                                  //print the number of characters in each word
                
                System.out.println();                                                               //print a line between test cases
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}