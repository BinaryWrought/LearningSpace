/*
 * This is free to use as it was only made for practice.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * This class contains several methods for getting the factors of a given integer.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class Factorization 
{
    
    /**
     * This method will return all of the factors of a given integer in an array list
     * @param n the integer to factor
     * @return an array list of integers that are factors of n
     */
    public static ArrayList<Integer> factorsAsArray( int n )
    {
        ArrayList<Integer> result = new ArrayList<>();                                              //container for the result
        double limit = Math.sqrt( n );                                                              //limit the algorithm for speed and efficiency
        
        for( int i = 1; i <= limit; ++i )                                                           //loop to find all of the factors
        {
            if( n % i == 0 )                                                                        //if the given number is divisible by i then this is a factor
            {
                result.add( i );                                                                    //add this factor to the result
                
                if ( i != ( n / i ) )                                                               //if n/i is not the same number as i then include it in the result
                    result.add( n / i );                                                            //add this factor to the result
            } 
        }
        
        return result;                                                                              //return the result
    }
    
    /**
     * This method will return all of the factors of a given integer as a tree
     * @param n the integer to factor
     * @return an array list of integers that are factors of n
     */
    public static TreeSet<Integer> factorsAsTree( int n )
    {
        TreeSet<Integer> result = new TreeSet<>();                                                  //container for the result
        double limit = Math.sqrt( n );                                                              //limit the algorithm for speed and efficiency
        
        for( int i = 1; i <= limit; ++i )                                                           //loop to find all of the factors
        {
            if( n % i == 0 )                                                                        //if the given number is divisible by i then this is a factor
            {
                result.add( i );                                                                    //add this factor to the result
                result.add( n / i );                                                                //add this factor to the result (note the check for sameness wasn't needed as this is a tree set)
            } 
        }
        
        return result;                                                                              //return the result
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

			while( t > 0 )																			//So long as there are more test cases
			{		
                int x = scanner.nextInt();                                                          //get the number to factor
                
                System.out.println( "Factors using printFactors method: " );
                printFactors(x);
                System.out.println();
                
                System.out.println( "Factors using printFactorsSorted method: " );
                printFactorsSorted(x);
                System.out.println();
                
                System.out.println( "Factors using factorsAsArray method then printed here: " );
                ArrayList<Integer> arrayResult = factorsAsArray(x);
                for( Integer i: arrayResult )                                                       //for each loop to print the factors in the array
                    System.out.print( i + " " );                                                    //print the factor
                System.out.println();
                
                System.out.println( "Factors using factorsAsTree method then printed here: " );
                TreeSet<Integer> treeResult = factorsAsTree(x);
                for( Integer i: treeResult )                                                        //for each loop to print the factors in the array
                    System.out.print( i + " " );                                                    //print the factor
                System.out.println();
                
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
    
    /**
     * This method prints the factors of n space separated
     * @param n the integer to be factored
     */
    public static void printFactors( int n )
    {
        double limit = Math.sqrt( n );                                                              //limit the algorithm for speed and efficiency
        
        for( int i = 1; i <= limit; ++i )                                                           //loop to find all of the factors
        {
            if( n % i == 0 )                                                                        //if the given number is divisible by i then this is a factor
            {
                System.out.print( i + " " );                                                        //print this factor
                
                if ( i != ( n / i ) )                                                               //if n/i is not the same number as i then include it in the result
                    System.out.print( (n / i) + " " );                                              //print this factor
            }
        }
    }
    
    /**
     * This method will print the factors of the given integer sorted
     * @param n the integer to be factorized
     */
    public static void printFactorsSorted( int n )
    {
        ArrayList<Integer> result = new ArrayList<>();                                              //container for the result
        double limit = Math.sqrt( n );                                                              //limit the algorithm for speed and efficiency
        
        for( int i = 1; i <= limit; ++i )                                                           //loop to find all of the factors
        {
            if( n % i == 0 )                                                                        //if the given number is divisible by i then this is a factor
            {
                result.add( i );                                                                    //add this factor to the result
                
                if ( i != ( n / i ) )                                                               //if n/i is not the same number as i then include it in the result
                    result.add( n / i );                                                            //add this factor to the result
            } 
        }
        
        Collections.sort( result);        
        for( Integer i: result )                                                                    //for each loop to print the factors in the array
            System.out.print( i + " " );                                                            //print the factor
    }
}