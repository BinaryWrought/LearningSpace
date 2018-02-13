/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/hungry-pizza-lovers/0" target="_blank">GeeksForGeeks Easy Hungry Pizza Lovers</a>
 * 
 * To summarize the challenge:
 * Given a list of unique orders (i), the time the order was placed ( x[i] ) and the time the order takes to complete ( y[i] )
 * Print the order in which customers will get their pizza.
 * 
 * Right off the bat I will admit that I was not sure how to solve this but figured I could learn from it so I found a solution on GFG.
 * I liked this solution because it used a list and implemented comparable.
 * I cleaned up the solution so I could more easily understand and thus learn from it.
 * 
 * Then, the original solution used an ArrayList and sorted it using the defined comparable method.
 * I changed it to use a TreeSet so it will be sorted automatically.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class PizzaLovers 
{
    /**
     * The main method
     * @param args the command line arguments
     */
	public static void main (String[] args) 
    {
		Scanner scanner = new Scanner( System.in );                                                 //create a scanner object to get input
		int t = scanner.nextInt();                                                                  //get the number of test cases
        
		while( t > 0 )                                                                              //loop for all the test cases
        {
		    int n = scanner.nextInt();                                                              //get the number of orders in this test case

            TreeSet< PizzaOrder > tree = new TreeSet<>();
            
		    for( int i = 0; i < n; ++i )                                                            //loop to populate the list
            {
		        int orderPlacedAt = scanner.nextInt();                                              //get the time at which this order was place
		        int timeToComplete = scanner.nextInt();                                             //get the time for how long this order will take to complete              
                tree.add( new PizzaOrder( orderPlacedAt, timeToComplete, i + 1 ) );                 //add this order to the set of orders
		    }
            
            tree.forEach( ( p ) -> System.out.println( p.getOrderNo() ) );                          //print the results
            
            //These two lines below do the same thing as the line above. Above is what's preferred now.
//            for( PizzaOrder p: tree )                                                               //for each loop to print the elements in the tree
//                System.out.println( p.getOrderNo() );                                               //print the results
            
            t--;                                                                                    //end of this test case
		}
	}
	
    /**
     * This class represents one pizza order by one customer and is comparable to other pizza orders by other customers.
     */
	private static class PizzaOrder implements Comparable< PizzaOrder > 
    {
        private final int orderNo;                                                                  //order number ( i - in challenge description )
        private final int ot;                                                                       //order time
        private final int ttc;                                                                      //time to complete

        /**
         * Constructor for a PizzaOrder
         * @param ot the time at which this order was placed
         * @param ttc the time to complete this order
         * @param orderNo the number of this order
         */
        PizzaOrder( int ot, int ttc, int orderNo )
        {
            this.ot = ot;
            this.ttc = ttc;
            this.orderNo = orderNo;
        }

        /**
         * Method to compare to PizzaOrders
         * @param order the other pizza order to compare to this pizza order
         * @return the difference in time between the two orders
         */
        @Override
        public int compareTo( PizzaOrder order )                                                    //compare this order to some other order
        {
            int diff = ( ot + ttc ) - ( order.ot + order.ttc );                                     //find the difference between the order time and time to complete for two orders
            return diff == 0 ? orderNo : diff;                                                      //if there is no difference return this order number, otherwise return the difference
        }

        /**
         * Method to get the number of this order
         * @return the number of this order
         */
        public int getOrderNo()        
        {
            return this.orderNo;
        }
    }
}