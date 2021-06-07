package test;

public class MergeSort {

   public static void main(String[] args) {
      int [] arr = new int[]{5,1,9,12,3,90};
arr = merge(arr, 0, arr.length);
      System.out.println(arr);
   }

   // high = length
   static int [] merge(int [] arr, int low, int high){


      if(arr.length < 2 )
         return arr;

      if(low < high){
         int mid = (low+high)/2;

         int [] a = new int[mid - low];
         int [] b = new int[high - mid];
         int j =low;
         int k = mid;
         for(int i=0;i< a.length; i++){
            a[i] = arr[j];
            j++;
         }

         for(int i=0;i< b.length; i++){
            b[i] = arr[k];
            k++;
         }

         merge(arr, low, mid);
         merge(arr, mid, high);

         return merging(a,b);
      }
      return null;

   }

   private static int [] merging(int[] a, int[] b) {
      int i=0,j=0,k=0;
      int arr[]=new int[a.length+b.length];
      while (i< a.length && j <b.length){
         while(a[i]<b[j]){
            arr[k] = a[i];
            i++;
            k++;
         }

         while(b[j] < a[i]){
            arr[k] = b[j];
            j++;
            k++;
         }
      }

      while (i< a.length){
         arr[k] = a[i];
         k++;
         i++;
      }
      while (j< b.length){
         arr[k] = b[j];
         k++;
         j++;
      }

      return arr;
   }
}
