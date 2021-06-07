package onetwoweek.array;

// insert
// delete
// heapify

import java.util.Arrays;

class heap{
   private int [] arr;
   private int cnt;
   /**
    * root - i
    * left - 2i+1
    * right - 2i+2
    *
    * 4 => 1 ==> 4-2 / 2
    * 3 => 1 ==> 3 -1 /2
    *
    *
    */

   public heap(int [] arr){
      this.arr = new int [arr.length];
      for (int i: arr){
         insert(i);
      }
      Arrays.stream(this.arr).forEach(x-> System.out.print(x+","));
      System.out.println();
   }

   void insert(int element){
      arr[cnt] = element;
      heapify();
      cnt++;
   }

   void remove(){
      if(cnt>0)
         heapifyDown();
   }

   void sort(){
      for (int i: arr){
         cnt--;
         remove();
      }
      System.out.println("*********** After sorting *********");
      Arrays.stream(arr).forEach(x-> System.out.print(x+","));
   }

   void heapifyDown(){
      if(cnt==1)
         return;
      int temp = arr[cnt];
      arr[cnt]= arr[0];
      arr[0] = temp;

      int i =0;


      int left = 0;
      int right = 0;
      while (2*i < cnt && left < cnt && right < cnt && i < cnt){
         left = 2*i +1;
         right = 2*i + 2;
         int idx=i;
         if(left < cnt && right < cnt && arr[left] < arr[right] && arr[right] > temp){
            temp = arr[right];
            arr[right] = arr[i];
            arr[i] = temp;

            idx=right;
         }else if(left < cnt && right < cnt && arr[right] < arr[left] && arr[left] > temp){
            temp = arr[left];
            arr[left] = arr[i];
            arr[i] = temp;

            idx=left;
         }

         i = idx;

      }
//      rootElement = currEle % 2 == 0 ? (currEle -2)/2 : (currEle -1)/2;
   }
   void heapify(){
      int rootElement ;
      int currEle = cnt;

      rootElement = currEle % 2 == 0 ? (currEle -2)/2 : (currEle -1)/2;
      while(rootElement >= 0 && currEle >= 0 && arr[rootElement] < arr[currEle]){
         int temp = arr[currEle];
         arr[currEle]= arr[rootElement];
         arr[rootElement] = temp;

         currEle = rootElement;
         rootElement = currEle % 2 == 0 ? (currEle -2)/2 : (currEle -1)/2;

      }

   }

}
public class HeapSorting {


   public static void main(String[] args) {
      int [] arr = {2,1,3,40,9,5,10,20,15,4};
      heap h = new heap(arr);
      h.sort();
//      System.out.println("*******");
//      System.out.println(h.remove());
//      System.out.println("*******");
//      System.out.println(h.remove());
//      System.out.println("*******");
//      System.out.println(h.remove());
//      System.out.println("*******");
//      System.out.println(h.remove());
   }
}
