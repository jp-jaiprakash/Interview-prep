package onetwoweek.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CommonProblems {

   public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();
      tree = tree.generateTree(new int[]{1, 2, 3, 4, 5, 6, 7}, tree, 0);

      System.out.println(sizeOfBT(tree));
      System.out.println();
      printLevelWise(tree);
      System.out.println();
      printReverse(tree);

      getSum(tree);
      System.out.println();
      printReverse(tree);
   }

   static int sizeOfBT(BinaryTree tree) {
      if (tree == null)
         return 0;

      return sizeOfBT(tree.getLeft()) + 1 + sizeOfBT(tree.getRight());
   }

   static void printLevelWise(BinaryTree tree) {
      if (tree == null)
         return;

      Queue<BinaryTree> queue = new LinkedList();
      queue.add(tree);
      while (!queue.isEmpty()) {
         BinaryTree temp = queue.poll();
         System.out.print(temp.getData() + " ");
         if (temp.getLeft() != null)
            queue.add(temp.getLeft());

         if (temp.getRight() != null)
            queue.add(temp.getRight());
      }
   }

   static void printReverse(BinaryTree tree) {
      if (tree == null)
         return;

      Queue<BinaryTree> queue = new LinkedList();
      queue.add(tree);
      Stack<BinaryTree> stack = new Stack<>();

      while (!queue.isEmpty()){
         BinaryTree temp = queue.poll();
         if (temp.getRight() != null)
            queue.add(temp.getRight());

         if (temp.getLeft() != null)
            queue.add(temp.getLeft());

         stack.push(temp);
      }



      while (!stack.isEmpty()) {
         BinaryTree temp = stack.pop();
            System.out.print(temp.getData() + " ");



      }



   }

   static int  getSum(BinaryTree tree){
      if(tree == null  )
         return 0;

      if((tree.getLeft()==null && tree.getRight()==null))
         return tree.getData();

      tree.setData(getSum(tree.getRight()) + getSum(tree.getLeft()));
      return tree.getData();
   }
}
