package onetwoweek.linkedlist;

public class GenerateLL {

   public static void main(String[] args) {
      ListNode ll = new ListNode();
      ListNode head = ll.initialize();
      ll.printLL(head);
      GenerateLL llgen = new GenerateLL();
      head = llgen.reverseKGroup(head, 3);
      ll.printLL(head);
   }

   public ListNode reverseKGroup(ListNode head, int k) {
      if (head == null || k < 1)
         return head;
      ListNode refHead = head;
      int cnt = 0;


      ListNode prev = null;
      ListNode next = null;
      ListNode curr = head;
      int i = 0;
      ListNode temp = head;
      while (i< k && temp != null) {
         temp = temp.next;
         i++;
      }
      if (i % k == 0) {
         while (cnt < k && curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
            cnt++;
         }

         // next will point to K+1 term
         if (next != null)
            head.next = reverseKGroup(next, k);


         return prev;
      }
      return head;
   }

   public ListNode reverseIt(ListNode head, ListNode dest) {
      ListNode prev = null;
      ListNode curr = head;
      ListNode next = null;
      while (curr != dest) {
         next = curr.next;
         curr.next = prev;
         prev = curr;
         curr = next;
      }
      return prev;
   }
}
