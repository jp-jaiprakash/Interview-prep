package lineardatastructure.arra;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IndicesWithEqualSum {
   public static void main(String[] args) {
      int [] arr =findValueToSum(100, new int[]{1,2,3,6,99});
      System.out.println(arr[0]);
      System.out.println(arr[1]);;
   }
   static int[] findValueToSum(int sum, int [] nums){
      List<Integer> lst = new ArrayList<>();
      for(int i: nums){
         lst.add(sum-i);
      }

      for(int i=0; i < lst.size(); i++){
         if(lst.contains(i)){
            return new int[]{i, lst.indexOf(i)};
         }
      }
      return new int[]{-1,-1};
   }
}
