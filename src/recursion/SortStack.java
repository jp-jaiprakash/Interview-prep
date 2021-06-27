package recursion;

import java.util.Stack;

public class SortStack {

   public static void main(String[] args) {
      Stack<Integer> tempStack = new Stack<>();
      tempStack.push(2);
      tempStack.push(0);
      tempStack.push(1);
      tempStack.push(9);
      tempStack.push(5);

      tempStack = sort(tempStack);
      System.out.println(tempStack);

   }

   static Stack<Integer> sort(Stack<Integer> stack){
      if(stack.isEmpty() || stack.size() == 1)
         return stack;

      int top = stack.pop();
      sort(stack);

      Stack<Integer> tempStack = new Stack<>();
      while (!stack.isEmpty() && stack.peek() > top){
         tempStack.push(stack.pop());
      }
stack.push(top);
      while (!tempStack.isEmpty()){
         stack.push(tempStack.pop());
      }

      return stack;
   }
}
