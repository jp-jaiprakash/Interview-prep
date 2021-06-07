package onetwoweek.queue;

import org.omg.CosNaming.BindingIterator;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {
   public static void main(String[] args) {
      int [] gas = new int[]{1,2,3,4,5};
      int [] cost = new int[]{3,4,5,1,2};


   }

   public int canCompleteCircuit(int[] gas, int[] cost) {

      int deficit=0, start=0,cal=0;
      for(int i=0;i<gas.length;i++){
         cal+=gas[i]-cost[i];
         if(cal<0){
            start=i+1;
            deficit+=cal;
            cal=0;
         }

      }
      return (cal+deficit)>=0 ? start :-1;

   }
}
