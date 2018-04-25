/*
 * This is free to use as it was only made for practice.
 */

import java.util.*;

/**
 * This class contains several methods that implement commonly requested mathematical operations.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class MathFunctions 
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
     * This method will return the greatest common divisor (GCD) of two given integers
     * @param a first integer
     * @param b second integer
     * @return the greatest common divisor
     */
    public static int gcd( int a, int b )
    {
        if( a == 0 )
            return b;
        
        return gcd(b%a, a);
    }

    /**
     * This method will determine if the given integer is a prime number.
     * @param n the integer to check if it is prime or not
     * @return true if n is prime, else false
     */
    public static boolean isPrime( int n )
    {
        if( n <= 1 )
            return false;
        
        for( int i = 2; i <= Math.sqrt( n ); ++i )
        {
            if( n % i == 0 )
                return false;
        }
        return true;
    }
        
    /**
     * This method will return the lowest common multiple (LCM) of the two given integers
     * @param a first integer
     * @param b second integer
     * @return the lowest common multiple
     */
    public static int lcm( int a, int b )
    {
        //lcm can be found with the algorith:
        //lcm(a,b) = ab/gcd(a,b)
        int lcm = (a*b) / gcd( a, b );
        return lcm;
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
    
    /**
     * Default constructor
     */
    public MathFunctions()
    {
        
    }
}