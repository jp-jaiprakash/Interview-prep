package onetwoweek.array;

public class TrappingWater {

   public static void main(String[] args) {
      int [] arr = {4,2,0,3,2,5};
      TrappingWater trappingWater = new TrappingWater();
      System.out.println(trappingWater.trap(arr));
   }
   public int trap(int[] height) {
      int [] leftMax = getLeftMax( height);
      int [] rightMax = getRightMax( height);

      int sum =0;
      for(int i=1; i< height.length -1 ; i++){
         int min = getMin(leftMax[i], rightMax[i]) - height[i];
         sum +=min> 0 ? min : 0;
      }
      return sum;
   }

   private int getMin(int leftMax, int rightMax) {

      return leftMax < rightMax ? leftMax : rightMax;
   }

   private int[] getRightMax(int[] height) {
      int [] rightMax = new int[height.length];
      int maxSofar =0;
      for(int i=height.length-2; i >0; i--){
         if(height[i+1] > maxSofar ){
           maxSofar = height[i+1];
         }
         rightMax[i] = maxSofar;
      }
      return rightMax;
   }

   private int[] getLeftMax(int[] height) {
      int [] leftMax = new int[height.length];
      int maxSofar =0;
      for(int i=1; i< height.length; i++){
         if(height[i-1] > maxSofar ){

            maxSofar = height[i-1];
         }

         leftMax[i] = maxSofar;
      }
      return leftMax;

   }
}
