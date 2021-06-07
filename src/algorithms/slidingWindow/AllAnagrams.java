package algorithms.slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class AllAnagrams {

   public List<Integer> findAnagrams(String s, String p){

      ArrayList<Integer> soln = new ArrayList<Integer>();

      if(s.length() ==0 || p.length() ==0 || s.length() < p.length())
         return soln;

      int [] chars = new int[26];
      for(Character c: p.toCharArray()){
         chars[c-'a']++;
      }

      int left =0, right =0, len = p.length();

      int diff = len;
      char temp;
      for(right =0; right < s.length(); right++){

         if(right -left >=len){
            temp = s.charAt(left);

            chars[temp-'a']++;

            if(chars[temp-'a'] > 0)
               diff++;

            left++;
         }

         temp = s.charAt(right);
         chars[temp-'a']--;

         if(chars[temp - 'a'] >=0)
            diff--;

         if(diff == 0)
            soln.add(left);

      }
return soln;
   }

   public static void main(String[] args) {
      AllAnagrams anagrams = new AllAnagrams();
      System.out.println(anagrams.findAnagrams("cbaebabacd", "abc"));
   }
}
