package random;

import java.util.Arrays;

public class ReverseString {
   public static void main(String[] args) {
      String str = "do coding from geeksforgeeks";
      System.out.println(reverse(str));
   }

   static String reverse(String str){
      String [] arr = str.split(" ");
      StringBuilder sb = new StringBuilder();
      for(String s: arr){
         sb.append(rev(s)+" ");
      }
     return sb.toString().trim();
   }


   static String rev(String str){
StringBuilder stringBuilder = new StringBuilder();
      for(int j= str.length()-1; j>=0;  j--){
         stringBuilder.append(str.charAt(j));
      }

      return stringBuilder.toString();
   }
}
