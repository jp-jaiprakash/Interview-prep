package onetwoweek.array;

public class Searching {

   public static void main(String[] args) {
      int[] arr = {1, 6, 9, 12, 18, 45, 90};
      System.out.println("Found at::" + binarySearch(arr, 18, 0, arr.length));
      System.out.println("Found at::" + binarySearch(arr, 1, 0, arr.length));
      System.out.println("Found at::" + binarySearch(arr, 90, 0, arr.length));
      System.out.println("Found at::" + binarySearch(arr, 100, 0, arr.length));

   }

   static int binarySearch(int[] arr, int key, int low, int high) {
      if (arr.length == 0 || (arr.length == 1 && arr[0] != key))
         return -1;

      int mid = (low + high) / 2;
      if (low < high) {
         if (arr[mid] == key)
            return mid;
         else if (arr[mid] < key)
            return binarySearch(arr, key, mid + 1, high);
         else
            return binarySearch(arr, key, low, mid);
      }
      return -1;

   }
}
