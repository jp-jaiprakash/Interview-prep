package onetwoweek.stack;

import java.util.Queue;
import java.util.Stack;

class StockSpanner {

   Stack<int[]> stack;

   public StockSpanner() {

      stack = new Stack<>();
   }

   public int next(int price) {
      int span = 1;
      while (!stack.isEmpty() && stack.peek()[0] >= price) {
         span += stack.peek()[1];
         stack.pop();
      }

      stack.push(new int[]{price, span});

      return span;
   }
}


public class StackUsingQueue {

//   Queue<>
}
