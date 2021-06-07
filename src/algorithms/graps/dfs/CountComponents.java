package algorithms.graps.dfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class CountComponents {

   public int countComponents(int n, int[][] edges){
      HashMap<Integer, List<Integer>> adj = new HashMap();
      for(int i=0; i< n; i++){
         adj.put(i, new LinkedList<Integer>());
      }

      // populate the adjacency matrix
      for(int i=0; i<= edges.length; i++){
         adj.get(edges[i][0]).add(edges[i][1]);
         adj.get(edges[i][1]).add(edges[i][0]);
      }

      boolean [] visited = new boolean[n];

      int cnt =0;
      for(int i=0; i< n; i++){
         if(visited[i] == false){
            cnt++;
            dfs(adj, i, visited);
         }
      }
      return cnt;
   }

   private void dfs(HashMap<Integer, List<Integer>> adj, int i, boolean[] visited) {

      visited[i] = true;
      for(Integer j: adj.get(i)){
         if(visited[j]==false)
            dfs(adj, j, visited);
      }

   }
}
