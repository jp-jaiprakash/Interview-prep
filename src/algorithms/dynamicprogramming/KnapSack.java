package algorithms.dynamicprogramming;

import java.util.Arrays;

public class KnapSack {

   public static int knapSackRecursive(int [] weights, int [] profit, int weight, int n){

      if(weight ==0 || n ==-1)
         return 0;

      if(weights[n] > weight)
         return knapSackRecursive(weights,profit, weight, n-1);
      else
         return Math.max(knapSackRecursive(weights,profit, weight, n-1),
              profit[n] + knapSackRecursive(weights,profit, weight-weights[n], n-1)
              );
   }

   static int max(int a, int b)
   {
      return (a > b) ? a : b;
   }

   // Returns the maximum value that
   // can be put in a knapsack of
   // capacity W
   static int knapSack(int W, int wt[], int val[], int n)
   {
      // Base Case
      if (n == 0 || W == 0)
         return 0;

      // If weight of the nth item is
      // more than Knapsack capacity W,
      // then this item cannot be included
      // in the optimal solution
      if (wt[n - 1] > W)
         return knapSack(W, wt, val, n - 1);

         // Return the maximum of two cases:
         // (1) nth item included
         // (2) not included
      else
         return max(val[n - 1]
                         + knapSack(W - wt[n - 1], wt,
                 val, n - 1),
                 knapSack(W, wt, val, n - 1));
   }
   public static void main(String[] args) {
      int profit[] = new int[] { 160, 100, 120 };
      int wt[] = new int[] { 10, 20, 60 };
      int W = 50;
      int n = profit.length;
      System.out.println(knapSackRecursive(wt, profit,W, n-1));
//      System.out.println(knapSack(W, wt, val, n));

      int [][] memo = new int[profit.length+1][W+1];

      for(int i =0; i< memo.length;i++)
         Arrays.fill(memo[i], -1);

      System.out.println(knapSackRecursiveMemo(wt, profit, W, n, memo));

   }

   public static int knapSackRecursiveMemo(int [] weights, int [] profit, int weight, int n, int [][] dp){

      int result = 0;
      if(weight ==0 || n ==0)
         return 0;

      if(dp[n][weight] != 0) {


         if (weights[n-1] > weight)
            result =  knapSackRecursive(weights, profit, weight, n - 1);
         else
            result =  Math.max(knapSackRecursive(weights, profit, weight, n - 1),
                    profit[n-1] + knapSackRecursive(weights, profit, weight - weights[n-1], n - 1)
            );
      }
      dp[n][weight] = result;

      return dp[n][weight];
   }

}
