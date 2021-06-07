package Linkedlist;

public class MergeUsingLinkedlist {

   Node head = null;

   static class Node {
      int data;
      Node next;

      public Node(int data){
         this.data = data;

      }
   }

   Node sortedmerge(Node a, Node b){
      Node result = null;
//Base cases
      if(a==null)
         return b;

      if(b==null)
         return a;

      if(a.data <= b.data){
         result = a;
         result.next= sortedmerge(a.next, b);
      }else{
         result = b;
         result.next = sortedmerge(a, b.next);
      }
      return result;
   }

   Node mergeSort(Node head){
      Node middleNode = getMiddle(head);
      Node newLL = middleNode.next;
      middleNode.next = null;

      Node left = mergeSort(middleNode);
      Node right = mergeSort(newLL);

      return sortedmerge(left, right);


   }

   Node getMiddle(Node head){
      if(head == null || head.next==null)
         return head;
      Node slow=head;
      Node fast =head;

      while(fast!=null && fast.next !=null ){
         slow = slow.next;
         fast = fast.next!=null ? fast.next.next : null;
      }
      return slow;
   }
    void push(int data){
      Node new_node = new Node(data);
      new_node.next = head;
      head.next = new_node;
   }

   class LList{

   }
}
