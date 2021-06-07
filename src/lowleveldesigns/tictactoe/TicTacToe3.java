package lowleveldesigns.tictactoe;

public class TicTacToe3 {

   private final int[][] board;
   private final int n;
   private final int[] rowSum, colSum;
   private int daigSum, revDaigSum;
   private int winner;


   public TicTacToe3(final int n) {
      this.n = n;
      this.board = new int[n][n];
      rowSum = new int[n];
      colSum = new int[n];
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
      }
      if (board[row][col] != 0)
         throw new IllegalArgumentException("Square is already occupied");
      if (player != 0 && player != 1)
         throw new IllegalArgumentException("Invalid Player");

      if (getWinner() != 0)
         throw new IllegalArgumentException("Board is decided");

      player = player == 0 ? -1 : +1;
      board[row][col] = player;

      rowSum[row] += player;
      colSum[col] += player;

      if (row == col)
         daigSum += player;

      if (row == n - 1 - col)
         revDaigSum += player;

      if (Math.abs(rowSum[row]) == n || Math.abs(colSum[row]) == Math.abs(n) || Math.abs(daigSum) == Math.abs(n) || Math.abs(revDaigSum) == Math.abs(n))
         return player;
      return getWinner();
   }

   public int getWinner() {
      boolean gameRunning = true;
      int [] players = new int []{-1,1};
      int i =0;
      while (gameRunning && winner !=0){

      }
      return winner;
   }
}
