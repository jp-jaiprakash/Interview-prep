package onetwoweek.hashmap;

class Entry<K,V> {
   final K key;
   V value;

   Entry<K, V> next;

   public Entry(K key, V value, Entry<K,V> entry){
      this.next = entry;
      this.value = value;
      this.key = key;
   }
}

public class MyMap<K,V> {

   private Entry<K,V> [] buckets;

   private static final int capacity = 1<<4;
   private int size = 0;

   public MyMap(){
//      this.
   }
}
