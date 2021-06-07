package algorithms.linkedlist;

public class Node {
   public int val;
   public Node next;

   public Node() {
   }

   public Node(int val) {
      this.val = val;
   }

   Node(int val, Node next) {
      this.val = val;
      this.next = next;
   }


   Node initialize() {
      int[] arr = {1, 2, 3, 4,5,6,7,8};
      Node head = new Node(arr[0]);
      Node refHead = head;
      for (int i = 1; i < arr.length; i++) {
         Node head1 = new Node(arr[i]);
         head1.next = null;
         head.next = head1;
         head = head1;
      }

      return refHead;
   }

   Node initialize(int [] arr) {
      Node head = new Node(arr[0]);
      Node refHead = head;
      for (int i = 1; i < arr.length; i++) {
         Node head1 = new Node(arr[i]);
         head1.next = null;
         head.next = head1;
         head = head1;
      }

      return refHead;
   }

   void printLL(Node head) {
      while (head != null) {
         System.out.print(head.val + "->");
         head = head.next;
      }
      System.out.println();
   }

   Node reverseLL(Node head){
      Node curr = head;
      Node prev = null;
      Node next = null;

      while (curr !=null){
         next = curr.next;
         curr.next = prev;
         prev = curr;
         curr = next;
      }
      return prev;
   }
}