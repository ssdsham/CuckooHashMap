/*
 * Sham Dorairaj
 * Fall 2013 - Data Structures and Algorithms
 */
 
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class CuckooHashMap<K, V> implements Map<K, V>
{
	// insert instance variables
	// insert constants (if any)
	
    public CuckooHashMap(int numBuckets)
    {
		// insert your code here
    }
    
    public void clear()
    {
		// insert your code here
    }
    
    public boolean isEmpty()
    {
		// replace with your code
        return false;
    }

    public int size()
    {
		// replace with your code
        return 0;
    }
    
    public V get(Object key)
    {
		// replace with your code
        return null;
    }
    
    public MapEntry getEntry(int index)
    {
		// replace with your code
        return null;
    }

    public boolean containsKey(Object key)
    {
		// replace with your code
        return false;
    }

    public boolean containsValue(Object value)
    {
		// replace with your code
        return false;
    }

    public V put(K key, V value)
    {
		// replace with your code
        return null;
    }
    
    public V remove(Object key)
    {
		// replace with your code
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> map)
    {
		// insert your code here
    }

    public Set<java.util.Map.Entry<K, V>> entrySet()
    {
        // Do not change code in this method
		// No implementation required here
    	throw new UnsupportedOperationException();
    }

    public Set<K> keySet()
    {
		// Do not change code in this method
		// No implementation required here
    	throw new UnsupportedOperationException();
    }

    public Collection<V> values()
    {
        // Do not change code in this method
		// No implementation required here
    	throw new UnsupportedOperationException();
    }
    
    public class MapEntry implements Entry<K, V>
    {
        private K key;
        private V value;
 
        /**
         * Creates a MapEntry.
         * 
         * @param akey the key
         * @param avalue the value
         */
        public MapEntry(K akey, V avalue)
        {
			value = avalue;
                        key = akey;
        }

        /**
         * Returns the key for this entry.
         * 
         * @see java.util.Map$Entry#getKey()
         * @return the key for this entry
         */
        public K getKey()
        {
			// replace with your code
            return null;
        }

        /**
         * Returns the value for this entry.
         * 
         * @return the value for this entry
         */
        public V getValue()
        {
			// replace with your code
            return null;
        }

        /**
         * Sets the value for this entry.
         * 
         * @param newVal
         * @return the previous value for this entry
         */
        public V setValue(V newValue)
        {
			// replace with your code
            return null;
        }
    }
}
