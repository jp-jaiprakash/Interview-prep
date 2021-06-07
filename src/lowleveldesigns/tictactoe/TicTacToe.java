package lowleveldesigns.tictactoe;

public class TicTacToe {

   private final int[][] board;
   private  final int n;
   public TicTacToe(final int n) {
      this.n = n;
      this.board = new int[n][n];
   }

   /**
    *
    * @param player is either 0 or 1
    * @param row is the move's row index
    * @param col is the move's column index
    * @return frst Player:: +1 second player: -1 and zero otherwise
    * @throws IllegalArgumentException if the move is illegal move
    */
   public int move(int player, int row, int col) throws IllegalArgumentException{

      if(row < 0 || col < 0 || row >=n || col >= n ) {
         throw new IllegalArgumentException("Move out of boundary");
      } else if(board[row][col] != 0)
         throw new IllegalArgumentException("Square is already occupied");
      else if(player != 0 && player != 1)
         throw new IllegalArgumentException("Invalid Player");
      else {
         player = player == 0 ? -1 : +1;
         board[row][col] = player;
         boolean win = true;

         // for row
         for(int i=0; i<n; i++){
            if(board[row][i] != player){
               win = false;
               break;
            }
         }

         if(win){
            return player ;
         }


         // for column
         win = true;
         for(int i=0; i<n; i++){
            if(board[i][col] != player){
               win = false;
               break;
            }
         }

         if(win){
            return player ;
         }

         /**
          * checks daigonal
          */

         // for column
         if(row == col){
            win = true;
            for(int i=0; i<n; i++){
               if(board[i][i] != player){
                  win = false;
                  break;
               }
            }

            if(win){
               return player ;
            }
         }

/**
 * reverse daigonal
 */
         if(row == n-1-col){
            win = true;
            for(int i=0; i<n; i++){
               if(board[row][i] != player){
                  win = false;
                  break;
               }
            }

            if(win){
               return player ;
            }
         }




      }
return -1;
   }
}
