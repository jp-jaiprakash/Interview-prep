package graph;

import java.util.LinkedList;
import java.util.Queue;

import static graph.GenerateTree.generatedRoot;
import static graph.GenerateTree.generatedRootFull;

public class MaximumElement {

   public static void main(String[] args) {
      TreeNode root = generatedRoot();
      System.out.println(getMax(root));

      System.out.println(getMax(generatedRootFull()));
      System.out.println("-----------");
      System.out.println(getMaxNonRecursion(root));

      System.out.println(getMaxNonRecursion(generatedRootFull()));
   }

   static int getMax(TreeNode root){
      if(root == null)
         return -1;
      int leftRightMax = Math.max(getMax(root.left), getMax(root.right));
      return leftRightMax > root.data ? leftRightMax : root.data;
   }

   static int getMaxNonRecursion(TreeNode root){
      int max = Integer.MIN_VALUE;
      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      while (!queue.isEmpty()){
         TreeNode temp = queue.poll();
         if(temp.data > max)
            max = temp.data;

         if(temp.left != null)
            queue.add(temp.left);

         if(temp.right != null)
            queue.add(temp.right);
      }

      return max;
   }
}
