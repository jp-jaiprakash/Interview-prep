package algorithms.graps.dfs;

public class NumberOfIslands {

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
