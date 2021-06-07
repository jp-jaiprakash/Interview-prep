package algorithms.dynamicprogramming;

import java.util.List;

/**
 * Input: s = "leetcode", wordDict = ["leet","code"]
 * Output: true
 * Explanation: Return true because "leetcode" can be segmented as "leet code".
 */

public class WordBreak {

   public boolean wordBreak(String s, List<String> wordDict) {

      boolean [] dp = new boolean[s.length()+1];

      dp[0] = true;

      for(int i=1; i<= s.length(); i++){

         for(int j = 0; j< i; j++){
            if(dp[j] && wordDict.contains(s.substring(j,i))){
               dp[i] = true;
               break;
            }
         }
      }

      return dp[s.length()];
   }
}
