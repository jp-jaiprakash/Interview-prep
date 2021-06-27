package Java8.fis;

public class Employee {

   private String firstName;
   private int age;
   private String lastName;

   public Employee() {
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public Employee(String firstName, int age, String lastName) {
      this.firstName = firstName;
      this.age = age;
      this.lastName = lastName;
   }

   @Override
   public String toString() {
      return "Employee{" +
              "firstName='" + firstName + '\'' +
              ", age=" + age +
              ", lastName='" + lastName + '\'' +
              '}';
   }
}
