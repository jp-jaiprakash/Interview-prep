package onetwoweek.trees;

import java.util.HashSet;
import java.util.Stack;

public class NonRecursivePostOrder {

   void postOrderNonRecursive(BinaryTree tree){

      HashSet<BinaryTree> visited = new HashSet<>();
      BinaryTree temp = tree;

      while (temp != null && !visited.contains(temp)){

         if( temp.getLeft() != null && !visited.contains(temp.getLeft())){
            temp = temp.getLeft();
         }else if( temp.getRight() != null && !visited.contains(temp.getRight())){
            temp = temp.getRight();
         }else {
            System.out.print(temp.getData()+" -> ");
            visited.add(temp);
            temp = tree;
         }
      }


   }
}
