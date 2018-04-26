/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/english-words/0" target="_blank">GeeksForGeeks Easy English Words</a>
 * 
 * To summarize the challenge:
 * Given a string, print the pig latin modification.
 * If a word starts with a vowel it receives no modification, otherwise move all the consonants to the end and add "AY"
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class EnglishWords 
{

    /**
     * This method will check if the given character is a vowel or not
     * @param c the character to check if it is a vowel
     * @return true if c is a vowel, false if not
     */
    public static boolean isVowel( char c )
    {
        if( c == 'a' || c == 'A' || 
            c == 'e' || c == 'E' ||
            c == 'i' || c == 'I' || 
            c == 'o' || c == 'O' || 
            c == 'u' || c == 'U' )
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
                String word = scanner.nextLine();                                                   //The word to modify
                String end = "";                                                                    //container for characters to be appended to the end of the word
                
                int i = 0;                                                                          //index of character being looked at
                
                while( i < word.length() )                                                          //loop through the characters in the word
                {
                    if( !isVowel( word.charAt( i ) ) )                                              //if this character is not a vowel...
                    {
                        end += word.charAt( i );                                                    // add it to the end container and...
                        ++i;                                                                        // increment the index
                    }
                    else                                                                            //if it is a vowel...
                        break;                                                                      //end the loop
                }
                
                if( end.length() > 0 )                                                              //if characters were added to the end string
                    end += "AY";                                                                    //then add "AY" to that string
                word = word.substring( i );                                                         //remove the characters from the end string from the original word
                word += end;                                                                        //add the end string to the end of the word
                
                System.out.println( word );                                                         //print the result
                             
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}