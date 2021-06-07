package onetwoweek.array;

public class MooreVoting {
   public static void main(String[] args) {

      int [] arr = {2,2,2,3,4,5};
      System.out.println(getWinner(arr));
   }
   static Integer getWinner(int [] arr){
      int winner = arr[0];
      int count =1;

      for(int i =1; i< arr.length; i++){
         if(winner == arr[i])
            count++;
         else
            count--;

         if(count==0)
            winner=arr[i];
      }

      return count > 0 ? winner : null;
   }
}
