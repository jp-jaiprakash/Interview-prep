package algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 * find maximum sum in subarray of size 3
 */
public class SlidingWindow {

   public static void main(String[] args) {
      int arr[] = {1,2,3,1,2,9,67,45,2,1};
      Map<String, String> map = new HashMap<>();

      Set<String> set = new HashSet<>();
      map.put(null,"jai");
      map.put(null,"disha");

      System.out.println(map.get(null));
   }

   public static int maxSum(int [] arr, int k){
      Queue queue = new PriorityQueue();
      int sum = 0;
      int ans = sum;
      return 0;
   }
}
