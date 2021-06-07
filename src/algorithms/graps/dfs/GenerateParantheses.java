package algorithms.graps.dfs;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {

   public List<String> generateParanthesis(int n){
      List<String> list = new ArrayList<>();
      generateOneByOne("", list, n, n);
      return list;
   }

   private void generateOneByOne(String sublist, List<String> list, int left, int right) {
      if(left > right)
         return;

      if(left > 0){
         generateOneByOne(sublist+"(", list, left-1, right);
      }

      if(right > 0){
         generateOneByOne(sublist+")", list, left, right-1);
      }

      if(left ==0 && right==0){
         list.add(sublist);
         return;
      }
   }

   public static void main(String[] args) {
      GenerateParantheses gp = new GenerateParantheses();
      List<String> lst = gp.generateParanthesis(3);
      System.out.println(lst);
   }


}
