package onetwoweek.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * find all triplets whose sum equals 0
 *
 * worst case n^3
 */
public class ThreeSum {
   public static void main(String[] args) {
      System.out.println(getTriplets(new int []{-1,0,1,2,-1,4}));
   }

   static List<List<Integer>> getTriplets(int [] arr){
      if(arr.length < 3)
         return new ArrayList<>();

      List<List<Integer>> result= new ArrayList<>();
      int n = arr.length;
      List<Integer> lst = Arrays.stream(arr).boxed().collect(Collectors.toList());
      Collections.sort(lst);

      // n-2:: as we are going to use last two elements
      for(int i =0; i< n -2 ; i++){
         // as array is already sorted, so if repeated elements then we dont want to return same triplet
         if( i== 0 || lst.get(i) != lst.get(i-1)){
         // now define two pointers
            int j=i+1, k=n-1;
            // if sum is more then decrement right pointer
            while (j < k){
               int sum = lst.get(i) + lst.get(j) + lst.get(k);
               if(sum == 0){
                  // push
                  List<Integer> triplet = new ArrayList<>();

                  triplet.add(lst.get(i));
                  triplet.add(lst.get(j));
                  triplet.add(lst.get(k));
                  result.add(triplet);
                  // if we have same next elements then that element will also have same triplet so avoid it
                  while(j < k && lst.get(j+1) == lst.get(j)){
                     j++;
                  }
                  while(j < k && lst.get(k-1) == lst.get(k)){
                     k--;
                  }
                  j++;
                  k--;
               } else if(sum > 0)
                  k--;
               else
                  j++;
            }
         }
      }
      return result;
   }
}
