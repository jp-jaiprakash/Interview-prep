package algorithms;

import java.util.Scanner;

public class Armchair {

   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//
//      int noOfChairs = sc.nextInt();
//      int arr[] = new int[noOfChairs];
//
//      for(int i = 0; i< noOfChairs; i++){
//         arr[i] = sc.nextInt();
//      }
int [] arr = new int[]{1,0,1,1,0,0};
      System.out.println(findNumberOfMoves(arr.length,  arr));
   }

   static int findNumberOfMoves(int noOfChairs, int [] arr){
      int i = noOfChairs -1; // ptr1 pointing to end
      int j = i-1; //
      int k = 0;
      boolean foundOne = false;
      boolean foundZero = false;
      int oneLoc = 0;
      int zeroLoc = 0;
      int sum =0;
      for(int x=0; x< noOfChairs; x++){
         if(arr[x] == 1){
            foundOne= true;
            oneLoc = x;
         }else if(arr[x] == 0){
            foundZero = true;
            zeroLoc = x;
         }

         if(foundOne && foundZero){
            sum +=Math.abs(oneLoc - zeroLoc);
            foundOne=false;
            foundZero=false;
         }
      }

return sum;
   }
}
