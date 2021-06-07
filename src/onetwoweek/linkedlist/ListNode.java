package onetwoweek.linkedlist;

public class ListNode {
   public int val;
   public ListNode next;

   public ListNode() {
   }

   public ListNode(int val) {
      this.val = val;
   }

   ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
   }


   ListNode initialize() {
      int[] arr = {1, 2, 3, 4,5,6,7};
      ListNode head = new ListNode(arr[0]);
      ListNode refHead = head;
      for (int i = 1; i < arr.length; i++) {
         ListNode head1 = new ListNode(arr[i]);
         head1.next = null;
         head.next = head1;
         head = head1;
      }

      return refHead;
   }

   ListNode initialize(int [] arr) {
      ListNode head = new ListNode(arr[0]);
      ListNode refHead = head;
      for (int i = 1; i < arr.length; i++) {
         ListNode head1 = new ListNode(arr[i]);
         head1.next = null;
         head.next = head1;
         head = head1;
      }

      return refHead;
   }

   void printLL(ListNode head) {
      while (head != null) {
         System.out.print(head.val + "->");
         head = head.next;
      }
      System.out.println();
   }

   ListNode reverseLL(ListNode head){
      ListNode curr = head;
      ListNode prev = null;
      ListNode next = null;

      while (curr !=null){
         next = curr.next;
         curr.next = prev;
         prev = curr;
         curr = next;
      }
      return prev;
   }
}