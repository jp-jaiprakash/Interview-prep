package algorithms.dynamicprogramming;

public class CoinChange {

   public int coinChange(int[] coins, int amount) {

      int coinsarr [] = new int[amount];

      coinsarr[0] = 0;

      for(int i=1; i<= amount; i++){
         coinsarr[i] = coinsarr[i-1] + 1;
         if(i>=2){
            coinsarr[i] = Math.min(coinsarr[i], coinsarr[i-2] +1);
         }

         if(i >= 5){
            coinsarr[i] = Math.min(coinsarr[i], coinsarr[i-5]+1);
         }
      }


      return coinsarr[amount];
   }

   public int change(int amount, int[] coins) {
      int[] dp = new int[amount + 1];
      dp[0] = 1;
      for (int coin : coins) {
         for (int i = coin; i <= amount; i++) {
            dp[i] += dp[i-coin];
         }
      }
      return dp[amount];
   }
}
