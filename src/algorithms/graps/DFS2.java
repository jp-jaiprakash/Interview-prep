package algorithms.graps;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DFS2 {

   private LinkedList<Integer> adj[];
   private boolean visited[];

   public DFS2(int noOfVertices){
      adj = new LinkedList[noOfVertices];
      visited = new boolean[noOfVertices];

      for(int i =0; i< noOfVertices; i++){
         adj[i] = new LinkedList<>();
      }
   }

   private void addEdge(int v, int w){
      adj[v].add(w);
   }

   void traversal(int node){
      visited[node] = true;
//      System.out.println(node + " ->");

      Stack<Integer> stack = new Stack<>();
      stack.push(node);

      while (!stack.isEmpty()){
         Integer ele = stack.pop();
         System.out.print(ele + " ->");

         Iterator<Integer> i = adj[ele].listIterator();
         while (i.hasNext()){
            int n = i.next();
            if(!visited[n]){
               visited[n] = true;
               stack.push(n);
            }
         }
      }

      //recurse all the nodes adjacent to v
   }

   public static void main(String args[]) {
      DFS2 g = new DFS2(4);

      g.addEdge(0, 1);
      g.addEdge(0, 2);
      g.addEdge(1, 2);
      g.addEdge(2, 0);
      g.addEdge(2, 3);
      g.addEdge(3, 3);

      System.out.println("Following is Breadth First Traversal " +
              "(starting from vertex 2)");

      g.traversal(0);
   }
}
