package lineardatastructure.arra;

public class Kadane {

   public static void main(String[] args) {
      int [] nums = {-2,8,-5,5,1,-6,-8,0,5};
      System.out.println(maxSubArray(nums));
      System.out.println(maxArray2(nums));

   }

   public static int maxSubArray(int[] nums) {
      int temp = 0;
      int max = Integer.MIN_VALUE;
      for(int i = 0; i<nums.length; i++){
         temp += nums[i];
         max = Math.max(max, temp);
         if(temp<0) temp = 0;
      }
      return max;
   }
static int maxArray2(int [] nums){
   int meh = 0;
   int msf = Integer.MIN_VALUE;
   for(int i: nums){

      meh = meh + i;
      if(meh < i)
         meh =i;

      if(msf < meh)
         msf = meh;
   }

   return msf;
}
}
