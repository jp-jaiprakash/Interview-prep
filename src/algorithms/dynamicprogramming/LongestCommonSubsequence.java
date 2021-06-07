package algorithms.dynamicprogramming;

public class LongestCommonSubsequence {

   public int longestCommonSubsequence(String text1, String text2) {

//      int i = text1.length() -1;
//      int j = text2.length() -1;

      int n = text1.length();
      int m = text2.length();

      int [][] dp = new int[n+1][m+1];


      for(int i=1; i< n+1;i++){
         for(int j=1; j< m+1; j++){
            if(text1.charAt(i-1) == text2.charAt(j-1)){

               dp[i][j] =  1 + dp[i-1][j-1];
            }else{
               dp[i][j] = Math.max(

                       dp[i-1][j], dp[i][j-1]
               );
            }
         }
      }

      return dp[n][m];
//      int max =0;
//      while(i>=0 && j>=0){
//         if(text1.charAt(i) == text2.charAt(j)){
//
//            max =  1 + longestCommonSubsequence( text1.substring(0,i-1),  text2.substring(0,j-1));
//         }else{
//            max = Math.max(
//
//                    longestCommonSubsequence(text1.substring(0,i),  text2.substring(0,j-1)),
//                    longestCommonSubsequence(text1.substring(0,i-1),  text2.substring(0,j))
//            );
//         }
//
//         i--;
//         j--;
//      }
//
//      return max;

   }

}