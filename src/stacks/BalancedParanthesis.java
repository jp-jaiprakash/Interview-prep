package stacks;

import java.util.Stack;

public class BalancedParanthesis {
   public static void main(String[] args) {
//      System.out.println("([])" + isBalanced("([])"));
//      System.out.println("" +isBalanced(""));
//      System.out.println("(][)" +isBalanced("(][)"));
//      System.out.println("((" + isBalanced("(("));
//      System.out.println("()[]{}"+isBalanced("([])"));
//      System.out.println(isBalanced("([])"));

      System.out.println(isBalancedRecursive("(][)","(][)",0 ));

   }

   static boolean isBalanced(String input){
      if(input.isEmpty())
         return true;
      String s[]= input.split("");
      Stack<String> stack = new Stack<>();
      for(String str: s){
         if(str.equals("(")||str.equals("{")||str.equals("["))
            stack.push(str);
         else{
            if(str.equals(")") && !stack.peek().equals("("))
               return false;
            if(str.equals("}") && !stack.peek().equals("{"))
               return false;
            if(str.equals("]") && !stack.peek().equals("["))
               return false;

            stack.pop();
         }
      }
      return stack.isEmpty();
   }

   static boolean isBalancedRecursive(String orgString, String input, int idx){
      if(input.isEmpty() && idx >= orgString.length())
         return true;

      if(input.charAt(idx) == '('){
         int index = findIdx(input, ')', idx+1);
         if(index == -1)
            return false;
         return isBalancedRecursive(orgString, input.substring(idx+1, index), idx+1) &&
                 isBalancedRecursive(orgString,input.substring(index), index);
      }
      else if(input.charAt(idx) == '{'){
         int index = findIdx(input, '}', idx+1);
         if(index == -1)
            return false;
         return isBalancedRecursive(orgString,input.substring(idx+1, index), idx+1) &&
                 isBalancedRecursive(orgString,input.substring(index), index);
      }
      else if(input.charAt(idx) == '['){
         int index = findIdx(input, ']', idx+1);
         if(index == -1)
            return false;
         return isBalancedRecursive(orgString,input.substring(idx+1, index), idx+1) &&
                 isBalancedRecursive(orgString,input.substring(index), index);
      }

      return true;
   }

   private static int findIdx(String substring, char c, int i) {
      return substring.indexOf(c, i);
   }


}
