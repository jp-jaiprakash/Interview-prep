package algorithms.dynamicprogramming;

public class ClimbStairs {

   public int climbStairs(int n){
      // Each index will represent number of steps to reach it
      int [] memo = new int[n+1];

      memo[0] = 1;
      memo[1] = 1;

      return recurse(n, memo);

   }

   private int recurse(int n, int[] memo) {

      if(memo[n] > 0)
         return memo[n];

      int waysTocurrentStairs = recurse(n-1, memo) + recurse(n-2, memo);
      memo[n] = waysTocurrentStairs;
      return waysTocurrentStairs;
   }


   // iterative approach
   public int climbStairsIterative(int n){
      int [] dp = new int[n+1];
      dp[0] = 1;
      dp[1] = 1;

      for(int i=2; i<= n; i++){
         dp[i] = dp[i-1] + dp[i-2];
      }

      return dp[n];
   }
}
