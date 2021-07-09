package lowleveldesigns.designpatterns.composite;

import java.util.ArrayList;

public class Housing implements Istructure{

   private ArrayList<Istructure> structures;
   private String address;

   public Housing(String address){
      this.structures = new ArrayList<>();
      this.address = address;
   }

   public int addStructure(Istructure component){
      this.structures.add(component);
      return this.structures.size() - 1;
   }

   public Istructure getStructure(int componentNumber){
      return this.structures.get(componentNumber);
   }
   @Override
   public void enter() {

   }

   @Override
   public void exit() {

   }

   @Override
   public void location() {
      System.out.println("You are currently in "+ this.getName()+ " . It has ");
      for(Istructure struct: this.structures){
         System.out.println(struct.getName());
      }
   }

   @Override
   public String getName() {
      return this.address;
   }
}
