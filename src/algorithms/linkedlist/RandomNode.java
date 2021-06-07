package algorithms.linkedlist;

public class RandomNode {

   int val;
   RandomNode next;
   RandomNode random;

   public RandomNode(int val, RandomNode next,
           RandomNode random){
      this.val = val;
      this.next = next;
      this.random = random;

   }

   public RandomNode(){

   }
   public RandomNode(int val){
      this.val = val;
      this.next = null;
      this.random = null;
   }

   public void printNode(RandomNode head){
      while (head!=null){
         System.out.print(head.val+"->");
         head = head.next;
      }
      System.out.println();
   }

}
