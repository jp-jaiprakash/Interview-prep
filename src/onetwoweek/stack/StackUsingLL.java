package onetwoweek.stack;

import onetwoweek.linkedlist.ListNode;

public class StackUsingLL {

   ListNode topNode;

   public StackUsingLL(){
      topNode = null;
   }

   public void push(int val){
      ListNode temp = new ListNode(val);
      temp.next = topNode;
      topNode = temp;
   }

   public Object pop(){
     if(topNode == null)
        return "Empty";

     int data = topNode.val;
     topNode = topNode.next;
     return data;
   }

}
