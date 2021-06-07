package algorithms.graps.dfs;

public class islands2 {

   public  int numIslands(char[][] grid) {
      int noOfIslands = 0;

      int n = grid.length;
      int m = grid[0].length;


      for(int i=0; i<grid.length;i++){
         for(int j=0; j<grid[i].length;j++){
            if(grid[i][j] == '1'){
               grid[i][j] = '0';
               noOfIslands++;
               checkInAllDirections(n,m,i,j,grid);
            }


         }
      }

      return noOfIslands;
   }

   private void checkInAllDirections(int n, int m, int i, int j, char[][] grid) {

      if(i<0 || j< 0 || i>=n || j>= m || grid[i][j] != '1')
         return;

      grid[i][j] = '0';

      checkInAllDirections(n,m,i+1,j, grid);
      checkInAllDirections(n,m,i-1,j, grid);
      checkInAllDirections(n,m,i,j+1, grid);
      checkInAllDirections(n,m,i,j-1, grid);
   }
}
