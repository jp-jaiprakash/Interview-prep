package Java8.fis;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BasicPrograms {

   public static Predicate<Integer> testOdd = (e) -> e%2 ==0;

   public static Consumer<Integer> printNum = (en) -> System.out.println(en);

   public static Function<Integer, Integer> increment = (a) -> {return a+2;};

   public static void main(String[] args) {
      List<Integer> lst = new ArrayList<>();
      lst.add(2);
      lst.add(12);
      lst.add(22);lst.add(1);lst.add(5);lst.add(55);lst.add(92);
      lst.add(24);
      lst.add(28);
      lst.add(29);

//      increment.andThen()

      lst.stream().filter(testOdd)
              .map(increment)
              .forEach(printNum);

//      lst = lst.stream().filter(testOdd).collect(Collectors.toList());
//      System.out.println(lst);
   }
}
