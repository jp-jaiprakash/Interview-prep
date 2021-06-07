package algorithms.linkedlist;

import onetwoweek.linkedlist.ListNode;

// 20 mins on own
public class ReverseKBlocks {
   public static void main(String[] args) {
      Node node = new Node();
      Node head = node.initialize();
      head = reverseKGroup(head, 3);
      head.printLL(head);
   }

//   static Node reverseK(Node head, int k){
//      Node origin = new Node();
//
//      if(head == null)
//         return head;
//
//      Node temp = head;
//      int j=0;
//      while (j<k-1){
//         temp = temp.next;
//         j++;
//      }
//      if(j < k-1)
//         return head;
//
//      origin = temp;
//
//      while (head!=null){
//          j =-0;
//          temp = head;
//          Node temp2= head;
//         Node prev = null;
//         Node next = null;
//          while (temp!=null && j<k-1){
//
//              next = temp.next;
//             temp.next = prev;
//             prev = temp;
//             temp = next;
//             j++;
//          }
//          // means we have enough nodes
//         // 5->6 but temp =8 lonely
//          if(temp!=null &&  j== k-1){
//             next = temp.next;
//             temp.next = prev;
//             temp2.next = next;
//          }
//
//      }
//
//      return origin;
//   }

   public static Node reverseKGroup(Node head, int k) {
      if (head == null || k < 1)
         return head;
      int cnt = 0;


      Node prev = null;
      Node next = null;
      Node curr = head;
      int i = 0;
      Node temp = head;
      /**
       * frst check if we have sufficient blocks or not
       *
       * if yes
       *    run the loop from beginning and reverse k elements
       *    after reversal
       *    prev will point to beginning of reversed LL
       *    next will be pointing to new element of new block but no connection to previous block
       *    head node received will be the last node of reversed LL
       *    so head.next = next but as it is reversing by blocks so call the same function with less elements of LL
       */
      while (i < k && temp != null) {
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
}
