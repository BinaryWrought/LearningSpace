/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/riyas-test/0" target="_blank">GeeksForGeeks Basic Riya's Test</a>
 * 
 * To summarize the challenge:
 * Convert any given decimal number into the specified base.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class RiyasTest 
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
                String s = scanner.nextLine();                                                      //input string to test
                int mid = s.length() / 2;                                                           //mid point of the string
                if( s.length() % 2 != 0 )                                                           //if string length is odd
                    mid += 1;                                                                       //use this to ignore the middle character
                String end = s.substring( mid );                                                    //get the last half of the string
                String front = s.substring( 0, s.length()/2 );                                      //get the front half of the string
                
                HashMap<Character, Integer> frontSet = new HashMap<>();                             //container for the front half of the string's characters and their frequency
                HashMap<Character, Integer> endSet = new HashMap<>();                               //container for the back half of the string's characters and their frequency
                
                for( int i = 0; i < end.length(); ++i )                                             //loop to put characters and frequencies in a map
                {
                    if( !frontSet.containsKey( front.charAt( i ) ) )                                //check if char is already in map
                        frontSet.put( front.charAt( i ), 1 );                                       //if not, add it with a frequency of 1
                    else
                        frontSet.put( front.charAt( i ), frontSet.get( front.charAt( i ) ) + 1 );   //if it is, add it and increment the frequency
                    
                    if( !endSet.containsKey( end.charAt( i ) ) )                                    //check if char is already in map
                        endSet.put( end.charAt( i ), 1 );                                           //if not, add it with a frequency of 1
                    else
                        endSet.put( end.charAt( i ), endSet.get( end.charAt( i ) ) + 1 );           //if it is, add it and increment the frequency
                }
                
                System.out.println( ( frontSet.equals( endSet ) ) ? "YES" : "NO" );                 //print the results
				t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}