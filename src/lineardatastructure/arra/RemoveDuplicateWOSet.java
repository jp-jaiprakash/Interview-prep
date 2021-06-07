package lineardatastructure.arra;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateWOSet {
   public static void main(String[] args) {
      List<Integer> lst = new ArrayList<>();
      lst.add(10);
      lst.add(11);
      lst.add(10);
      lst.add(12);


//      System.out.println(lst);
//      Map<Integer, Integer> freq = new HashMap<>();
//      for(int i: lst)
//         freq.put(i, freq.getOrDefault(i,0)+1);
//
//      for(int i = lst.size()-1; i>=0; i--){
//         int temp = lst.get(i);
//         int freqCnt = freq.get(temp);
//         if(freqCnt > 1){
//            lst.remove(i);
//            freq.put(temp, freqCnt-1);
//         }
//      }
//      System.out.println(lst);
      System.out.println(reverseList(lst));
   }

   static List<Integer> reverseList(List<Integer> lst){
      int i = 0;
      int j = lst.size()-1;
      while(i < j){
         int temp = lst.get(i);
         lst.set(i, lst.get(j));
         lst.set(j, temp);
         i++;
         j--;

      }
      return lst;
   }
}
