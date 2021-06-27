package Java8.fis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 implements Test{
   @Override
   public void eat() {

   }

   public static void main(String[] args) {
//      System.out.println(Test::sleep);

      List<String> lst = new ArrayList<>();

      List<String> ls = lst.stream().filter(x->x.equalsIgnoreCase("ja")).collect(Collectors.toList());

      System.out.println(ls);
   }
}
