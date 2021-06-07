package algorithms.trees;

public class LongestConsecutivePath {

   private int result =0;
   public int longestConsecutive(TreeNode root){
      if(root == null)
         return 0;

      result =0;
      lc(root);
      return result;
   }

   private int lc(TreeNode root) {
      if(root == null)
         return 0;

      int left = lc(root.left);
      int right = lc(root.right);

      int max = 1;
      if(root.left == null || root.left.data == root.data + 1)
         max = Math.max(left+1, max);

      if(root.right == null || root.right.data == root.data + 1)
         max = Math.max(right+1, max);

      result = Math.max(result, max);
      return max;
   }
}
