package onetwoweek.linkedlist;

public class MergeSorted {
   public static void main(String[] args) {
      ListNode ll = new ListNode();

      ListNode head1 = ll.initialize(new int[]{1,6,8,17});
      ListNode head2 = ll.initialize(new int[]{2,3,9,11,12,13,15,20,22});

       head1= mergeSorted(head1, head2);

       ll.printLL(head1);
   }

   public static ListNode mergeSorted(ListNode head1, ListNode head2){

      if(head1 == null)
         return head2;

      if(head2 == null)
         return head1;

      ListNode temp1 = head1;
      ListNode temp2 = head2;
      if(head1.val> head2.val){
         temp1 = head2;
         temp2 = head1;

      }

      ListNode origin = temp1;

      while (temp1!=null && temp2!=null){

         while (temp1 != null && temp1.next!=null && temp1.next.val < temp2.val){
            temp1=temp1.next;

         }

         ListNode temp3 = temp1.next;

         temp1.next = temp2;

         while (temp3!=null && temp2 != null && temp2.next!=null && temp2.next.val < temp3.val)
            temp2=temp2.next;

         ListNode temp4 = temp2.next;


         temp2.next = temp3;
         temp2 = temp4;
         temp1 = temp3;

      }

      return origin;

   }
}
