package algorithms.graps.dfs;

/**
 * return count of subset whose sum is equal to k
 */
public class CountSubSetSum {
   public static void main(String[] args) {
      System.out.println(getCount(new int[]{2,3,5,8,10}, 10));
   }

   static int getCount(int [] arr, int sum){
      //
      int[][] dp = new int[arr.length+1][sum+1];

      for(int i=0; i< arr.length+1; i++)
         dp[i][0] = 1;

      for(int i=1; i< dp.length; i++){
         for (int j=1; j< dp[i].length; j++){
            if(j >= arr[i-1]){
               dp[i][j] = dp[i-1][j] + dp[i-1][j- arr[i-1]];
            }
            else
               dp[i][j] = dp[i-1][j];
         }
      }
      return dp[arr.length][sum];
   }
}
