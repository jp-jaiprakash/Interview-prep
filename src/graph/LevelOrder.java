package graph;

import java.util.LinkedList;
import java.util.Queue;

import static graph.GenerateTree.insertLevelOrder;

public class LevelOrder {

   public static void main(String[] args) {
      Integer[] arr = {1, 2, 3, 4, 5, null, 7, null,null,6,null,null,null,null,8};
      TreeNode root = new TreeNode();
      root = insertLevelOrder(arr, root, 0);
//      levelOrders(root);
      System.out.println();
//      levelOrder(root);
      findCousin(root, 6);
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

   static void levelOrders(TreeNode root){
      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      System.out.print(root.data + " ");

      while (!queue.isEmpty()){
         TreeNode temp = queue.poll();
         System.out.println("******");
         queue.add(null);
         while (temp!=null){
            if(temp.left !=null){
               queue.add(temp.left);
               System.out.print(temp.left.data + " ");
            }

            if(temp.right != null){
               queue.add(temp.right);
               System.out.print(temp.right.data + " ");
            }

            temp = queue.poll();
         }
      }
   }

   static void findCousin(TreeNode root, int val){
      if(root == null || root.data==val){
         System.out.println("No Cousin");
         return;
      }

      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);

      while (!queue.isEmpty()){
         TreeNode temp = queue.poll();
         queue.add(null);
         boolean found = false;
         while (temp!=null){
            if(temp.left !=null){
               queue.add(temp.left);
               if(found)
                  printCousins(temp);
               else
                  found = found || temp.left.data == val;
            }

            if(temp.right != null){
               queue.add(temp.right);
               if(found)
                  printCousins(temp);
               else
                  found = found || temp.right.data == val;
            }

            temp = queue.poll();
         }
      }
   }

   static void printCousins(TreeNode root){
      if(root == null)
         return;

      if(root.left!=null)
         System.out.print(root.left.data + " ");

      if(root.right!= null)
         System.out.print(root.right.data + " ");
   }
}
