package algorithms.trees;

public class TreeCreation {
   public TreeNode buildTree(int [] preorder, int [] inorder){
      return helper(0,0,inorder.length-1, preorder, inorder);
   }

   private TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {

      if(preStart > preorder.length-1 || inStart > inEnd)
         return  null;

      TreeNode root = new TreeNode(preorder[preStart]);
      int inIdx = 0 ; // Index of current root in inorder

      for(int i = inStart; i<=inEnd; i++){
         if(inorder[i] == root.data){
            inIdx = i;
         }
      }

      root.left = helper(preStart+1, inStart, inIdx -1, preorder, inorder);
      root.right = helper(preStart+inIdx -inStart+1, inIdx +1,inEnd, preorder, inorder);
      return root;
   }
}
