package CollectionsEx;

import java.util.ArrayList;

public class HomoHetro {

   public static void main(String[] args) {

      Employee e = new Employee();


   }

   public void testHomoHetro(){
      Person p[] = new Person[2];

      p[0]= new Person();
      p[1] = new Employee();

      ArrayList list = new ArrayList<String>();
      list.add("a");
      list.add(1);    // OK
      list.add(new Object());
   }
}
