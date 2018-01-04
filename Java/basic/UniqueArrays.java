/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/the-problem-of-identical-arrays/0" target="_blank">GeeksForGeeks Basic The Problem of Identical Arrays.</a>
 * 
 * To summarize the practice:
 * Given two arrays determine if they are identical or not.
 * The elements of the arrays may be in a different order, we're only concerned with if they contain the same elements or not.
 * Print a 1 if identical, else print 0.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class UniqueArrays 
{

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) 
    {
        Scanner scanner = new Scanner( System.in );                         //create a scanner object to get user input
        try                                                                 //this try block is to catch the inevitable exception caused by the user quitting 
        {
                int t = scanner.nextInt();                                  //get number of test cases

                while( t > 0 )						//So long as there are more test cases
                {	
                        int n = scanner.nextInt();                          //container for size of array
                        int[] arrayOne = new int[10];
                        int[] arrayTwo = new int[10];
                        for( int i = 0; i < n; i++ )
                        {
                            int e = scanner.nextInt();
                            arrayOne[e] = arrayOne[e] + 1;
                        }                           
                        for( int i = 0; i < n; i++ )
                        {
                            int e = scanner.nextInt();
                            arrayTwo[e] = arrayTwo[e] + 1;
                        }

                        if( Arrays.equals(arrayOne, arrayTwo) )
                            System.out.println("1");
                        else
                            System.out.println("0");

                        t--;						//get next test case		
                }
        }
        catch( Exception e )						//catch an exception thrown by incorrect input
        {

        }
    }
}