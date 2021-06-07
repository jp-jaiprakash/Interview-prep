package random;

import java.util.ArrayList;
import java.util.List;

public class Practice {

   public static void main(String[] args) {
//generateAllSubSets(new int[]{1,2,3,4});
List<String> lst = new ArrayList<>();
lst.add("aabba");
      lst.add("aaaca");
      lst.add("ababa");
//      System.out.println(strokesRequired(lst));
      findSubSets(new int [] {1,2,3});
   }

   public static List<List<Integer>> generateAllSubSets(int [] arr){
      List<List<Integer>> result = new ArrayList<>();
      boolean [] visited = new boolean[arr.length];
      for(int i=0; i< arr.length; i++)
         subsetDFS(arr, result, new ArrayList<>(), visited, i);
      System.out.println(result);
      return result;
   }

   private static void subsetDFS(int[] arr, List<List<Integer>> result, ArrayList<Object> singleLst, boolean[] visited, int idx) {

      if(idx == arr.length)
         return;

      if(!visited[idx]){
         visited[idx] = true;
         singleLst.add(arr[idx]);
         result.add(new ArrayList(singleLst));
         subsetDFS(arr,result, singleLst, visited, idx+1);
      }

      visited[idx] = false;
      singleLst.remove(singleLst.size()-1);


   }

   public static int strokesRequired(List<String> picture) {
      // Write your code here
      int result =0;
      int n = picture.size();
      for(int i=0; i< n; i++){
         String s = picture.get(i);
         int m = s.length();
         int j=0;
         StringBuilder sb = new StringBuilder(s);
         char ch[] = s.toCharArray();

         for(int k=0; k< ch.length-1; k++){
            if(ch[k] == ch[k+1]){
               result++;
               dfs(picture,n, m, i,j,s, ch, ch[k]);
            }
         }
      }

      return result;
   }

   static void dfs(List<String> picture,int rowlen, int collen,  int i, int j,String str,  char [] s, char c){
      if(i <=0 || j>= collen-1 || i >= rowlen-1 || j<= 0 || s[j] != c){
         return;
      }
s= str.toCharArray();


      dfs(picture,rowlen, collen, i+1,j, picture.get(i+1), s,c);
      dfs(picture,rowlen, collen, i-1,j, picture.get(i-1),s, c);
      dfs(picture,rowlen, collen, i,j+1, picture.get(i),s, c);
      dfs(picture,rowlen, collen, i,j-1, picture.get(i),s, c);


   }

   static int findElement(int arr[], int n)
   {
      // Forming prefix sum array from 0
      int[] prefixSum = new int[n];
      prefixSum[0] = arr[0];
      for (int i = 1; i < n; i++)
         prefixSum[i] = prefixSum[i - 1] + arr[i];

      // Forming suffix sum array from n-1
      int[] suffixSum = new int[n];
      suffixSum[n - 1] = arr[n - 1];
      for (int i = n - 2; i >= 0; i--)
         suffixSum[i] = suffixSum[i + 1] + arr[i];

      // Find the point where prefix and suffix
      // sums are same.
      for (int i = 1; i < n - 1; i++)
         if (prefixSum[i] == suffixSum[i])
            return arr[i];

      return -1;
   }

   static int balancedSum(List<Integer> arr){
      int[] prefixSum = new int[arr.size()];
      prefixSum[0] = arr.get(0);
      int n = arr.size();
      for (int i = 1; i < n; i++)
         prefixSum[i] = prefixSum[i - 1] + arr.get(i);

      int[] suffixSum = new int[n];
      suffixSum[n - 1] = arr.get(n-1);
      for (int i = n - 2; i >= 0; i--)
         suffixSum[i] = suffixSum[i + 1] + arr.get(i);

      for (int i = 1; i < n - 1; i++)
         if (prefixSum[i] == suffixSum[i])
            return arr.get(i);

      return -1;
   }


   static void findSubSets(int [] arr){
      List<List<Integer>> result = new ArrayList<>();
      boolean [] visited = new boolean[arr.length];
      for(int i=0; i< arr.length; i++){
         if(!visited[i]){
            subsetDFSAlgo(arr, result, new ArrayList<Integer>(), i, visited);

         }
      }
      System.out.println(result);

   }

   private static void subsetDFSAlgo(int[] arr, List<List<Integer>> result, List<Integer> answer, int i, boolean[] visited) {

      if (i == arr.length || visited[i])
         return;

      answer.add(arr[i]);
      if(!visited[i]){
         visited[i] = true;
         List<Integer> temp = new ArrayList(answer);
         if(!result.contains(temp)){
            result.add(temp);
         }


         subsetDFSAlgo(arr, result, answer, i + 1, visited);
         answer.remove(answer.size() - 1);
         subsetDFSAlgo(arr, result, answer, i + 1, visited);


      }

      visited[i] = false;

   }
}
