package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {
        List<Object> lst = new ArrayList<>();

        Object [] obj = {5,6};
        lst.add(obj);
        lst.add(7);
        for(Object o: lst){
            if(o instanceof Object []){
                for(Object j: (Object[]) o){
                    System.out.println(j);
                }
            }
            else {
                System.out.println(o);
            }
        }
    }
    public List<String> wordBreak(String s, List<String> wordDict) {


        Set<String> wordDictionary = wordDict.stream().collect(Collectors.toSet());
        return DFS(s, wordDictionary, new HashMap<String, LinkedList<String>>());
    }
   public List<String> wordBreak(String s, Set<String> wordDict) {
      return DFS(s, wordDict, new HashMap<String, LinkedList<String>>());
   }

   // DFS function returns an array including all substrings derived from s.
   List<String> DFS(String s, Set<String> wordDict, HashMap<String, LinkedList<String>> map) {
      if (map.containsKey(s))
         return map.get(s);

      LinkedList<String> res = new LinkedList<String>();
      if (s.length() == 0) {
         res.add("");
         return res;
      }
      for (String word : wordDict) {
         if (s.startsWith(word)) {
            List<String> sublist = DFS(s.substring(word.length()), wordDict, map);
            for (String sub : sublist)
               res.add(word + (sub.isEmpty() ? "" : " ") + sub);
         }
      }
      map.put(s, res);
      return res;
   }
}