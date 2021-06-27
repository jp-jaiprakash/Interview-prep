//package algorithms.dynamicprogramming;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * https://leetcode.com/problems/accounts-merge/
// */
//public class AccountsMerge {
//   public List<List<String>> accountsMerge(List<List<String>> accounts) {
//      List<List<String>> common = new ArrayList<>();
//      List<String> names = new ArrayList<>();
//
//      Map<String, Integer> map = new HashMap<>();
//
//      for(int i =0; i< accounts.size(); i++){
//         List<String> lst = accounts.get(i);
//         List<String> mailids =  lst.subList(1, lst.size());
//         for(String str: mailids){
//            if(map.containsKey(str)){
//               map.put(str, map.get(str));
//            }
//         }
//      }
//
//      for(List<String> lst: accounts){
//         if( !names.contains(lst.get(0))){
//            // means it is a duplicate
//            List<String> mailids =  lst.subList(1, lst.size());
//            List<String> temp = new ArrayList<>();
//            temp.add(lst.get(0));
//            Collections.sort(mailids);
//            temp.addAll(mailids);
//         }else{
//            // create a map to
//         }
//      }
//   }
//}
