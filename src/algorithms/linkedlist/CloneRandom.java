package algorithms.linkedlist;

public class CloneRandom {

   public static void main(String[] args) {
      RandomNode node1 = new RandomNode(1);
      RandomNode node2 = new RandomNode(2);
      RandomNode node3 = new RandomNode(3);
      RandomNode node4 = new RandomNode(4);
      RandomNode node5 = new RandomNode(5);


      node1.next = node2;
      node1.random = node3;
      node2.next = node3;
      node2.random = node5;

      node3.next = node4;
      node3.random = node2;
      node4.next = node5;
      node5.next = null;
      node5.random = node1;

      clone(node1);
   }

   static void clone(RandomNode head) {
      traverse(head);
      RandomNode temp = new RandomNode();
      RandomNode temp3 = null;
      int i = 0;
      while (head != null) {
         RandomNode temp1 = new RandomNode(head.val);
         temp1.random = head.random;
         temp1.next = head.next;

         head = head.next;

         if (i == 0) {
            temp = temp1;
            temp3 = temp; // this will store the origin or random node
            i++;
         } else {
            temp.next = temp1;
            temp = temp.next;
         }

      }

      RandomNode temp2 = temp3;

      traverse(temp2);

   }

   public static void traverse(RandomNode head) {
      // traverse the linked list
      while (head != null) {
         // print current node data and random pointer data
         if (head.random != null) {
            System.out.print(head.val + "(" + head.random.val + ") —> ");
         } else {
            System.out.print(head.val + "(" + "X" + ") —> ");
         }

         // advance to the next node
         head = head.next;
      }

      System.out.println("null");
   }
}
