package algorithms.trees;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {

   public List<List<Integer>> levelOrder(TreeNode root){
      ArrayList<List<Integer>> ans = new ArrayList<>();
      traverse(root, ans, 0);
      return ans;
   }

   private void traverse(TreeNode root, ArrayList<List<Integer>> ans, int level) {
      if(root == null)
         return;

      if(level == ans.size())
         ans.add(new ArrayList<>());

      ans.get(level).add(root.data);
      traverse(root.left, ans, level+1);
      traverse(root.right, ans, level +1);

   }
}
