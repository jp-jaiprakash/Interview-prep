package graph;

import java.util.LinkedList;
import java.util.Queue;

import static graph.GenerateTree.generatedRoot;
import static graph.GenerateTree.generatedRootFull;

public class SearchAnElement {

   public static void main(String[] args) {
      TreeNode root = generatedRoot();
      System.out.println(search(root, 7));

      System.out.println(search(generatedRootFull(), 10));
      System.out.println("-----------");
      System.out.println(searchNonRecursion(root, 7));

      System.out.println(searchNonRecursion(generatedRootFull(), 10));
   }

   private static boolean search(TreeNode root, int data) {
      if(root == null)
         return false;

      if(root.data == data)
         return true;

      return search(root.right, data) || search(root.left, data);
   }

   private static boolean searchNonRecursion(TreeNode root, int data) {
      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      while (!queue.isEmpty()){
         TreeNode temp = queue.poll();
         if(temp.data == data)
            return true;

         if(temp.left != null)
            queue.add(temp.left);

         if(temp.right != null)
            queue.add(temp.right);
      }
      return false;
   }
}
