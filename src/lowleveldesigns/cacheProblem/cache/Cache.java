package lowleveldesigns.cacheProblem.cache;

import lowleveldesigns.cacheProblem.algorithms.InvalidElementException;
import lowleveldesigns.cacheProblem.cache.exceptions.NotFoundException;
import lowleveldesigns.cacheProblem.cache.exceptions.StorageFullException;
import lowleveldesigns.cacheProblem.cache.policies.EvictionPolicy;
import lowleveldesigns.cacheProblem.cache.storage.Storage;

public class Cache<Key, Value> {

   private final EvictionPolicy<Key> evictionPolicy;
   private final Storage<Key, Value> storage;

   public Cache(EvictionPolicy<Key> evictionPolicy, Storage<Key, Value> storage) {
      this.evictionPolicy = evictionPolicy;
      this.storage = storage;
   }

   public void put(Key key, Value value){
      try{
         this.storage.add(key, value);
         this.evictionPolicy.keyAccessed(key);
      } catch (StorageFullException | InvalidElementException exception){
         System.out.println("Got storage full. will try to evict");

         Key keyToRemove = evictionPolicy.evictKey();
         if(keyToRemove == null)
            throw new RuntimeException("Unexpected STatate");

         this.storage.remove(keyToRemove);
         put(key, value);
      }
   }

   public Value get(Key key){
      try{
         Value value = this.storage.get(key);
         this.evictionPolicy.keyAccessed(key);
         return value;
      }catch (NotFoundException | InvalidElementException ex){
         System.out.println("TRied accessing non existing key");
         return null;
      }
   }
}
