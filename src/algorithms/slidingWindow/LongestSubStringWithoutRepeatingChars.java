package algorithms.slidingWindow;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingChars {

   public int lengthOfLongestSubstring(String s){
      if(s==null && s.length()==0)
         return 0;

      int max =1;
      HashSet<Character> set = new HashSet<>();
      int left=0, right=0, runningMax =0;

      for(right =0; right < s.length(); right++){
         char c = s.charAt(right);
         while (set.contains(c)){
            set.remove(s.charAt(left++));


            set.add(c);
            max = Math.max(right -left +1, max);
         }
      }

      return max;
   }
}
