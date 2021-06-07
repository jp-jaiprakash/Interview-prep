package graph;

public class GenerateTree {
   public static TreeNode insertLevelOrder(Integer[] arr, TreeNode root, Integer i) {
      if (i < arr.length) {
         TreeNode temp = new TreeNode(arr[i], null, null);
         root = arr[i] == null ? null : temp;

         if (root != null) {

            root.left = insertLevelOrder(arr, root.left, 2 * i + 1);

            root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
         }
      }
      return root;
   }

   static TreeNode generatedRoot(){
      Integer[] arr = {1, 2, 3, 4, 5, null, 7, null,null,6,null,null,null,null,8};
      TreeNode root = new TreeNode();
      root = insertLevelOrder(arr, root, 0);
      return root;
   }

   static TreeNode generatedRootFull(){
      Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
      TreeNode root = new TreeNode();
      root = insertLevelOrder(arr, root, 0);
      return root;
   }
}
