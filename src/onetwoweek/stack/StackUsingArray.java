package onetwoweek.stack;

public class StackUsingArray {

   private int top;
   private int [] elements;
   private int size = 16;

   public StackUsingArray(){
      elements = new int[this.size];
   }

   public String push(int val){
      if(top >= this.size)
         return "Stack full";

      elements[top++] = val;
      return "PUshed";
   }

   public Object pop(){
      if(--top < 0)
         return "Stack empty";

      return elements[top];
   }
}
