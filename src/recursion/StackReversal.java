package recursion;

import java.util.Stack;

public class StackReversal {

   public static void main(String[] args) {
      Stack<Integer> tempStack = new Stack<>();
      tempStack.push(2);
      tempStack.push(0);
      tempStack.push(1);
      tempStack.push(9);
      tempStack.push(5);

       reverse(tempStack);
      System.out.println(tempStack);
   }

   static void reverse(Stack<Integer> stack){
      if(stack.size() == 1)
         return ;

      int top = stack.pop();
      reverse(stack);
      insertAtPosition(stack, top);
   }

   static void insertAtPosition(Stack<Integer> stack, int element){
      if(stack.isEmpty()){
         stack.push(element);
         return;
      }
      int top = stack.pop();
      insertAtPosition(stack, element);
      stack.push(top);
   }
}
