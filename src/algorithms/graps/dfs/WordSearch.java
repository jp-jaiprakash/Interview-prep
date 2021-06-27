package algorithms.graps.dfs;

public class WordSearch {

   public boolean exist(char[][] board, String word) {

      boolean [][] visited = new boolean[board.length][board[0].length];

      int idx=0;

      for(int i=0; i< board.length; i++){
         for(int j=0; j<board.length; j++){
            if(board[i][j] == word.charAt(idx)){
               dfs(board, word, idx, i, j, visited);
            }
         }
      }

      return false;
   }

   private boolean dfs(char[][] board, String word, int idx, int i, int j, boolean[][] visited) {

      if(idx == word.length()-1)
         return true;

      visited[i][j] = true;

      /**
       * i+1,j
       * i-1,j
       * i,j+1
       * i,j-1
       */

      if(i<board.length -1 && !visited[i+1][j] && board[i+1][j]==word.charAt(idx+1) && dfs(board,word,idx+1,i+1,j,visited)){
         return true;
      }
      if(i>0 && !visited[i-1][j] && board[i-1][j]==word.charAt(idx+1)  && dfs(board,word,idx+1,i-1,j,visited) ){
         return true;
      }
      if(j<board.length -1 && !visited[i][j+1] && board[i][j+1]==word.charAt(idx+1) && dfs(board,word,idx+1,i,j+1,visited)){
         return true;
      }
      if( j>0 && !visited[i][j-1] && board[i][j-1]==word.charAt(idx+1) && dfs(board,word,idx+1,i,j-1,visited)){
         return true;
      }
      visited[i][j] = false;
      return false;
   }
}
