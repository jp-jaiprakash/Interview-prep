package algorithms.graps.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSum {

   public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> result = new ArrayList<>();
      boolean[] visited = new boolean[candidates.length];


      Long cnt = Arrays.stream(candidates).filter(x-> x>target).count();

      if(cnt < candidates.length){
         dfs(candidates, result, new ArrayList<>(), target);
      }
      return result;
   }

   private void dfs(int[] candidates, List<List<Integer>> result, ArrayList<Integer> integers, int target) {
      int sum = integers.stream().mapToInt(Integer::intValue).sum();

      if( sum > target)
         return;

      if( sum == target){
         List<Integer> lst = new ArrayList<>(integers);
         Collections.sort(lst);
         if(!result.contains(lst))
            result.add(lst);
         return;
      }

      for(int i=0; i< candidates.length; i++){
            integers.add(candidates[i]);
            dfs(candidates,result,integers,target);
            integers.remove(integers.size()-1);
      }
   }

   public static void main(String[] args) {
      CombinationSum cs = new CombinationSum();
      List<List<Integer>> lst =cs.combinationSum(new int[]{2,3,5}, 7);
      System.out.println(lst);
   }
}
