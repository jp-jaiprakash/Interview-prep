package onetwoweek.array;

import java.util.Arrays;

public class SortingAlgo {

   public static void main(String[] args) {
      int[] arr = {12, 6, 18, 9, 45, 1, 90};
//      {12,6,18,9,45,1,90};
      insertion(arr);
      Arrays.stream(arr).forEach(x -> System.out.print(x + ","));
      arr = new int[]{12, 6, 18, 9, 45, 1, 90};
      System.out.println("************");
      quick(arr, 0, arr.length - 1);
      Arrays.stream(arr).forEach(x -> System.out.print(x + ","));

      arr = new int[]{12, 6, 18, 9, 45, 1, 90};
      System.out.println("************Merge sort");
      arr = new int[]{12, 6, 18, 9, 45, 1, 90};
      mergeSort(arr, 0, arr.length -1);
      Arrays.stream(arr).forEach(x -> System.out.print(x + ","));
   }

   static int[] insertion(int[] arr) {

      for (int i = 1; i < arr.length; ++i) {
         int j = i - 1;
         int key = arr[i];
         while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
         }
         arr[j + 1] = key;
      }

      return arr;
   }

   static void quick(int[] arr, int low, int high) {
      if (low >= high)
         return;
      int pIdx = partition(arr, low, high);
      quick(arr, low, pIdx - 1);
      quick(arr, pIdx + 1, high);


   }

   private static int partition(int[] arr, int low, int high) {

      int pivot = arr[high];
      int pidx = low;

      for (int i = low; i <= high - 1; i++) {
         if (arr[i] <= pivot) {
            int temp = arr[pidx];
            arr[pidx] = arr[i];
            arr[i] = temp;
            pidx++;
         }
      }

      int temp = arr[pidx];
      arr[pidx] = arr[high];
      arr[high] = temp;
      return pidx;
   }

   private static void mergeSort(int[] arr, int low, int high) {
      if (arr.length < 2)
         return;
      if (low < high) {
         int mid = (low + (high - 1)) / 2;
         mergeSort(arr, low, mid);
         mergeSort(arr, mid + 1, high);

         merge(arr, low, mid, high);


      }

   }

   private static void merge(int[] arr, int low, int mid, int high) {
      // Find size of two subarrays
      int n1 = mid - low + 1;
      int n2 = high - mid;

      // create two arrays
      int L1[] = new int[n1];
      int L2[] = new int[n2];

      // copy the array values
      for (int i = 0; i < n1; i++) {
         L1[i] = arr[low + i];
      }

      for (int j = 0; j < n2; j++) {
         L2[j] = arr[mid + 1 + j];
      }

      int i = 0, j = 0;
      int k = low;

      while (i < n1 && j < n2) {
         if (L1[i] <= L2[j]) {
            arr[k] = L1[i];
            i++;
         } else {
            arr[k] = L2[j];
            j++;
         }
         k++;
      }

      while (i < n1) {
         arr[k] = L1[i];
         i++;
         k++;
      }

      while (j < n2) {
         arr[k] = L2[j];
         j++;
         k++;
      }

   }

//   private static int [] genArray(int [] arr, int low, int high){
//      int [] arr1 = new int[high-low+1];
//      for(int i=0; i< arr1.length; i++){
//         arr1[i] = arr[low];
//         low++;
//      }
//   }
}
