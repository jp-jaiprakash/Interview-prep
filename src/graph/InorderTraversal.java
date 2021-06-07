package graph;

import java.util.Stack;

import static graph.GenerateTree.insertLevelOrder;

public class InorderTraversal {



   static void inOrderRecursive(TreeNode root){
      if(root == null){
         return ;
      }
      inOrderRecursive(root.left);
      System.out.print(root.data + " ");
      inOrderRecursive(root.right);
   }

   static void inOrderNonRecursive(TreeNode root){

      if(root == null){
         return;
      }
      Stack<TreeNode> stack = new Stack<>();

      while(true){

         while(root != null){
            stack.push(root);
            root = root.left;
         }

         if(stack.isEmpty()){
            break;
         }

         root = stack.pop();
            System.out.print(root.data + " ");
            root = root.right;
      }
   }

   public static void main(String[] args) {
      Integer [] arr = {3,9,20,null,null,15,7};
      TreeNode root = new TreeNode();
      root = insertLevelOrder(arr, root, 0);
      inOrderRecursive(root);
      System.out.println();
      inOrderNonRecursive(root);

   }
}
