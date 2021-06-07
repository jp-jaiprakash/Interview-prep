package algorithms.trees;

public class BinaryTreeMaxPathSum {
   int max;

   public int maxPathSum(TreeNode root){
      max = Integer.MIN_VALUE;
      search(root);
      return max;
   }

   private int search(TreeNode root) {
      if(root == null)
         return 0;

      int left = Math.max(0, search(root.left));
      int right = Math.max(0, search(root.right));
      max = Math.max(max, root.data + left + right);
      return Math.max(left, right) + root.data;
   }
}
