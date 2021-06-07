package algorithms.dynamicprogramming;

import java.util.Arrays;

public class EqualSubset {


   public static void main(String[] args) {
      EqualSubset equalSubset = new EqualSubset();
      System.out.println(equalSubset.canPartition(new int[]{1,5,11,5}));
   }

   public boolean canPartition(int[] nums) {
      int sum = 0;

      for (int num : nums) {
         sum += num;
      }

      if ((sum & 1) == 1) {
         return false;
      }
      sum /= 2;

      int n = nums.length;
      boolean[] dp = new boolean[sum+1];
      Arrays.fill(dp, false);
      dp[0] = true;

      for (int num : nums) {
         for (int i = sum; i > 0; i--) {
            if (i >= num) {
               dp[i] = dp[i] || dp[i-num];
            }
         }

         for (boolean b: dp)
            System.out.print(b+ " ");
         System.out.println(dp.toString());
      }

      return dp[sum];
   }
}
