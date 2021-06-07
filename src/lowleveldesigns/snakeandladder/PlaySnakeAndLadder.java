package lowleveldesigns.snakeandladder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class PlaySnakeAndLadder {
   public static void main(String[] args) {
      Dice dice = new Dice(1);
      Player p1 = new Player("jai", 1);
      Player p2 = new Player("om", 2);

      Queue<Player> queue = new LinkedList<>();
      queue.add(p1);
      queue.add(p2);

      Jumper j1 = new Jumper(20,5);
      Jumper j2 = new Jumper(85,23);
      List<Jumper> snakes = new ArrayList<>();
      snakes.add(j1);
      snakes.add(j2);


      Jumper j3 = new Jumper(12,50);
      Jumper j4 = new Jumper(84,95);
      List<Jumper> ladders = new ArrayList<>();
      ladders.add(j3);
      ladders.add(j4);

      Map<String, Integer> playersCurrentPosition = new HashMap<>();
      playersCurrentPosition.put(p1.getName(), 0);
      playersCurrentPosition.put(p2.getName(), 0);

      GameBoard gameBoard = new GameBoard(dice, queue, snakes, ladders, playersCurrentPosition, 100);
      gameBoard.startGame();
   }
}
