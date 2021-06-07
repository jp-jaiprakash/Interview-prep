package algorithms.graps;

public class Test {
   public static void main(String[] args) {
      DFSGraph g = new DFSGraph(4);

      g.addEdge(0, 1);
      g.addEdge(0, 2);
      g.addEdge(1, 2);
      g.addEdge(2, 0);
      g.addEdge(2, 3);
      g.addEdge(3, 3);

      System.out.println(
              "Following is Depth First Traversal "
                      + "(starting from vertex 2)");

      g.DFS(2);

      char [][] arr = new char[][]{{'1','0','1','1','0','1','1'}};
//      numIslands(arr);
   }

   public  int numIslands(char[][] grid) {
      int noOfIslands = 0;

      for(int i=0; i<grid.length;i++){
         for(int j=0; j<grid[i].length;j++){
            if(grid[i][j] == '1'){
               grid[i][j] = '2';
               noOfIslands++;
               checkInAllDirections(i,j,grid);
            }


         }
      }

return noOfIslands;
   }

   private  void checkInAllDirections(int i, int j, char[][] grid) {
      if(i<0 || i>= grid.length || j<0 || j>=grid[i].length)
         return;


      if(i>0 && j< grid[i].length && grid[i-1][j] == '1'){
         grid[i-1][j] = '2';
         checkInAllDirections(i-1,j,grid);
      }
      if(i>=0 && i<grid.length-1 && j< grid[i].length && grid[i+1][j] == '1'){
         grid[i+1][j] = '2';
         checkInAllDirections(i+1,j,grid);
      }
      if(i>=0 && j< grid[i].length-1 && grid[i][j+1] == '1'){
         grid[i][j+1] = '2';
         checkInAllDirections(i,j+1,grid);
      }
      if(i>=0 && j< grid[i].length && j>0 && grid[i][j-1] == '1'){
         grid[i][j-1] = '2';
         checkInAllDirections(i,j-1,grid);
      }
   }
}
