package onetwoweek.array;

/**
 * ask question is it greater than or equal to
 */
public class Nbythreerepeat {

   public static void main(String[] args) {
      int [] arr = {2,1,3,1,5,2};
      System.out.println(getWinner(arr));
   }

   static Integer getWinner(int [] arr){
      if(arr.length < 3)
         return arr[0];
      int winner1 = Integer.MAX_VALUE;
      int winner2 = Integer.MAX_VALUE;
      int count1 =0;
      int count2=0;

      for(int i =0; i< arr.length; i++){
         if(winner1 == arr[i])
            count1++;
         else if(winner2 == arr[i])
            count2++;
         else if(count1==0){
            winner1=arr[i];
            count1++;
         }
         else if(count2==0){
            winner2=arr[i];
            count2++;
         }
         else {
            count1--;
            count2--;
            winner1=arr[i];
         }
      }

      count1=0;
      count2=0;
      for(int i: arr){
         if(i==winner1)
            count1++;
         else if(i==winner2)
            count2++;
      }
      return count1 >= arr.length/3 ? winner1 : count2 >= arr.length/3 ? winner2 : -1;
   }
}
