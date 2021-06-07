package algorithms.graps.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllPathsSourceTarget {

   public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
//      Map<Integer, List<Integer>> adjacencyMatrix = new HashMap<>();

      List<List<Integer>> adjacencyMatrix = new ArrayList<>();

      for(int i=0; i< graph.length; i++){
         List<Integer> lst = new ArrayList<>();

         for(int j=0; j< graph[i].length; j++){
            lst.add(graph[i][j]);
         }

         adjacencyMatrix.add(lst);
      }

      List<List<Integer>> result = new ArrayList<>();
      dfs(0, result, new ArrayList<Integer>(), graph, adjacencyMatrix);
      return result;
   }

   private void dfs(int startingPoint, List<List<Integer>> result, ArrayList<Integer> integers, int[][] graph, List<List<Integer>> adjacencyMatrix) {

      if(startingPoint == graph.length-1)
      {
         integers.add(graph.length-1);
         result.add(new ArrayList<>(integers));
         return;
      }
      integers.add(startingPoint);
      List<Integer> adjacentPoints = adjacencyMatrix.get(startingPoint);
      if(adjacentPoints.size() < 1)
         return ;


      for(int i: adjacentPoints){
         dfs(i,result,integers,graph, adjacencyMatrix);
         integers.remove(integers.size()-1);
      }

   }

   public static void main(String[] args) {
      AllPathsSourceTarget target = new AllPathsSourceTarget();
      System.out.println(target.allPathsSourceTarget(new int[][]{{1,2},{3},{3},{}}));
   }
}
