package onetwoweek.linkedlist;

public class Reorder {

   public static void main(String[] args) {
      ListNode ll = new ListNode();
      ListNode head = ll.initialize();
      ll.printLL(head);

      ListNode origin = head;
      Reorder order = new Reorder();
      head = order.reorderList(head);
      ll.printLL(head);
      ListNode reverse = order.reverseIt(head.next);
      ll.printLL(reverse);

      head.next = null;
      ListNode ori1 = origin;
      while (origin != null && reverse != null) {
         ListNode temp = origin.next;
         ListNode temp1 = reverse.next;

         origin.next = reverse;
         reverse.next = temp;

         origin = temp;
         reverse = temp1;

      }
      ll.printLL(ori1);

//      GenerateLL llgen = new GenerateLL();
//      head = llgen.reverseKGroup(head, 3);
//      ll.printLL(origin);
   }

   public ListNode reorderList(ListNode head) {
      ListNode slow = head;
      ListNode fast = head.next;

      while (fast != null && fast.next != null) {
         slow = slow.next;
         fast = fast.next.next;
      }
      return slow;
   }

   public ListNode reverseIt(ListNode head) {
      ListNode prev = null;
      ListNode next = null;
      ListNode curr = head;

      while (curr != null) {
         next = curr.next;
         curr.next = prev;
         prev = curr;
         curr = next;
      }
      return prev;
   }
}
