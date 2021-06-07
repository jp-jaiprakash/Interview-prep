package algorithms.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * find all the paths that sum to a given number where solution may or maynot include the root
 *
 * pathSum(root,sum) = no of path including root + no of path not including root
 * root =  f2(root.left, sum -root.val) + f2(root.right, sum-root.val)
 * not root = f1(root.left, sum) + f1(root.right, val)
 */
public class PathSumIII {

   public List<List<Integer>> pathSum(TreeNode root, int sum){

      List<List<Integer>> ret = new ArrayList<>();
      List<Integer> curr = new ArrayList<>();
      pathSum(root, sum,ret, curr );
      return ret;
   }

   private void pathSum(TreeNode root, int sum, List<List<Integer>> ret, List<Integer> curr) {

      if(root == null)
         return;

      curr.add(root.data);

      if(root.left == null && root.right==null && root.data== sum){
         ret.add(new ArrayList<>(curr));
      }

      pathSum(root.left, sum - root.data, ret, curr);
      pathSum(root.right, sum - root.data, ret, curr);
      curr.remove(curr.size()-1);
   }
}
