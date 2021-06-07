package algorithms.graps.dfs;

public class SurroundedRegions {
   public void solve(char[][] board) {

      int result =0;
      for(int i=0; i< board.length; i++){
         for(int j=0; j< board[i].length; j++){
            if(i==0 || i== board.length-1 || j==0 || j==board[i].length-1){
               dfs(board, i,j);
            }
         }
      }

      for(int i=0; i< board.length; i++){
         for(int j=0; j< board[i].length; j++){
            if(board[i][j] == 'O'){
               board[i][j] = 'X';
            }
         }
      }
      for(int i=0; i< board.length; i++){
         for(int j=0; j< board[i].length; j++){
            if(board[i][j] == 'Y'){
               board[i][j] = '0';
            }
         }
      }
      System.out.println(result);
   }

   private void dfs(char[][] board, int i, int j) {
      if(i >=0 && i<= board.length-1 && j>=0 && j<=board[i].length -1 && board[i][j] == 'O'){
         board[i][j] = 'Y';

         dfs(board, i + 1, j);
         dfs(board, i - 1, j);
         dfs(board, i, j + 1);
         dfs(board, i, j - 1);
      }

   }

   public static void main(String[] args) {
      SurroundedRegions regions = new SurroundedRegions();
      char [][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};

      regions.solve(board);
   }
}
