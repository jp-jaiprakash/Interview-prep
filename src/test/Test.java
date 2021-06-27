package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

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
//Object o = new Object();
//      Set s= new TreeSet();
//      s.add("oll");
//      s.add(1);

//      TreeSet ts = new TreeSet();
//      ts.add("o");
//      ts.add(o);

//      Iterator i = s.iterator();
//      while (i.hasNext())
//         System.out.println(i.next());
//      List lst1 = new ArrayList<>();
//
//      Test t = new Test();
//      Test t2 = new Test();
//
//      lst1.add(t);
//      lst1.add(t2);

      HashMap t = new HashMap();
      t.put(null,1);
      System.out.println(t.keySet());

      String s = "jai";
      StringBuilder s
      s.reverse();
      Collection sorted = new LinkedList();
      sorted.add("A");
      sorted.add("o");

      List l = new ArrayList<>()
              ;
      l.add(1);
      l.add(2);
      l.add(3);
      l.add(5);

      l.add(4);
//      Collections.sort(l);
      System.out.println(Collections.binarySearch(l,4));
      for(Object u: sorted)
         System.out.println(u);

//      Collections.sort(lst1);
//
//      for(int i=0; i< 2; i++)
//         System.out.println(lst1.get(i));

   }
}
