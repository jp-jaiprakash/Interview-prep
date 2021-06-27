package recursion;

import java.util.ArrayList;
import java.util.List;

public class Josephus {
   public static void main(String[] args) {
      List<Integer> lst = new ArrayList<>();
      for(int i=1; i< 8; i++){
         lst.add(i);
      }
      solve(lst, 3, 0);
      System.out.println(lst.get(0)); // we should pass k-1
   }

   static void solve(List<Integer> lst, int k, int idx){
      //Base
      if(lst.size() ==1){
//         ans = lst.get(0);
return;
      }

      //Hypothesis
      int idxToBeRemoved = (idx+ k) % lst.size();
      lst.remove(idxToBeRemoved);

      // Induction
      solve(lst, k, idxToBeRemoved);

   }
}
