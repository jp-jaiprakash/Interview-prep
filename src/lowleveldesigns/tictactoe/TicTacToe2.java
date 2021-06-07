package lowleveldesigns.tictactoe;


public class TicTacToe2 {

   private final int[][] board;
   private final int n;

   public TicTacToe2(final int n) {
      this.n = n;
      this.board = new int[n][n];
   }

   /**
    * @param player is either 0 or 1
    * @param row    is the move's row index
    * @param col    is the move's column index
    * @return frst Player:: +1 second player: -1 and zero otherwise
    * @throws IllegalArgumentException if the move is illegal move
    */
   public int move(int player, int row, int col) throws IllegalArgumentException {

      if (row < 0 || col < 0 || row >= n || col >= n) {
         throw new IllegalArgumentException("Move out of boundary");
      } else if (board[row][col] != 0)
         throw new IllegalArgumentException("Square is already occupied");
      else if (player != 0 && player != 1)
         throw new IllegalArgumentException("Invalid Player");
      else {
         player = player == 0 ? -1 : +1;
         board[row][col] = player;
         boolean winRow = true, winCol = true, winDaigonal = true, winRevDaigonal = true;

         // for row
         for (int i = 0; i < n; i++) {
            if (board[row][i] != player) {
               winRow = false;
            }

            if (board[i][col] != player) {
               winCol = false;
            }

            if (board[i][i] != player) {
               winDaigonal = false;
            }

            if (board[row][i] != player) {
               winRevDaigonal = false;
            }


         }

         if (winRow || winCol || winDaigonal || winRevDaigonal) {
            return player;
         }


      }
      return 0;
   }
}
