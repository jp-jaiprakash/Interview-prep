package algorithms.dynamicprogramming;

/**
  https://leetcode.com/problems/diameter-of-binary-tree/
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class DiameterOfTree {
int max =0;
   public int diameterOfBinaryTree(TreeNode root) {
      maxDepth(root);

      return max;
   }

   private int maxDepth(TreeNode root){
      if(root == null)
         return 0;

      int left = maxDepth(root.left);
      int right = maxDepth(root.right);

      max = Math.max(max, left + right);
      return Math.max(left ,right) + 1;

   }

   // Approach 2
   public int diameterOfBinaryTree2(TreeNode root){
      int res [] = new int[1];
      dfs(root, res);
      return res[0];
   }

   private int dfs(TreeNode root, int[] res) {

      // if root is null, height is 0
      if(root == null)
         return 0;

      // find the height of left tree
      int left = dfs(root.left, res);
      // find the height of right tree
      int right = dfs(root.right, res);

      // update the result. Daimeter is l + r not +1 as that is taken care while calculting the height
      res[0] = Math.max(res[0], left + right);
      // Max height will be either l or r and +1 to include root node
      return Math.max(left, right)+1;
   }

}
