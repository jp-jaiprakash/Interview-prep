package algorithms.linkedlist;

/**
 *
 */
public class KFromLast {

   public static void main(String[] args) {
      Node node = new Node();
      Node head = node.initialize();
      node.printLL(head);
      kFromEnd(head,4);
   }

   static void kFromEnd(Node head, int k){
      Node temp = head;
      while (k >0){
         temp = temp.next;
         k--;
      }

      while (temp != null){
         head = head.next;
         temp = temp.next;
      }

      System.out.println(head.val);
   }
}
