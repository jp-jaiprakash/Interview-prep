package lowleveldesigns.cacheProblem.cache.policies;

import lowleveldesigns.cacheProblem.algorithms.InvalidElementException;

public interface EvictionPolicy<Key> {
   Key evictKey();

   void keyAccessed(Key key) throws InvalidElementException;
}
