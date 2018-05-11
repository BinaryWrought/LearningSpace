/*
 * This is free to use as it was only made for practice.
 */

package googlepractice;

import java.util.*;

/**
 * This is an implementation of a weighted graph.
 * The nodes can be any object, so can the weights.
 * Testing was done specifically with String nodes and Integer weights.
 * When printing the contents of the graph it calls the node's toString function so be sure that is
 * defined with a desirable format.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 * @param <E> this is the object of the nodes in the graph
 * @param <W> this is the object of the weights of the edges
 */
public class VersatileGraph<E, W> 
{
    private int initialCapacity = 16;    
    private float loadFactor = 0.75f;
    private final HashMap< E, HashMap< E, W > > nodes;
    
    /**
     * Default constructor uses default initial capacity and load factor
     */
    VersatileGraph()
    {
        nodes = new HashMap<>( initialCapacity, loadFactor );
    }
    
    /**
     * Constructor where the user supplies the initial capacity but load factor uses the default
     * @param ic the initial capacity of the graph
     */
    VersatileGraph( int ic )
    {
        initialCapacity = ic;
        nodes = new HashMap<>( ic, loadFactor );
    }
    
    /**
     * Constructor where the user specifies both the initial capacity and the load factor
     * @param ic the initial capacity of the graph
     * @param lf the load factor for the graph
     */
    VersatileGraph( int ic, float lf )
    {
        loadFactor = lf;
        initialCapacity = ic;
        nodes = new HashMap<>( ic, lf );
    }
    
    /**
     * Method to add edges between nodes.
     * TODO: allow for this to be undirected (currently it is only directed)
     * @param src the source node of the edge
     * @param dest the destination node of the edge
     * @param wt the weight for this edge
     */
    public void addEdge( E src, E dest, W wt )
    {
        if( !nodes.containsKey( src ) )
            nodes.put( src, new HashMap<>( initialCapacity, loadFactor ) );
        if( !nodes.containsKey( dest ) )
            nodes.put( dest, new HashMap<>( initialCapacity, loadFactor ) );

        nodes.get( src ).put(dest, wt);
    }

    /**
     * Method to add a new vertex (node) to the graph
     * @param node the node (vertex) being added.
     */
    public void addVertex( E node )
    {
        if( !nodes.containsKey( node ) )
            nodes.put( node, new HashMap<>( initialCapacity, loadFactor ) );
    }
    
    /**
     * Method to demonstrate breadth first search through the graph
     * @param start the node to start the traversal from
     */
    public void breadthFirstTraversal( E start )
    {
        //all vertices start as "not visited"
        HashSet<E> visited = new HashSet<>( size() );
        Queue<E> queue = new LinkedList<>();
        
        //Mark the current node as visited and queue it
        visited.add( start );
        queue.add( start );
        
        while( !queue.isEmpty() )
        {
            //dequeue a vertex and print it
            start = queue.poll();
            System.out.print( start.toString() + " " );
            
            //Get adjacent vertices of dequeued vertex
            //if adjacent has not been visited then mark it as visited
            List<E> n = neighbors( start );
            for( E i : n )
            {
                E next = i;
                if( !visited.contains( next ) )
                {
                    visited.add( next );
                    queue.add( next );
                }
            }
        }
    }
    
    /**
     * Method to get the total number of edges connected to the specified node
     * @param src the node for which degree is sought
     * @return the number of edges connected to the given node
     */
    public int degree( E src )
    {
        if( !nodes.containsKey( src ) )
            return 0;
        else return nodes.get( src ).size();
    }
    
    /**
     * Method to start a depth first traversal algorithm
     * @param start the at which to start the depth first traversal
     */
    public void depthFirstTraversal( E start )
    {
        HashSet<E> marked = new HashSet<>( size() );
        depthFirstPrint( start, marked );
    }
    
    /**
     * Method to test if an edge exists between the two nodes
     * @param src the source node to check from which there is an edge
     * @param dest the destination not to check if it is connected from the source
     * @return true if there is an edge from source to destination
     */
    public boolean isEdge( E src, E dest )
    {
        if( !nodes.containsKey( src ) )
            return false;
        else return nodes.get( src ).containsKey( dest );
    }
    
    /**
     * Method to get a list of all the edges connected to the specified node
     * @param vertex
     * @return 
     */
    public List<E> neighbors( E vertex )
    {
        if( !nodes.containsKey( vertex ) )
            return new ArrayList<>(0);
        else return new ArrayList<>( nodes.get( vertex ).keySet() );
        
    }

    /**
     * Method to print each node on its own line with its edges, and their weights
     * TODO: get a string instead
     */
    public void printGraph()
    {
        for( Map.Entry< E, HashMap< E, W > > m : nodes.entrySet() )
        {
            System.out.print( m.getKey() + ": " );
            for( Map.Entry< E, W > n : m.getValue().entrySet() )
            {
                System.out.print( n.getKey() + "(" + n.getValue() + ") " );
            }
                //below is functionally the same as the above for loop
//            m.getValue().entrySet().forEach( ( n ) ->
//            {
//                System.out.print( n.getKey() + "(" + n.getValue() + ") " );
//            } );

            System.out.println();
        }
    }
    
    /**
     * Method to remove a connecting edge from the source specified to the specified destination
     * @param src the node from which the edge is to be removed
     * @param dest the node to which the edge is to be removed
     */
    public void removeEdge( E src, E dest )
    {
        nodes.get( src ).remove( dest );
    }
    
    /**
     * Method to remove an entire node from the graph.
     * @param src the node to be removed
     */
    public void removeNode( E src )
    {
        nodes.remove( src );
    }
    
    /**
     * Method to get the total number of nodes currently in the graph.
     * @return the number of nodes in the graph
     */
    public int size()
    {
        return nodes.size();
    }
    
    /**
     * Method to print the contents of the graph using a recursive depth first algorithm.
     * @param v the node being visited on this recursive call
     * @param marked a set of nodes that has already been visited
     */
    private void depthFirstPrint( E v, HashSet<E> marked )
    {
        List<E> connections = neighbors( v );
        marked.add( v );
        System.out.print( v.toString() + " " );
        
        //Traverse all the neighbors looking for unmarked vertices
        for( E next: connections )
        {
            if( !marked.contains( next ) )
                depthFirstPrint( next, marked );
        }
    }    
}
