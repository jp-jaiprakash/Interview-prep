package algorithms.tryExponent;

public class NumberFinder {
   public static void main(String[] args) {

      int [] arr = {200,200,200,200,200,500,500,500};
      System.out.println(finder(arr, arr.length, 0, 200));
   }

   static int finder(int [] arr, int high, int low, int num){
      int mid = (low + high)/2;

      if(mid == 0 && arr[0] == num)
         return mid;
      else if(mid == 0 && arr[0] != num)
         return -1;

      if(arr[mid] < num)
         return finder(arr, high,mid+1, num);
      else if (arr[mid] > num)
         return finder(arr, mid-1, low, num);
      else {
         if(arr[mid-1] != num)
            return mid;
         else
            return finder(arr, mid, low, num);
      }
   }
}
