package algorithms.graps.dfs;

public class NumberOfEnclaves {
   public int numEnclaves(int[][] grid) {

      int n = grid.length;
      int m = grid[0].length;

      if(n<3 || m<3)
         return 0;

      int cnt =0;
      for(int i=1;i< n-1; i++){
         for(int j=1; j<m-1; j++){
            if(grid[i][j] == 1){
               int newcnt=0;
               newcnt = dfs(grid, newcnt,i,j,n,m);
               cnt = cnt +newcnt;

            }
         }
      }

      return cnt;

   }

   private int dfs(int[][] grid, int cnt, int i, int j, int n, int m) {

      if(i<1 || i>m-2 || j<1 || j>n-2 || grid[i][j] ==0)
         return 0;

      if(((j==0 || j==n) && grid[i][j]==1 ) ||((i==0 || i==m) && grid[i][j]==1 ))
         return 0;



      if(i!=0 && i!=m-1 && grid[i-1][j]==1){
         cnt++;
         grid[i-1][j] = 0;
         dfs(grid, cnt, i-1, j, n, m);
      }
      if(i!=0 && i!=m-1 && grid[i+1][j]==1){
         cnt++;
         grid[i+1][j] = 0;
         dfs(grid, cnt, i+1, j, n, m);
      }
      if(i!=0 && i!=m-1 && grid[i][j-1]==1){
         cnt++;
         grid[i][j-1] = 0;
         dfs(grid, cnt, i, j-1, n, m);
      }
      if( i!=0 && i!=m-1 && grid[i][j+1]==1){
         cnt++;
         grid[i][j+1] = 0;
         dfs(grid, cnt, i, j+1, n, m);
      }

      return cnt;
   }

   public static void main(String[] args) {
      NumberOfEnclaves no = new NumberOfEnclaves();
      System.out.println(no.numEnclaves(new int[][]{{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}}));
   }
}
