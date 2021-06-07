package graph;

import java.util.LinkedList;
import java.util.Queue;

import static graph.GenerateTree.generatedRoot;
import static graph.GenerateTree.generatedRootFull;

public class SizeOfTree {

   public static void main(String[] args) {
      TreeNode root = generatedRoot();
      System.out.println(getSize(root));


   }

   static int getSize(TreeNode root){
      int cnt = 0;
      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      while (!queue.isEmpty()){
         TreeNode temp = queue.poll();
        cnt++;

         if(temp.left != null)
            queue.add(temp.left);

         if(temp.right != null)
            queue.add(temp.right);
      }

      return cnt;
   }
}
