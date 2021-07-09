package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {

   public static void main(String[] args) {
      Salary sal1= new Salary("A", "Year", 100);
      Salary sal2= new Salary("B", "Year", 200);
      Salary sal3= new Salary("A", "Monthly", 300);
      Salary sal4= new Salary("B", "Year", 400);
      Salary sal5= new Salary("A", "Monthly", 500);


      List<Salary> lst = new ArrayList<>();

      lst.add(sal1);
      lst.add(sal2);
      lst.add(sal3);
      lst.add(sal4);
      lst.add(sal5);

      Iterator<Salary> it = lst.listIterator();

//      while (it.hasNext()){
//         Salary temp = it.next();;
//         System.out.println(temp.getAmount());
//         if (temp.getAmount()==200)
//            it.remove();
//      }

      while (it.hasNext()){
         Salary temp = it.next();
         if (temp.getAmount()==200)
            lst.remove(temp);
      }

//      for(int i=0; i<lst.size();i++)
//      {
//       Salary temp = lst.get(i);
//       if(temp.getAmount()==200)
//          lst.remove(temp);
//      }

      System.out.println(lst);
   }


}
