package random;

import java.util.Arrays;

public class RemoveDuplicates {

   public static void main(String[] args) {
      int [] arr = {1,2,2,2,3,3,3};
//      Arrays.stream(uniqueArray(arr)).forEach(System.out::println);
      int n = uniqueArray(arr);

      for (int i=0; i<n; i++)
         System.out.print(arr[i]+" ");
   }

   static int uniqueArray(int [] arr){
      int n = arr.length;
      if(arr.length < 2)
         return n;
      int j=0;
      for(int i=0; i< arr.length-1;i++){
         if(arr[i] != arr[i+1]){
            arr[j++] = arr[i];

         }
      }
      arr[j++] = arr[n-1];
      return j;
   }
}
