package onetwoweek.trees;

public class Traversals {

   public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();
      tree = tree.generateTree(new int[]{1,2,3,4,5,6,7}, tree, 0);
      preOrder(tree);
      System.out.println("********");
      inOrder(tree);
      System.out.println("***********");
      postOrder(tree);
      System.out.println("***********");
      NonRecursivePostOrder non = new NonRecursivePostOrder();
      non.postOrderNonRecursive(tree);
   }

   public static void preOrder(BinaryTree root){
      if(root == null)
         return;
      System.out.print(root.getData()+"->");
      preOrder(root.getLeft());
      preOrder(root.getRight());
   }

   public static void inOrder(BinaryTree root){
      if(root == null)
         return;
      inOrder(root.getLeft());
      System.out.print(root.getData()+"->");
      inOrder(root.getRight());
   }

   public static void postOrder(BinaryTree root){
      if(root == null)
         return;
      postOrder(root.getLeft());
      postOrder(root.getRight());
      System.out.print(root.getData()+"->");
   }

}
