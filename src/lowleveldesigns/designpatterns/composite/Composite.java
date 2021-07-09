package lowleveldesigns.designpatterns.composite;

public class Composite {
   public static void main(String[] args) {
      Housing building = new Housing("Aparna");
      Housing floor1 = new Housing("Aparna - First floor");
      int firstFloor = building.addStructure(floor1);

      Room washroom1m = new Room("1F Men's Washroom");
      Room washroom1w = new Room("1F Women's Washroom");
      Room common1 = new Room("1F Common Area");

      int firstmens = floor1.addStructure(washroom1m);
      int firstwomen = floor1.addStructure(washroom1w);
      int firstCommon = floor1.addStructure(common1);

      building.enter();
       Housing currentfloor = (Housing) building.getStructure(firstFloor);
       currentfloor.enter();

       Room currentRoom = (Room) currentfloor.getStructure(firstmens);


   }
}

/**
 * Recursive Composition
 * The Composite Design pattern achieves two goals:
 *    To compose nested structure of objects and to deal with the classes with
 *    these objects uniformly
 *
 * Achieved by Polymorphism
 *
 * The Composite class is used to aggregate any class that implements the component interface
 *
 * The composite class will allow you to traverse through and potentially manipulate the component
 * objects that composite object contains
 * Leaf class contains non-composite type
 *
 * We want to deal with non-composite and composite class uniformly
 *
 * By having the leaf class and composite class implement the component interface, we unify them with
 * single type
 *
 * Easiest way is ti visualise it as tree
 *
 * How Buildings are composed of generic housing structures
 *
 * Istructure (Component Interface)
 * enter
 * exit
 * location
 * getName()
 *
 * above can be used to describe either building, floor, room
 *
 * Building can be represented usig Housing Interface
 *
 */