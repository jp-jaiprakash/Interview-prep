package algorithms.graps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BiParttiteBFS {

   class Edge{

      int src,dest;

      public Edge(int src, int dest){
         this.src = src;
         this.dest = dest;
      }
   }

   class Graph{
      List<List<Integer>> adjList = null;

      //Constructor
      Graph(List<Edge> edges, int N){
         adjList = new ArrayList<>();
         for(int i=0;i < N; i++){
            adjList.add(new ArrayList<>());
         }

         // add edges to undirected graph
         for(Edge edge: edges){
            int src=edge.src;
            int dest = edge.dest;

            // add an edge from src to destination
            adjList.get(src).add(dest);

            // add an edge from dest to src
            adjList.get(dest).add(src);
         }
      }

   }

   static boolean BFS(Graph graph, int startingNode, int N){
      boolean[] discovered = new boolean[N];

      // store the level of each vertex
      int[] level = new int[N];


      //mark the src vertex as discovered and level as 0
      level[startingNode] =0;
      discovered[startingNode] = true;

      Queue<Integer> queue = new LinkedList<>();
      queue.add(startingNode);

      while (!queue.isEmpty()){
         startingNode = queue.poll();

         for(int u: graph.adjList.get(startingNode)){

            if(!discovered[u]){
               discovered[u]=true;
               level[u] = level[startingNode] +1;
               queue.add(u);
            }else if(level[startingNode]==level[u]){
               return false;

               // if the vertex has already been discovered and level of both node are same then graph conbtains odd cycle

            }
         }
      }

      return true;
   }

   public static void main(String[] args) {

   }
}
