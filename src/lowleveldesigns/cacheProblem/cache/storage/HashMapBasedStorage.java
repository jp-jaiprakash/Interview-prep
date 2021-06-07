package lowleveldesigns.cacheProblem.cache.storage;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @param <Key>
 * @param <Value>
 */
public class HashMapBasedStorage<Key, Value> implements Storage<Key, Value>{

   Map<Key, Value> map = new HashMap<>();

   @Override
   public void add(Key key , Value  value) {
map.put(key, value);
   }

   @Override
   public void remove(Key keyToRemove) {
map.remove(keyToRemove);
   }

   @Override
   public Value get(Key key) {
      return map.get(key);
   }
}
