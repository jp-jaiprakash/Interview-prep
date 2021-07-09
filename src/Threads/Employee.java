package Threads;

public class Employee {

   private String name;
   private int id;

   public Employee(String name, int id){
      this.name = name;
      this.id =id;
   }

   @Override
   public int hashCode(){
      return 1;
   }

   @Override
   public boolean equals(Object o) {
//      if (this == o) return true;
//      if (o == null || getClass() != o.getClass()) return false;
//      Employee employee = (Employee) o;
//      return id == employee.id && Objects.equals(name, employee.name);
      return true;
   }

   @Override
   public String toString() {
      return "Employee{" +
              "name='" + name + '\'' +
              ", id=" + id +
              '}';
   }
}
