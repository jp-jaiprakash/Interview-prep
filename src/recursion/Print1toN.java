package recursion;

/**
 * Making use of IBH - Induction base hypothesis
 */
public class Print1toN {
   public static void main(String[] args) {
      printRecusive(7);
      System.out.println();
      printRecusiveNto1(7);
   }

   private static void printRecusive(int n) {
      if(n == 0) // Base
         return;

      printRecusive(n-1); // Hypothesis
      System.out.print(n+" "); // Induction
   }

   private static void printRecusiveNto1(int n) {
      if(n == 0) // Base
         return;
      System.out.print(n+" "); // Induction
      printRecusiveNto1(n-1); // Hypothesis
   }
}
