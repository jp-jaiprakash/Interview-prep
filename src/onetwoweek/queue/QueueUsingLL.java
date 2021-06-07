package onetwoweek.queue;

import onetwoweek.linkedlist.ListNode;

public class QueueUsingLL {

   ListNode head;
   ListNode origin;

   public QueueUsingLL(){
//      head = new ListNode();
      origin = new ListNode();
   }

   public void enQueue(int data) {
      if (head == null) {
         head = new ListNode(data);
         origin = head;
      } else {
      ListNode temp = new ListNode(data);
      head.next = temp;
      head = head.next;
   }
   }

   public Object deQueue(){
      if(origin == null)
      {
         head = null;
         return "EMPTY___";}
      int val = origin.val;
      origin = origin.next;
      return val;
   }
}
