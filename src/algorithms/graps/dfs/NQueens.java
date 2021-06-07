package algorithms.graps.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueens {

   public List<List<String>> solveNQueens(int n){

      char[][] board = new char[n][n];

      for(int i=0; i< n; i++){
         for(int j=0; j< n; j++){
            board[i][j] = '.';
         }
      }

      List<List<String>> res = new ArrayList<>();

      dfs(board, 0, res);

      return res;
   }

   private void dfs(char[][] board, int colIdx, List<List<String>> res) {

      if(colIdx == board.length){
         res.add(construct(board));
         return;
      }

      for(int i=0; i< board.length; i++){
         if(validate(board, i, colIdx)){
            board[i][colIdx] = 'Q';
            dfs(board, colIdx+1, res);
            board[i][colIdx] = '.';
         }
      }
   }

   private boolean validate(char[][] board, int x, int colIdx) {
      for(int i=0; i< board.length;i++){
         for(int j=0; j< colIdx; j++){
            if(board[i][j] == 'Q' && (x+colIdx == i+ j || x+j == i+ colIdx || x==i)){
               return false;
            }
         }
      }
      return true;
   }

   private List<String> construct(char[][] board) {

      List<String> res = new LinkedList<>();
      for(int i=0; i< board.length; i++){
         String s = new String(board[i]);
         res.add(s);
      }
      return res;
   }

   public static void main(String[] args) {
      NQueens queens=new NQueens();
      System.out.println(queens.solveNQueens(4));
   }
}
