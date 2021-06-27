package recursion;

import java.util.Arrays;

public class SortUsingRecursion {
   public static void main(String[] args) {
   int [] arr = new int[]{2,0,1,9,5};
   int []arr2 = sort(arr, arr.length-1);
//      System.out.println(arr);
      Arrays.stream(arr2).forEach(System.out::println);
   }

   static int[] sort(int [] arr, int n){
      if(n ==0)
         return arr;

      sort(arr, n-1);
      int val = arr[n];
      int i =n-1;
      while (i>=0 && arr[i] > val){
         int temp = arr[i];
         arr[i] = arr[i+1];
         arr[i+1] = temp;
         i--;
      }

      arr[i+1] = val;
      return arr;
   }
}
