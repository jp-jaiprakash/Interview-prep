package algorithms.linkedlist;

public class MergeKSorted {


   static Node mergeSorted(Node a, Node b){
      if(a==null)
         return b;
      if(b==null)
         return a;

      Node result;

      if(a.val < b.val){
         result = a;
         result.next = mergeSorted(a.next, b);
      }else{
         result = b;
         result.next = mergeSorted(b.next, a);
      }

      return result;
   }

   static Node mergeKSorted(Node[] nodes){

      int k = nodes.length;
      int last = k;

      while (last!=0){
         int i =0, j=k-1;

         while (i<j){
            nodes[i] = mergeSorted(nodes[i], nodes[j]);

            i++;
            j--;

            if(i>=j)
               last = j;
         }

      }
return nodes[0];
   }
}
