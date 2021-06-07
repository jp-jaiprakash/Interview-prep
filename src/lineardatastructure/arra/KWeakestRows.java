package lineardatastructure.arra;

import java.util.HashMap;
import java.util.Map;

public class KWeakestRows {
   public static void main(String[] args) {
      int [][] arr = {
              {1,1,0,0,0},
              {1,1,1,1,0},
              {1,0,0,0,0},
              {1,1,0,0,0},
              {1,1,1,1,1}
      };
int [] ans = kWeakestRows(arr,3);
for(int j: ans){
   System.out.println(j);

}
   }
   public static int[] kWeakestRows(int[][] mat, int k) {
      int [] ans = new int[k];
      int [] ans1 = new int[mat.length];

      Map<Integer, Integer> map = new HashMap<>();
      int min = Integer.MAX_VALUE;
      for(int i=0; i< mat.length; i++){
         int no=0;

         for(int j=0; j<mat[i].length;j++){
            if(mat[i][j]==1){
               no++;
            }
         }
         map.put(i, no);
         ans1[i]= no;
         if(no<min){
            min=no;
            ans[0] = i;
         }

      }
      int z =1;
      for(int i=0; i< ans1.length && z<=k; i++){
         ans[z] = ans1[i];

         if(i>0 && ans[z] > ans[z-1]){
            
         }
         if(ans1[i] <= min && i!= ans[0]){
            ans[z] = ans1[i];
            z++;
         }
      }
      return ans;
   }
}
