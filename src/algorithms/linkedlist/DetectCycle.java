package algorithms.linkedlist;

public class DetectCycle {
   public static void main(String[] args) {

      Node head = new Node(1);
      Node head1 = new Node(2);
      Node head2 = new Node(3);
      Node head3 = new Node(4);
      Node head4 = new Node(5);

      head.next = head1;
      head1.next = head2;
      head2.next = head3;
      head3.next = head4;

      head4.next = head2;

      System.out.println(cycleExists(head));
//      breakCycle(head);
   }

   static boolean cycleExists(Node head){

      Node slow = head;
      Node fast = slow.next;

      while (fast!=null){

         if(slow == fast)
            return true;

         fast = fast.next;
         if(fast!=null){
            fast = fast.next;
            slow = slow.next;
         }
      }

      return false;
   }

   static void breakCycle(Node head){

      Node slow = head;
      Node fast = slow.next;

      while (fast!=null){

         if(fast.next != null && slow!=null && slow.next == fast.next.next){
            fast.next.next = null;
            break;
         }

         fast = fast.next;
         if(fast!=null){
            fast = fast.next;
            slow = slow.next;
         }
      }

      head.printLL(head);
   }
}
