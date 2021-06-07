package algorithms.linkedlist;

public class ReverseRecursive {
   public static void main(String[] args) {
      Node node = new Node();
      Node head = node.initialize();
      head = recursive(head);
      node.printLL(head);
   }

   static Node recursive(Node head){

      if(head == null)
         return head;

      if(head.next == null)
         return head;

      Node newNode = recursive(head.next);
      head.next.next=head;
      head.next = null;

      return newNode;

   }
}
