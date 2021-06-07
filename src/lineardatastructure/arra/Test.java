package lineardatastructure.arra;

import java.util.ArrayList;
import java.util.List;

public class Test {
   public static List<List<Integer>> generate(int numRows) {
      List<Integer> nums = new ArrayList<Integer>();
      nums.add(1);

      List<List<Integer>> answer = new ArrayList<List<Integer>>();
      int i=1;
      List<Integer> ans = new ArrayList<Integer>();
      ans.add(1);
      answer.add(ans);
      while(i < numRows){
         ans = new ArrayList<Integer>();
         ans.add(1);
         for(int j=1 ; j < nums.size();j++){
            ans.add(nums.get(j) + nums.get(j-1));
         }
         ans.add(1);
         answer.add(ans);
         nums.clear();
         nums.addAll(ans);


         i++;
      }
      return answer;
   }

   public static void main(String[] args) {
      generate(5);
   }
}
