package graph;

import static graph.GenerateTree.generatedRoot;
import static graph.GenerateTree.generatedRootFull;

public class HeightTree {

      public static void main(String[] args) {
         TreeNode root = generatedRoot();
         System.out.println(getHeight(root));

         System.out.println(getHeight(generatedRootFull()));
      }

      static int getHeight(TreeNode root){
         if(root == null)
            return 0;
         int leftHeight = getHeight(root.left);
         int rightHeight = getHeight(root.right);

         return leftHeight > rightHeight ? leftHeight + 1 : rightHeight +1;
      }
}
