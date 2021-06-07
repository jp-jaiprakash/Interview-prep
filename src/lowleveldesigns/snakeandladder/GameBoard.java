package lowleveldesigns.snakeandladder;

import java.util.List;
import java.util.Map;
import java.util.Queue;


public class GameBoard {

   private Dice dice;
   private Queue<Player> nextTurn;
   private List<Jumper> snakes;
   private List<Jumper> ladders;
   private Map<String, Integer> playersCurrentPosition; // name of player and their current position
   int boardSize;

   public GameBoard(Dice dice, Queue<Player> nextTurn, List<Jumper> snakes, List<Jumper> ladders, Map<String, Integer> playersCurrentPosition, int boardSize) {
      this.dice = dice;
      this.nextTurn = nextTurn;
      this.snakes = snakes;
      this.ladders = ladders;
      this.playersCurrentPosition = playersCurrentPosition;
      this.boardSize = boardSize;
   }
//   GameBoard(){
//
//   }

   void startGame(){
      while (nextTurn.size() > 1){
         Player player = nextTurn.poll();
         int currentPosition = playersCurrentPosition.get(player.getName());
         int diceValue = dice.roll();
         int nextCell = currentPosition + diceValue;
         if(nextCell > boardSize)
            nextTurn.offer(player);
         else if(nextCell == boardSize)
            System.out.println(player.getName() +" won the game");
         else{
            int [] nextPosition = new int[1];
            boolean b[] = new boolean[1];

            nextPosition[0] = nextCell;

            snakes.forEach(v->{
               if(v.getStartPoint() == nextCell){
                  nextPosition[0] = v.getEndPoint();
                  b[0] = true;
               }
            });

            if(nextPosition[0] != nextCell )
               System.out.println(player.getName()+" was bitten by snake");

            ladders.forEach(l->{
               if(l.getStartPoint() == nextCell){
                  nextPosition[0] = l.getEndPoint();
               }
            });

            if(nextPosition[0] != nextCell && b[0])
               System.out.println(player.getName()+" found a ladder");

            if(nextPosition[0] == boardSize)
               System.out.println(player.getName() +" won the game");
            else{
               playersCurrentPosition.put(player.getName(), nextPosition[0]);
               nextTurn.offer(player);
            }
         }
      }

   }
}
