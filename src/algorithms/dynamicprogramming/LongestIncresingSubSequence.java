package algorithms.dynamicprogramming;

public class LongestIncresingSubSequence {

   public int lengthOfLIS(int[] nums) {

      int [] dp = new int[nums.length];

      dp[0] = 1;
      int maxans = 1;
      for(int i=1; i< dp.length; i++ ){
         int maxval =0;
         for (int j=0; j< i; j++){
            if(nums[j] < nums[i]){
               maxval = Math.max(dp[j],maxval );
            }
         }

         dp[i] = maxval + 1;
         maxans = Math.max(maxans, dp[i]);
      }
return maxans;
   }

}
