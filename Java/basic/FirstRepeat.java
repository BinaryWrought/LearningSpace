/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/find-first-repeated-character/0" target="_blank">GeeksForGeeks Basic First Repeated Character.</a>
 * 
 * To summarize the practice:
 * Given a string, find the first character that repeats.
 * Print the repeated char if found, -1 if not.
 * This is similar to "FirstRepeatedCharacter" but this the goal here is to find the first occurance of a repeated character.
 * Note that in the string "geeksforgeeks" 'e' is the first repeated character, not 'g'.
 * This is because 'e' repeats before 'g' does.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class FirstRepeat 
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
				String s = scanner.next();															//get the string to be parsed
				Map< Character, Integer > map = new HashMap<>();									//container for the characters
				boolean found = false;																//flag to keep track of found repeated char
				
				for( int i = 0; i < s.length(); i++ )												//loop through all the chars in the string
				{
					if( !map.containsKey( s.charAt( i ) ) )											//check if the map already has this char
					{
						map.put( s.charAt( i ), 0 );												//if not, add it to the map
					}
					else
					{
						System.out.println( s.charAt( i ) );										//the char was already found in the map, so print it
						found = true;																//set the flag since a char was found repeated
						break;																		//break the loop as the first char was already found
					}

				}
				
				if( !found )																		//no repeating char was found
					System.out.println( "-1" );														//print -1
				
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}