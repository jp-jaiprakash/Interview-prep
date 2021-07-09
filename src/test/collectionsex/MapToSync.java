package test.collectionsex;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapToSync {

   static Map<String, Integer> primitiveSyncMap(Map<String, Integer> map){
      return Collections.synchronizedMap(map);
   }

   public static void main(String[] args) {
      Map<String, Integer> map = new HashMap<>();

      map.put("a", 1);
      map.put("b", 2);
      map.put("c", 3);
      map.put("d", 4);

      System.out.println(primitiveSyncMap(map));
   }
}
