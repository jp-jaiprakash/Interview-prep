package recursion;

public class PowerSet {
   public static void main(String[] args) {
//      System.out.println("abcd");
      solve("abc","");
      System.out.println();
   }

   static void solve(String input, String output){
      if(input.isEmpty()){
         System.out.print(output+" ");
return;
      }

      String op1 = output;
      String op2 = output;

      if(!input.isEmpty()){
         op2 = op2+input.substring(0,1);
         input = input.substring(1);
      }

      solve(input, op1);
      solve(input, op2);
      return;
   }
}
