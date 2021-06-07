package onetwoweek.stack;

public class StackEx {

   public static void main(String[] args) {
//      StackUsingArray stack = new StackUsingArray();
      StackUsingLL stack = new StackUsingLL();
      stack.push(5);
      stack.push(7);
      stack.push(70);
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
   }
}
