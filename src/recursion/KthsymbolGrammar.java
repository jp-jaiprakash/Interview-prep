package recursion;

/**
 * https://leetcode.com/problems/k-th-symbol-in-grammar/
 */
public class KthsymbolGrammar {
   public static void main(String[] args) {

   }

   static int kthGrammar(int n, int k) {
      if(k==1 || n==1)
         return 0;
      int noOfBits = (int) Math.pow(2, n-1);

      int mid = noOfBits /2;
      if(k<= mid){
         return kthGrammar(n-1, k );
      }else {
         return kthGrammar(n-1, k -mid) == 1 ? 0 : 1;
      }
   }
}
