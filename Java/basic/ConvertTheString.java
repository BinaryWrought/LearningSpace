/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/convert-the-string/0" target="_blank">GeeksForGeeks Basic Convert The String</a>
 * 
 * To summarize the challenge:
 * Given a string change it based on the following rules:
 * Delete all vowels from the string
 * Inset a # in front of all the consonants
 * Change the case of all the letters of the string
 * If the final string is null (empty?) print -1
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class ConvertTheString 
{
    /**
     * This method will determine if the given character is a vowel or not
     * @param c the char to check if it is a vowel
     * @return true if the given char is a vowel, false if not
     */
    public static boolean isVowel( char c )
    {
        if( c == 'a' || c == 'A' || 
            c == 'e' || c == 'E' || 
            c == 'i' || c == 'I' || 
            c == 'o' || c == 'O' || 
            c == 'u' || c == 'U')
            return true;
        else
            return false;
    }

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
                                       
                String result = "";                                                                 //container for the output
                
                for( int i = 0; i < s.length(); ++i )                                               //loop through each char in the string
                {
                    if( !isVowel( s.charAt( i ) ) )                                                 //only include consonants in the result string
                    {                    
                        result += '#';                                                              //one of the rules is to place a # in front of all consonants
                        
                        if( Character.isUpperCase( s.charAt( i ) ) )                                //chars need to have their case flipped, so check if the given char is upper case
                            result += Character.toLowerCase( s.charAt( i ) );                       //if so, add it to the string as lower case
                        else
                            result += Character.toUpperCase(s.charAt( i ) );                        //otherwise add it to the string as upper case
                    }
                }
                    
                System.out.println( ( result.length() == 0 )? "-1" : result );                      //print the end result
                
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}