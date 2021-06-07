package algorithms.graps.dfs;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

   public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();

      boolean [] visited = new boolean[nums.length+1];
      if(nums !=null && nums.length > 0){
         dfs(nums, result, new ArrayList<Integer>(), 0, visited);
      }

      for(int i: nums){

      }

      return result;
   }

   private void dfs(int[] nums, List<List<Integer>> result, ArrayList<Integer> integers, int index, boolean[] visited) {

      if(integers.size() == nums.length){
         result.add(new ArrayList<Integer>(integers));
         return;
      }

      for(int i=0; i< nums.length ; i++) {
         if (!visited[i + 1]) {
         integers.add(nums[i]);
         visited[i + 1] = true;
         dfs(nums, result, integers, index+1, visited);
         visited[i+1] = false;//undo your changes so that you can traverse other options
            integers.remove(integers.size()-1);
      }
      }
   }

   public static void main(String[] args) {
      Permutations p = new Permutations();
      List<List<Integer>> lst =p.permute(new int[]{1,2,3});
      System.out.println(lst);
   }



}
