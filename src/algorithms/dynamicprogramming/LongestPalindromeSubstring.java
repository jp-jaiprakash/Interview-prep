package algorithms.dynamicprogramming;

public class LongestPalindromeSubstring {

   public String longestPalindrome(String s) {


      int l = s.length();
      boolean [][] table = new boolean[l][l];

      int max_length = 1, start = l -1;
      for(int i=0; i< l;i++){
         table[i][i] = true;
      }

      for(int i=0; i< l-1; i++){
         if(s.charAt(i)== s.charAt(i+1)){
            table[i][i+1] = true;

            if(max_length==1){
               max_length = 2;
               start = i;
            }
         }
      }

      for(int width = 3; width <=l; width++){
         for(int i=0; i<= l- width; i++){
            int j = i + width - 1;
            if(table[i+1][j-1] && s.charAt(i) == s.charAt(j)){
               table[i][j] = true;

               if(width > max_length){
                  max_length = width;
                  start = i;
               }
            }
         }
      }



      return s.substring(start, start+max_length);
   }

   public static void main(String[] args) {
      LongestPalindromeSubstring longestPalindromeSubstring = new LongestPalindromeSubstring();
      longestPalindromeSubstring.longestPalindrome("ababa");
   }
}
