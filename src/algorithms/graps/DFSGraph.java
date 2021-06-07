package algorithms.graps;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSGraph {

   private int noOfVertices;
   private LinkedList<Integer> adj[];

   public DFSGraph(int noOfVertices) {
      this.noOfVertices = noOfVertices;
      adj = new LinkedList[noOfVertices];
      for (int i = 0; i < noOfVertices; i++) {
         adj[i] = new LinkedList<>();
      }
   }

   void addEdge(int v, int w) {
      adj[v].add(w); //add w to v's list
   }

   void DFSUtil(int v, boolean visited[]) {
      //Mark current node as visted
      visited[v] = true;
      System.out.print(v + " ->");

      // recuse all the nodes adjacent to v
      Iterator<Integer> itr = adj[v].listIterator();
      while (itr.hasNext()) {
         int node = itr.next();
         if (!visited[node])
            DFSUtil(node, visited);
      }
   }

   void DFS(int v) {
      boolean visited[] = new boolean[this.noOfVertices];

      DFSUtil(v, visited);
   }

   public static void main(String args[]) {
      DFSGraph g = new DFSGraph(6);

//      g.addEdge(0, 1);
//      g.addEdge(0, 2);
//      g.addEdge(1, 2);
//      g.addEdge(2, 0);
//      g.addEdge(2, 3);
//      g.addEdge(3, 3);

      g.addEdge(5, 2);
      g.addEdge(5, 0);
      g.addEdge(2, 3);
      g.addEdge(3, 1);

      g.addEdge(4, 1);
      g.addEdge(4, 0);

      System.out.println("Following is Breadth First Traversal " +
              "(starting from vertex 2)");

      g.DFS(5);
   }
}
