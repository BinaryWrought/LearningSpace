/*
 * This is free to use as it was only made for practice.
 */

/**
 * This class is an implementation of a basic HashTable. 
 * It is not as robust as the standard util's hash table as it will not grow automatically
 * and the hashing function is not "perfect."
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class MyHashTable 
{
    private Object[] data;
    private boolean[] hasBeenUsed;    
    private Object[] keys;
    
    private int size = 0;
    
    /*
     * Default constructor for hash table.
     * size defaults to 0 as there are now objects in the table
     */
    public MyHashTable( int capacity ) throws IllegalArgumentException
    {
        if( capacity <= 0 )
            throw new IllegalArgumentException( "Must specify table capacity." );
        
        size = 0;
        keys = new Object[capacity];
        data = new Object[capacity];
        hasBeenUsed = new boolean[capacity];
    }
    
    /**
     * This method checks if the table already contains the key specified
     * @param key the key to be found
     * @return true if the table contains the key already, false if not
     * @throws NullPointerException 
     */
    public boolean containsKey( Object key ) throws NullPointerException
    {
        if( key == null )
            throw new NullPointerException( "Key cannot be null." );
        
        return findIndex( key ) != -1;
    }
    
    /**
     * This method gets the data found using the key
     * @param key the key used to get the data
     * @return the data found using the key
     * @throws NullPointerException 
     */
    public Object get( Object key ) throws NullPointerException
    {
        if( key == null )
            throw new NullPointerException( "Key cannot be null." );
        
        int index = findIndex( key );
        if( index == -1 )
            return null;
        else       
            return data[ index ];
    }
    
    /**
     * This method gives the number of elements currently stored in the table
     * @return the number of elements in the table
     */
    public int getSize()
    {
        return size;
    }
    
    /**
     * Put a new element in the table with the specified key.
     * If the key is already present in the table, its value is replaced and the old one returned.
     * Otherwise the new key and value are added and null is returned.
     * @param key the key to be used to retrieve the data
     * @param value the data to be stored with the key
     * @return null if new key added to table, replaced data if key being reused
     * @throws IllegalStateException
     * @throws NullPointerException 
     */
    public Object put( Object key, Object value ) throws IllegalStateException, NullPointerException
    {
        if( key == null || value == null )
            throw new NullPointerException( "Parameters cannot be null." );
        if( size == data.length )
            throw new IllegalStateException( "Container is full." );   
        
        int index = findIndex( key );
        
        if( index != -1 )
        {
            //key is already in table
            Object result = data[ index ];
            data[ index ] = value;
            return result;
        }
        else if( size < data.length )
        {
            //there is room to add a new element
            index = hash( key );
            while( keys[ index ] != null )
                index = nextIndex( index );
            keys[ index ] = key;
            data[ index ] = value;
            hasBeenUsed[ index ] = true;
            size++;
            return null;
        }
        else
        {
            throw new IllegalStateException( "Table is full." );
        }       
    }
    
    /**
     * This method removes a key and its associated data from the table
     * @param key the key used to retrieve the data
     * @return null if the key was not being used by the table, or the data that was removed if the key was in use
     * @throws NullPointerException 
     */
    public Object remove( Object key ) throws NullPointerException
    {
        if( key == null )
            throw new NullPointerException( "Key cannot be null." );
        
        int index = findIndex( key );
        Object result = null;
        
        if( index != -1 )
        {
            result = data[ index ];
            data[ index ] = null;
            keys[ index ] = null;
            size--;
        }
        
        return result;
    }
    
    /**
     * Find the index for the specified key.
     * If the key does not exist, return -1
     * @param key the key for which an index is sought
     * @return the index for the key or -1 if the key was not found in the table
     */
    private int findIndex( Object key ) throws NullPointerException
    {
        if( key == null )
            throw new NullPointerException( "Key cannot be null." );
        
        int count = 0;
        int index = hash( key );
        while( count < data.length && hasBeenUsed[index])
        {
            if( key.equals( keys[index]))
                return index;
            index = nextIndex( index );
            count++;
        }
        return -1;
    }
    /**
     * Compute a valid index of the table's arrays.
     * The index is calculated as the remainder when the absolute value of the key's hash code is divided by the size of the table's arrays
     * @param key
     * @return
     */
    private int hash( Object key )
    {
        return Math.abs( key.hashCode() ) % data.length;
    }
    
    /**
     * Get the next available index with wrap around
     * @param index the index preceding the next index
     * @return the next index after the argument index
     */
    private int nextIndex( int index )
    {
        if( index + 1 == data.length )
            return 0;
        else
            return index + 1;
    }
    
}
