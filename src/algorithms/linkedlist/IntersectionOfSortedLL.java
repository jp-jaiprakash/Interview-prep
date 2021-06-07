package algorithms.linkedlist;

public class IntersectionOfSortedLL {

   public static void main(String[] args) {
      Node node = new Node();
      int[] arr1 = new int[]{5, 6, 8, 10, 12, 13, 14};
      int[] arr2 = new int[]{3, 4, 6, 8, 10, 14};
      Node ll1 = node.initialize(arr1);
      Node ll2 = node.initialize(arr2);

      Node head = intersection(ll1, ll2);
      node.printLL(head);
   }

   /**
    * Find the first common element
    *    while iterating if head1.val > head2.val => move head2 ptr
    *
    * If anyone of them become null return
    *
    * Iterate through the array and find new common elements
    *
    *
    * @param head1
    * @param head2
    * @return
    */
   static Node intersection(Node head1, Node head2) {
      Node ans = new Node();
      Node origin = ans;

      while (head1.next != null && head2.next != null) {
         if (head1.val > head2.val)
            head2 = head2.next;
         if (head1.val < head2.val)
            head1 = head1.next;


         if (head1.val == head2.val) {
            Node temp = new Node(head2.val);
            temp.next = null;
            ans.next = temp;

            ans = temp;

            head1 = head1.next;
            head2 = head2.next;
         }
      }
      if (head1.next == null) {
         int val = head1.val;
         while (head2 != null) {
            if (head2.val == val) {
               Node temp = new Node(val);
               temp.next = null;
               ans.next = temp;
               break;
            }
            head2 = head2.next;
         }
      } else {
         int val = head2.val;
         while (head1 != null) {
            if (head1.val == val) {
               Node temp = new Node(val);
               temp.next = null;
               ans.next = temp;
               break;
            }
            head1 = head1.next;
         }
      }


      return origin.next;
   }
}
