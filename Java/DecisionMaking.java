/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.Scanner;

/**
 *
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/playing-with-mobile-numbers/0" target="_blank">GeeksForGeeks Java Decision Making Practice.</a>
 * I modified it slightly so it will continue to take test cases until a non integer input is given.
 * 
 * To summarize the practice:
 * Print valid if the given input is a valid Indian mobile number or invalid if not.
 * The rules are:
 * 1.) The number should contain 10, 11, or 12 digits
 * 2.) If it contains 10 digits, then the first digit should be 7, 8, or 9.
 * 3.) If it contains 11 digits, then the first digit should be 0 and the second rule followed.
 * 4.) If it contains 12 digits then first two digits should be 91 and second rule followed.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class DecisionMaking 
{
	/**
	 * The main method will take an input from the user, check if it is a valid number (if not the app will exit),
	 * then uses the input to check if the string is a valid Indian mobile number.
	 * 
	 * @param args not used
	 */
	public static void main( String[] args ) 
	{
    	Scanner scanner = new Scanner( System.in );													//create a scanner object to get user input
		try																							//this try block is to catch the inevitable exception caused by the user quitting 
		{
			String input = scanner.next();															//get the input from the user
			while( !input.isEmpty() )																//only execute if the input is greater than 0
			{		
				Long.parseLong(input );																//this will cause the app to exit if a non integer is given as input
				System.out.println( validNumber( input )? "Valid" : "Invalid" );					//print the result of testing for validity
				//System.out.println( validNumberUsingRegex( input )? "Valid" : "Invalid" );		//print the result of testing for validity using regex instead of decisions
				input = scanner.next();																//get the next input from the user				
			}
		}
		catch( NumberFormatException e )															//catch the inevitable exception thrown by the user
		{
			
		}
	}	
	
	/**
	 * This method will satisfy rule two by checking if the number at the specified index is a 7, 8, or 9
	 * 
	 * @param n the string being checked for rule two
	 * @param index the index at which to check for the specified numbers
	 * @return a boolean indicating if the string passes rule two or not
	 */
	public static boolean ruleTwo( String n, int index )
	{
		return n.startsWith( "7", index ) || n.startsWith( "8", index ) || n.startsWith( "9", index );
	}
	
	/**
	 * This method will check if given input string is a valid Indian mobile number or not. 
	 * @param n the string being checked for validity
	 * @return a boolean indicating if the string is valid or not
	 */
	public static boolean validNumber( String n )
	{
		boolean isValid = false;										//a container for the result
		switch( n.length() )											//check for validity based on the length of the string
		{
			case 10:													//when 10 digits only follow rule 2
			{
				isValid = ruleTwo( n, 0 );								//check against rule two
				break;
			}
			case 11:													//when 11 digits follow rule 3 then 2
			{
				isValid = n.startsWith( "0" ) && ruleTwo( n, 1 );		//ruleTwo must be called with index 1 to check second digit
				break;
			}
			case 12:													//when 12 digits follow rule 4 then rule 2
			{
				isValid = n.startsWith( "91" ) && ruleTwo( n, 2 );		//ruleTwo must be called with index 2 to check third digit
				break;
			}
		}
		
		return isValid;													//return the result of the validity check
	}
	
	/**
	 * The follow method is a solution I found on GeeksForGeeks.
	 * It is a one line regex solution that is good to know.
	 * I feel it does not honor the spirit of the practice (decision making) but is a great solution for its simplicity.
	 * As regex is not something I have a ton of experience with, the comments in the method will explain how it works.
	 * 
	 * @param n the string to check for validity
	 * @return a boolean indicating if the string is valid or not
	 */
	public static boolean validNumberUsingRegex( String n )
	{

		return n.matches( "(91|0)?[789]\\d{9}" );	
		
		/*To break down the regular expression above:
		 * () is a grouping, | is alteration. So (91|0) must be what satisfies rules 3 and 4. It can be read as the string begins with 91 or 0 - begins with because it is the first part of the regex
		 * ? is 0 or 1 of previous expression. Coupled with the next set, this includes the previous expression ONLY IF AVAILABLE which is why this one regex also works for rule two.
		 * [] is an explicit set of characters to match. Seems to work like an OR such that [789] is 7 or 8 or 9
		 * \ before some characters makes them literal, before special matching characters it has the special character's effect.
		 * \d matches any decimal digit
		 * {} is an explicity quantifier
		 * I'm assuming that \\d{9} is used to check that the remaining string (after earlier expression checks) is 9 digits in length.
		 * 
		 * To summarize, the regex above could be read as follows:
		 * a string that starts with 91 or 0. If present or not, the next character should be 7, 8, or 9 and the remaining length of the string after 7, 8, or 9 should be 9 characters long.
		 */
	}
}

