package algorithms.linkedlist;

public class MergeSortLL {

   public static void main(String[] args) {
      Node node = new Node();
      int[] arr1 = new int[]{2,4,6,8};
//      int[] arr1 = new int[]{5,1, 6,4, 8, 7,10, 12, 13, 14};
      Node ll1 = node.initialize(arr1);
      int[] arr2 = new int[]{1,3,5};
//      int[] arr2 = new int[]{3, 4, 6, 8, 10, 14};
      Node ll2 = node.initialize(arr2);

      Node n1 = merge(ll1, ll2);
      node.printLL(n1);

   }

   static void sort(Node head){

      if(head==null ||  head.next==null)
         return;

      Node fast = head;

      while (fast!=null){
         fast=fast.next;
         if(fast!=null){
            fast=fast.next;
            head = head.next;
         }
      }
   }

   static Node merge(Node a, Node b){
      Node origin = new Node();
      Node temp = origin;
      while(a!=null && b!= null){
         if(a.val < b.val){
            origin.next = a;
            a= a.next;
         }else{
            origin.next = b;
            b = b.next;
         }
         origin = origin.next;
      }

      while (a!=null){
         origin.next = a;
         a= a.next;
         origin = origin.next;
      }
      while (b!=null){
         origin.next = b;
         b= b.next;
         origin = origin.next;
      }

      return temp.next;
   }

}
