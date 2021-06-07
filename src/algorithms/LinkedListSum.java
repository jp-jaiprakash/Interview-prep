//package algorithms;
//
//import algorithms.linkedlist.Node;
//
//public class LinkedListSum {
//
//
//   /**
//    * 1-2-3
//    * 9-9-9-0
//    * @param head1
//    * @param head2
//    * @return
//    */
//   Node addTwoNums(Node head1, Node head2){
//
//      Node ans = new Node();
//      int carry =0;
//
//      Node temnp1 = ans;
//
//      while(head1!=null && head2!=null){
//         int sum = head1.val + head2.val + carry;
//         int val = (carry + sum) % 10;
//         carry = sum/10;
//
//
//         Node temp = new Node(val);
//         ans.next = temp;
//         ans = ans.next;
//
//         head1 = head1.next;
//         head2 = head2.next;
//
//      }
//
//      while (head1!=null){
//
//         int sum = head1.val + carry;
//         int val = (carry + sum) % 10;
//         carry = sum/10;
//
//         Node temp = new Node(val);
//         ans.next = temp;
//         ans = ans.next;
//         head1 = head1.next;
//      }
//
//
//      while (head2!=null){
//         int sum = head2.val + carry;
//         int val = (carry + sum) % 10;
//         carry = sum/10;
//
//         Node temp = new Node(val);
//         ans.next = temp;
//         ans = ans.next;
//         head2 = head2.next;
//      }
//
//      return temnp1.next;
//   }
//
//
//   // rotateted array
//   /**
//    * 3,4,5,6,1,2
//    *
//    * 4
//    *
//    * 3 4 5 6 7 8-- 9 10 --11 1 2
//    */
//
//   int getRotatedIndex(int [] arr){
//
//      int idx=0;
//      // O(n)
//      for(int i=0; i< arr.length-1; i++){
//         if(arr[i] > arr[i+1]){
//            idx= i;
//         }
//      }
//
//      return idx;
//   }
//
//   // 3 4 5 6 7 8-- 9 10 --11 1 2
//   int getRotatedIndexBinary(int [] arr, int low, int high){
//
//      if(low> high)
//         return 0;
//
//      int mid = (low + high)/2;
//      //m-1, m-2
//      if(mid > 2 && arr[mid-1] > arr[mid-2]){
//
//      }else{
//         return getRotatedIndexBinary(arr, mid, high);
//      }
//
//   }
//
//
//}
