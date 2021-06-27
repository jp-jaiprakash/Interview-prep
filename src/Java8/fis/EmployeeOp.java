package Java8.fis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeOp {

//   public boolean checkAge = (age) -> { age > 22};

   public static void main(String[] args) {
      Employee e1 = new Employee("jai", 15, "b");
      Employee e2 = new Employee("abhi", 21, "d");
      Employee e3 = new Employee("jackie", 15, "f");
      Employee e4 = new Employee("g", 78, "h");

      List<Employee> lst = new ArrayList<>();
      lst.add(e1);
      lst.add(e2);
      lst.add(e3);lst.add(e4);

//      lst = lst.stream().filter(getEmployeePredicate()).collect(Collectors.toList());
//      System.out.println(lst);
//
      lst.stream()
              .map(getEmployeeStringFunction())
              .forEach(getStringConsumer());

      lst = lst.stream()
              .sorted(getEmployeeComparator().thenComparing(getNameComparator()))
              .collect(Collectors.toList());
      System.out.println(lst);
   }

   private static Consumer<String> getStringConsumer() {
      return e6 -> System.out.println(e6);
   }

   private static Function<Employee, String> getEmployeeStringFunction() {
      return e5 -> e5.getFirstName().toUpperCase();
   }

   private static Comparator<Employee> getEmployeeComparator() {
      return Comparator.comparingInt(Employee::getAge);
   }

   private static Comparator<Employee> getNameComparator(){
      return (emp1, emp2) -> emp1.getFirstName().equalsIgnoreCase(emp2.getFirstName())  ? -1 : 1;
   }
   private static Predicate<Employee> getEmployeePredicate() {
      return x -> x.getAge() > 22;
   }
}
