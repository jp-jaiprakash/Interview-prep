package algorithms.graps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class PossibleBiPartiion {



   public static void main(String[] args) {
      int [][] input = new int[][]{{1,2},{1,3},{2,3}};
      System.out.println(possibleBipartition(4, input));
   }

   public static boolean possibleBipartition(int n, int[][] dislikes) {

      int[] colors = new int[n+1];
      boolean[] visited = new boolean[n+1];
      List<List<Integer>>  adjLst = new ArrayList<>();
      for(int i =0; i<= n; i++){
         adjLst.add(new ArrayList<>());
      }

      for(int i=0; i<dislikes.length; i++){
         int src = dislikes[i][0];
         int dest = dislikes[i][1];
         adjLst.get(src).add(dest);
         adjLst.get(dest).add(src);

      }

      for(int i=1; i<=n; i++){
         if(colors[i] == 0){
            colors[i] = 1;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(i);


            while (!queue.isEmpty()){
               int ele = queue.poll();
               List<Integer> lst = adjLst.get(ele);
               for(int k: lst){
                  if(colors[k] == 0){
                     colors[k]= colors[ele] == 1? 2: 1;
                     queue.add(k);
                  }else if(colors[ele] == colors[k]){
                     return false;
                  }
               }
            }
         }
      }

//      Queue<Integer> queue = new LinkedList<>();
//      queue.add(1);
//      colors[1] = 0;
//      visited[1] =true;
//
//      while (!queue.isEmpty()){
//         int ele = queue.poll();
//         List<Integer> lst = adjLst.get(ele);
//         for(int i: lst){
//            if(!visited[i]){
//               colors[i]= 2;
//               colors[i] = colors[ele] +1;
//               queue.add(i);
//               visited[i]=true;
//            }else if(colors[ele] == colors[i]){
//               return false;
//            }
//         }
//      }

      return true;
   }
}
