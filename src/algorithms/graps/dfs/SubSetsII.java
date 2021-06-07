package algorithms.graps.dfs;

import java.util.ArrayList;
import java.util.List;

public class SubSetsII {

   public static void main(String[] args) {
      findSubSets(new int[]{1,2,3,4});
   }

   static void findSubSets(int [] arr){
      List<List<Integer>> result = new ArrayList<>();
      boolean [] visited = new boolean[arr.length];
      for(int i=0; i< arr.length; i++){
         if(!visited[i]){
            subsetDFSAlgo(arr, result, new ArrayList<Integer>(), i, visited);

         }
      }
      System.out.println(result);

   }

   private static void subsetDFSAlgo(int[] arr, List<List<Integer>> result, List<Integer> answer, int i, boolean[] visited) {

      if (i == arr.length || visited[i])
         return;

      answer.add(arr[i]);
      if(!visited[i]){
         visited[i] = true;
         List<Integer> temp = new ArrayList(answer);
         if(!result.contains(temp)){
            result.add(temp);
         }


         subsetDFSAlgo(arr, result, answer, i + 1, visited);
         answer.remove(answer.size() - 1);
         subsetDFSAlgo(arr, result, answer, i + 1, visited);


      }

      visited[i] = false;

   }
}
