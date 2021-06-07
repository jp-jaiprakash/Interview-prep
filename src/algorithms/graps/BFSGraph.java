package algorithms.graps;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {

   private int noOfVertices;
   private LinkedList<Integer> adj[];
   private boolean visited[];

   public BFSGraph(int noOfVertices) {
      this.noOfVertices = noOfVertices;
      adj = new LinkedList[noOfVertices];
      visited = new boolean[noOfVertices];
      for (int i = 0; i < noOfVertices; i++) {
         adj[i] = new LinkedList<>();
      }
   }

   private void addEdge(int v, int w) {
      adj[v].add(w);
   }

   void traversal(int node) {
      visited[node] = true;
      Queue<Integer> queue = new LinkedList<>();
      queue.add(node);

      while (!queue.isEmpty()) {
         Integer ele = queue.poll();
         System.out.print(ele + " ->");

         Iterator<Integer> i = adj[ele].listIterator();
         while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
               visited[n] = true;
               queue.add(n);
            }
         }
      }
   }

   public static void main(String args[]) {
      BFSGraph g = new BFSGraph(4);

      g.addEdge(0, 1);
      g.addEdge(0, 2);
      g.addEdge(1, 2);
      g.addEdge(2, 0);
      g.addEdge(2, 3);
      g.addEdge(3, 3);

      System.out.println("Following is Breadth First Traversal " +
              "(starting from vertex 2)");

      g.traversal(2);
   }

}
