package graph;

import java.util.Stack;

import static graph.GenerateTree.insertLevelOrder;
import static graph.InorderTraversal.inOrderNonRecursive;

public class PreOrder {
   public static void main(String[] args) {
      Integer [] arr = {3,9,20,null,null,15,7};
      TreeNode root = new TreeNode();
      root = insertLevelOrder(arr, root, 0);
      preOrderRecursive(root);
      System.out.println();
      preOrderNonRecursive(root);

   }
   static void  preOrderRecursive(TreeNode root){

      if(root == null){
         return;
      }

      System.out.print(root.data + " ");
      preOrderRecursive(root.left);
      preOrderRecursive(root.right);
   }

   static void preOrderNonRecursive(TreeNode root){

      if(root == null){
         return;
      }
      Stack<TreeNode> stack= new Stack<>();
      while(true){

         while(root != null){
            System.out.print(root.data + " ");

            stack.push(root);
            root = root.left;
         }

         if(stack.isEmpty()){
            break;
         }
         root = stack.pop();
         root = root.right;


      }

   }
}
