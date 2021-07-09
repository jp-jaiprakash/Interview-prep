package lowleveldesigns.designpatterns.composite;

public class Room implements Istructure{

   public String name;

   public Room(String name) {
      this.name = name;
   }

   @Override
   public void enter() {
      System.out.println("You have entered "+ this.name);
   }

   @Override
   public void exit() {
      System.out.println("You have left "+ this.name);
   }

   @Override
   public void location() {
      System.out.println("You are Currently in the "+ this.name);
   }

   @Override
   public String getName() {
      return this.name;
   }
}
