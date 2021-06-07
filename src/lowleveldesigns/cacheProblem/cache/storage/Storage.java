package lowleveldesigns.cacheProblem.cache.storage;

import lowleveldesigns.cacheProblem.cache.exceptions.NotFoundException;
import lowleveldesigns.cacheProblem.cache.exceptions.StorageFullException;

/**
 * This intyerface makes sure that tomorrow if we want to have different kind of storage then we can use it
 * @param <Key>
 * @param <Value>
 */
public interface Storage<Key, Value> {
   
   void add(Key key, Value value) throws StorageFullException;

   void remove(Key keyToRemove) throws NotFoundException;

   Value get(Key key) throws NotFoundException;
}
