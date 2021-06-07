package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Test {

   public static void main(String[] args) {
//      System.out.println(String.format("https://%s", "jai"+ "prakash"));
//      Comparator<String> c = String::compareTo;
//      String contextPath = "";
//      if (contextPath.length() > 0) {
//         contextPath = String.format("/", contextPath);
//      }
//
//      System.out.println(contextPath);
//
//      List<Employee> lst = new ArrayList();
//      lst.add(new Employee(1,"a"));
//      lst.add(new Employee(2,"b"));
//      lst.add(new Employee(3,"c"));
//      lst.add(new Employee(4,"d"));
//
//      Collections.sort(lst, new NameCompare());

      List<String> lst1 = new ArrayList<>();
      lst1.add("jai");
      lst1.add("om");
      lst1.add("jagdish");

      lst1.stream().filter(x->x.startsWith("j")).map(x->x.toUpperCase()).forEach(x-> System.out.println(x));


      List<String> lst2 = lst1.stream().filter(x->x.startsWith("j")).map(String::toUpperCase).collect(Collectors.toList());
      System.out.println(lst2);

      Float f = new Float("A");
      System.out.println(f.intValue() + f.byteValue() + f.doubleValue());
   }
}
