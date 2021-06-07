package graph;

import java.util.LinkedList;
import java.util.Stack;

import static graph.GenerateTree.insertLevelOrder;

public class PostOrder {
   public static void main(String[] args) {
//      Integer [] arr = {3,9,20,null,null,15,7};
      Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
      TreeNode root = new TreeNode();
      root = insertLevelOrder(arr, root, 0);
//      postOrderRecursive(root);
      System.out.println();
      postOrderTwoStack(root);
      System.out.println();
      postOrderOneStack1st(root);
      System.out.println();
      postOrderNonRecurTus(root);

   }

   static void postOrderRecursive(TreeNode root) {
      // LRD
      if (root == null) {
         return;
      }
      postOrderRecursive(root.left);
      postOrderRecursive(root.right);
      System.out.print(root.data + " ");
   }

   static void postOrderTwoStack(TreeNode root) {
      Stack<TreeNode> stack1 = new Stack<>();
      Stack<TreeNode> stack2 = new Stack<>();

      if (root == null)
         return;

      stack1.push(root);
      while (!stack1.isEmpty()) {
         TreeNode popped = stack1.pop();
         stack2.push(popped);

         if (popped.left != null)
            stack1.push(popped.left);

         if (popped.right != null)
            stack1.push(popped.right);
      }

      while (!stack2.isEmpty()) {
         TreeNode popped = stack2.pop();
         System.out.print(popped.data + " ");
      }
   }

   static void postOrderOneStack1st(TreeNode root) {
      TreeNode prev = null;
      Stack<TreeNode> stack = new Stack<>();
      stack.push(root);
      while (!stack.isEmpty()) {
         TreeNode current = stack.peek();

            /* go down the tree in search of a leaf an if so process it
            and pop stack otherwise move down */
         if (prev == null || prev.left == current || prev.right == current) {
            if (current.left != null)
               stack.push(current.left);
            else if (current.right != null)
               stack.push(current.right);
            else {
               stack.pop();
               System.out.print(current.data + " ");
            }

                /* go up the tree from left node, if the child is right
                   push it onto stack otherwise process parent and pop
                   stack */
         } else if (current.left == prev) {
            if (current.right != null)
               stack.push(current.right);
            else {

               stack.pop();
               System.out.print(current.data + " ");
            }

                /* go up the tree from right node and after coming back
                 from right node process parent and pop stack */
         } else if (current.right == prev) {

            stack.pop();
            System.out.print(current.data + " ");
         }

         prev = current;
      }
   }

   static void postOrderNonRecursive(TreeNode root) {
      if (root == null) {
         return;
      }

      Stack<TreeNode> stack = new Stack<>();
      TreeNode current = root;
      while (true) {
         if (stack.isEmpty() && current == null) {
            break;
         }
         while (current != null) {
            stack.push(current);
            current = current.left;

         }
         TreeNode popped = null;
         // now check if the top of stack has right child or not
         if (stack.peek().right == null) {
            // as both left and right are null so it is a leaf node
            popped = stack.pop();
            System.out.println(popped.data);
         } else {

         }

         // now check if the popped element is right of the top of stack
         if (stack.peek().right == popped) {
            // that means popped element is the right child
            popped = stack.pop();
            System.out.println(popped.data);
            if (stack.peek().right != null) {
               current = stack.peek().right;
            }
         } else {
            // top of stack may have right child so we need to traverse that
            // now check if the top value has the right child or not
            // stack top has got right element
            current = stack.peek().right;
         }

         System.out.println();
      }
   }

   static void postOrderNonRecurTus(TreeNode root){
      TreeNode current = root;
      Stack<TreeNode> stack = new Stack<>();
      while (current != null || !stack.isEmpty()){
         if(current != null){
            stack.push(current);
            current = current.left;
         }else {
            TreeNode temp = stack.peek().right;
            if(temp == null){
               temp = stack.pop();
               System.out.print(temp.data+ " ");

               while (!stack.isEmpty() && temp == stack.peek().right){
                  temp = stack.pop();
                  System.out.print(temp.data+ " ");
               }
            }else {
               current = temp;
            }
         }
      }
   }
}
