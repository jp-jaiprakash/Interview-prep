package onetwoweek.array;

import java.util.Comparator;

public class Kadane {

   public static void main(String[] args) {
      int [] arr = {-2,-3,4,-1,-2,1,5,-3};
      System.out.println(kadaneAlgo(arr));
      Comparator<String> c = String::compareTo;
   }

   static int kadaneAlgo(int [] arr){
      int maxSofar= Integer.MIN_VALUE;
      int sumEndingHere = 0;

      for(int i: arr){
         sumEndingHere += i;
         if(sumEndingHere < i)
            sumEndingHere = i;

         if(maxSofar < sumEndingHere)
            maxSofar = sumEndingHere;
      }

      return maxSofar;
   }
}
