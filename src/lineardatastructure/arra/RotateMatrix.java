package lineardatastructure.arra;

public class RotateMatrix {
   public static void main(String[] args) {
       int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       revMatrix(matrix);
       int n = matrix.length;
       for(int i = 0; i < n; i++){
           for(int j = 0; j < n; j++){
               System.out.print(matrix[i][j]+",");
           }
           System.out.println();
       }
   }
   private static void revMatrix(int[][] matrix){
       int n = matrix.length;
       for(int i = 0; i<n; i++){
           for(int j = i; j<n; j++){
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
           }
       }
       for(int i = 0; i < n; i++){
           int start = 0;
           int end = n-1;
           while(start < end){
               int temp = matrix[i][start];
               matrix[i][start] = matrix[i][end];
               matrix[i][end] = temp;
               start++;
               end--;
           }
       }
   }
}
