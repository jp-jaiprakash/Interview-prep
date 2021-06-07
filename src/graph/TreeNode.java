package graph;

class TreeNode{
    Integer data;
    TreeNode left;

    TreeNode right;

    TreeNode(){}

    TreeNode(int data){
      this.data = data;
      this.left =null;
      this.right = null;
   }

   TreeNode(Integer data, TreeNode left, TreeNode right) {
      this.data = data;
      this.left = left;
      this.right = right;
   }
}
