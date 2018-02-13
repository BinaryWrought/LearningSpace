/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/convert-a-sentence-into-its-equivalent-mobile-numeric-keypad-sequence/0" target="_blank">GeeksForGeeks Easy Convert a sentence into its equivalent mobile numeric keypad sequence</a>
 * 
 * To summarize the challenge:
 * Given a string, convert it to its equivalent mobile keypad sequence.
 * The keypad is:
 * 1 = [], 2 = [ABC], 3 = [DEF]
 * 4 = [GHI], 5 = [JKL], 6 = [MNO]
 * 7 = [PQRS], 8 = [TUV], 9 = [WXYZ]
 * 
 * White space should be converted to a 0
 * 
 * Also, it takes 2 presses to get B and 3 presses to get C and similar for other characters.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class StringToKeyPad 
{
    /**
     * The main method
     * @param args the command line arguments
     */
	public static void main (String[] args) 
    {
		Scanner scanner = new Scanner( System.in );                                                 //create a scanner object to get input
		int t = scanner.nextInt();                                                                  //get the number of test cases
        scanner.nextLine();
        
		while( t > 0 )                                                                              //loop for all the test cases
        {
		    char[] s = scanner.nextLine().toCharArray();                                            //get the number of orders in this test case  
            String output = "";
            for( int i = 0; i < s.length; ++i )
            {
                output += getKey( s[ i ] );
            }
            
            System.out.println( output );
            t--;                                                                                    //end of this test case
		}
	}
	
    /**
     * This method will get the key pad equivalent for the given character
     * @param c the character to be converted to a keypad equivalent
     * @return the string of key presses that represent this character
     */
    private static String getKey( char c )
    {
        switch( c )
        {
            case 'A':
                return "2";
            case 'B':
                return "22";
            case 'C':
                return "222";
            case 'D':
                return "3";
            case 'E':
                return "33";
            case 'F':
                return "333"; 
            case 'G':
                return "4";
            case 'H':
                return "44";
            case 'I':
                return "444";
            case 'J':
                return "5";
            case 'K':
                return "55";
            case 'L':
                return "555"; 
            case 'M':
                return "6";
            case 'N':
                return "66";
            case 'O':
                return "666";
            case 'P':
                return "7";
            case 'Q':
                return "77";
            case 'R':
                return "777"; 
            case 'S':
                return "7777";
            case 'T':
                return "8";
            case 'U':
                return "88";
            case 'V':
                return "888";
            case 'W':
                return "9";
            case 'X':
                return "99"; 
            case 'Y':
                return "999";
            case 'Z':
                return "9999"; 
            default:
                return "0";
        }
    }
}