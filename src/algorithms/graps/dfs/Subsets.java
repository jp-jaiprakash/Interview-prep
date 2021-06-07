package algorithms.graps.dfs;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

   public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();
      List<Integer> lst = new ArrayList<>();
      result.add(new ArrayList<>());

      if(nums.length ==1){
            lst.add(nums[0]);
            result.add(lst);
         return result;
      }

      boolean [] visited = new boolean[nums.length];
       dfs(result, nums, lst, visited,0);
//      Arrays.stream(nums).forEach(x->Integer.parseInt(x));
//       result.add(new ArrayList<Integer>(Arrays.<Integer>asList(nums)));
      return result;
   }

   private void dfs(List<List<Integer>> result, int[] nums, List<Integer> lst, boolean[] visited, int index) {
      if(lst.size() >= nums.length)
         return;
      if(lst.size() == nums.length-1){
         result.add(new ArrayList<>(lst));
      }

      for(int i=0; i< nums.length; i++){
         if(!visited[i]){
            lst.add(nums[i]);
            visited[i]=true;
            dfs(result, nums, lst, visited,index+1);
            visited[i] = false;
            lst.remove(lst.size()-1);
         }
      }
   }

   public static void main(String[] args) {
Subsets subsets = new Subsets();
      List<List<Integer>> result=subsets.subsets(new int[]{1,2,3});
      System.out.println(result);
   }
}
