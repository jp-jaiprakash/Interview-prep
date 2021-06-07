package algorithms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test {

   /**
    * player 1: +1
    * payer 2 : -1
    */



   public static void main(String[] args) {
      String player1 = "player1";
      String player2 = "player2";

      int [][] board = new int[3][3];
      Queue<String> queue = new LinkedList<>();
      queue.add(player1);
      queue.add(player2);

      int player = 1;

      Scanner sc = new Scanner(System.in);
      int cnt =0;
      while (cnt<9){
         System.out.println("Enter your row location(0 based index)");
         int i = sc.nextInt();
         System.out.println("Enter your column location(0 based index)");
         int j = sc.nextInt();
         int winner =0;

         if(i<0 || i>2 || j< 0 || j>2){
            // throw error
            System.out.println("wrong input");
         }else{
            winner = winner(player,board,i,j);

         }
         if(winner != -1){
            System.out.println("Player "+ winner + " has won the match");
            break;
         }
         player = 2;
         cnt++;

      }
      if(cnt ==9)
         System.out.println("No winner found");
   }

   /**
    * winrow
    * wincol
    * windaig
    * winrevdaig
    */
   public static int winner(int player, int [][] board, int i, int j){
      int val =0;
      if(player == 1)
         val = 1;
      else
         val = -1;

      board[i][j] = val;

      boolean winrow = true, wincol=true,windaig=true,winrevdaig=true  ;

      for(int x=0; x< 3; x++){
         for(int y =0; y<2; y++){
            if(Math.abs(board[0][0] + board[1][1] + board[2][2]) == 3)
               return player;

            if(Math.abs(board[0][0] + board[0][1] + board[0][2]) == 3)
               return player;

            if(Math.abs(board[1][0] + board[1][1] + board[1][2]) == 3)
               return player;

            if(Math.abs(board[2][0] + board[2][1] + board[2][2]) == 3)
               return player;

            if(Math.abs(board[0][0] + board[1][0] + board[2][0]) == 3)
               return player;

            if(Math.abs(board[0][1] + board[1][1] + board[2][1]) == 3)
               return player;

            if(Math.abs(board[0][2] + board[1][2] + board[2][2]) == 3)
               return player;

            if(Math.abs(board[2][0] + board[1][1] + board[0][2]) == 3)
               return player;

         }
      }

      return -1;

   }

}
