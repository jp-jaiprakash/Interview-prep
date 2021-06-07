package onetwoweek.trees;

public class BinaryTree {

   private Integer data;
   private BinaryTree left;
   private BinaryTree right;

   public BinaryTree() {

   }

   public BinaryTree(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
   }

   public Integer getData() {
      return data;
   }

   public void setData(int data) {
      this.data = data;
   }

   public BinaryTree getLeft() {
      return left;
   }

   public void setLeft(BinaryTree left) {
      this.left = left;
   }

   public BinaryTree getRight() {
      return right;
   }

   public void setRight(BinaryTree right) {
      this.right = right;
   }

   public BinaryTree generateTree(int[] arr, BinaryTree head, int i) {
      if (arr.length == 0)
         return head;

      if (i < arr.length) {
         BinaryTree temp = new BinaryTree(arr[i]);
         head = temp;
         head.left = generateTree(arr, head.left, 2 * i + 1);
         head.right = generateTree(arr, head.right, 2 * i + 2);
      }
      return head;
   }
}
