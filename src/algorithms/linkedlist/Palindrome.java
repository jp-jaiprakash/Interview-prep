package algorithms.linkedlist;

public class Palindrome {
   public static void main(String[] args) {
      Node ll= new Node();
      Node node1 = ll.initialize(new int[]{1,2,3,2,1});
      Node node2 = ll.initialize(new int[]{1,2,3,8,9,10,3,2,1});
      System.out.println("For LL1::"+isPalindrome(node1));
      System.out.println("For LL2::"+isPalindrome(node2));
   }

   static boolean isPalindrome(Node head){
      Node fast = head;
      Node temp = head;
      while (fast!=null && fast.next!=null){
         head = head.next;
         fast = fast.next.next;
      }
      head = reverse(head);

      head.printLL(head);

      while (head!=null){
         if(temp.val != head.val)
         {
            return false;
         }
         temp = temp.next;
         head = head.next;
      }
      return true;
   }

   static Node reverse(Node head){
      Node prev = null;
      Node curr= head;
      Node next = null;

      while(curr!=null){
         next = curr.next;
         curr.next=prev;
         prev = curr;
         curr = next;
      }

      return prev;
   }
}
