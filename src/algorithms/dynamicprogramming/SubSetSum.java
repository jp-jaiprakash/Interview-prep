package algorithms.dynamicprogramming;

public class SubSetSum {

   public static void main(String[] args) {
      int set[] = { 3, 34, 4, 12, 5, 2 };
      int sum = 119;
      int n = set.length;
      if (isSubSet(set, n-1, sum) == true)
         System.out.println("Found a subset"
                 + " with given sum");
      else
         System.out.println("No subset with"
                 + " given sum");
   }

   static boolean isSubSet(int arr[], int n, int sum){
      // base condition
      if(sum < 0 || n < 0)
         return false;

      if(sum == 0)
         return true;

      if(arr[n] > sum)
         return isSubSet(arr, n-1, sum);

      return isSubSet(arr, n-1, sum) || isSubSet(arr, n-1, sum - arr[n]);
   }
}
