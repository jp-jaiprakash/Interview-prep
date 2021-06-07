package algorithms.slidingWindow;

public class MimimumSizeSubArraySum {

   public int minSubArrayLen(int sum, int[] nums){
      if(nums == null || nums.length == 0)
         return 0;

      int left=0, right =0, runningSum =0, ans = Integer.MAX_VALUE;

      for(right = 0; right < nums.length; right++){
         runningSum += nums[right];
         while (runningSum >=sum){
            ans = Math.min(ans, right-left + 1);
            runningSum -=nums[left++];
         }
      }
      return (ans != Integer.MAX_VALUE) ? ans : 0;
   }

   public static void main(String[] args) {
      MimimumSizeSubArraySum min = new MimimumSizeSubArraySum();

      System.out.println(min.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
   }
}
