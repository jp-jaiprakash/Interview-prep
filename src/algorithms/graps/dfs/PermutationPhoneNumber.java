package algorithms.graps.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class PermutationPhoneNumber {

   public List letterCombinations1(String digits){

      ArrayList<String> result = new ArrayList<>();
      if(digits != null && digits.length() > 0){
         String map[] = {"", "", "abc","def","ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
         dfs(digits, map, result, new StringBuilder(), 0);
      }

      return result;
   }

   private void dfs(String digits, String[] map, ArrayList<String> result, StringBuilder sb, int index) {

      // when we have reached the end of phone number, we should have valid letter combination
      if(index == digits.length()){
         result.add(sb.toString());
         return;
      }

      int digit = Character.getNumericValue(digits.charAt(index));
      String letters = map[digit];

      // try adding each letter to string we have built so far
      for(int i=0; i < letters.length(); i++){
         char ch = letters.charAt(i);
         sb.append(ch);
         dfs(digits,map, result, sb, index+1);
         sb.deleteCharAt(sb.length()-1); // make sure that we try the other options properly
         /**
          * if you dont delte it then
          */
      }
   }


   public static List<String> letterCombinations(String digits) {

      Map<String, String> map = new HashMap<>();

      map.put("1","");
      map.put("2","abc");
      map.put("3","def");
      map.put("4","ghi");
      map.put("5","jkl");
      map.put("6","mno");
      map.put("7","pqrs");
      map.put("8","tuv");
      map.put("9","xyz");

      Stack<String> stack = new Stack<>();
      String[] possible = digits.split("");

      List<List<String>> adjacency= new ArrayList<>();
      for(int i=0; i< possible.length-1; i++){
         List<String> lst = new ArrayList<>();
         lst.add(possible[i+1]);
         adjacency.add(Integer.parseInt(possible[i]), lst);
      }

      stack.push(possible[0]);
StringBuilder sb = new StringBuilder();
      while (!stack.isEmpty()){
         String s = map.get(stack.pop());
         String str[] = s.split("");
         boolean visited [] = new boolean[str.length];

         List<String> ls = adjacency.get(Integer.parseInt(s));
         for(String st: str){
            sb.append(st);
            for(int k = possible.length-1; k>=1; k--){
               stack.push(possible[k]);
            }


         }

      }

      return null;
   }

   public static void main(String[] args) {
      letterCombinations("234");
   }
}
