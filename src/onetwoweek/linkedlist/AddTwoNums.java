package onetwoweek.linkedlist;

public class AddTwoNums {

   public static void main(String[] args) {
      ListNode ll = new ListNode();
      ListNode head1 = ll.initialize(new int[]{5, 6});
      ListNode head2 = ll.initialize(new int[]{8, 9,7});

      AddTwoNums addTwoNums = new AddTwoNums();
      head1 = addTwoNums.reverseIt(head1);
      head2 = addTwoNums.reverseIt(head2);
      ListNode origin = head1;
      int carry = 0;
      while (head1 != null && head2 != null) {
         int currSum = head1.val + head2.val;
         carry = (currSum) / 10;
         int currentSum = currSum % 10;
         head1.val = currentSum + carry;

         head1 = head1.next;
         head2 = head2.next;

      }

      while (head1 != null) {

         int currSum = head1.val + carry;
         carry = (currSum) / 10;
         int currentSum = currSum % 10;
         head1.val = currentSum + carry;

         head1 = head1.next;
      }
      while (head2 != null) {

         int currSum = head2.val + carry;
         carry = (currSum) / 10;
         int currentSum = currSum % 10;
         head1.val = currentSum + carry;

         head2 = head2.next;
      }
      ll.printLL(origin);
   }

   public ListNode reverseIt(ListNode head) {

      ListNode prev = null;
      ListNode curr = head;
      ListNode next = null;

      while (curr != null) {
         next = curr.next;

         curr.next = prev;
         prev = curr;
         curr = next;
      }
      return prev;
   }
}
