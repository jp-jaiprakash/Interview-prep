package graph;

import java.util.LinkedList;
import java.util.Queue;

import static graph.GenerateTree.insertLevelOrder;

public class LevelOrder {

   public static void main(String[] args) {
      Integer[] arr = {1, 2, 3, 4, 5, null, 7, null,null,6,null,null,null,null,8};
      TreeNode root = new TreeNode();
      root = insertLevelOrder(arr, root, 0);
      levelOrder(root);
   }

   static void levelOrder(TreeNode root) {
      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      while (!queue.isEmpty()) {
         TreeNode temp = queue.poll();
         System.out.print(temp.data + " ");

         if (temp.left != null) {
            queue.add(temp.left);
         }

         if(temp.right != null)
            queue.add(temp.right);

      }
   }
}
