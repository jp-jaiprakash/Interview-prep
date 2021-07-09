package lowleveldesigns.designpatterns.factorymethod.afterfactory;

public abstract class Knife {
   public abstract void sharpen();

   public abstract void polish();

   public abstract void packing();
}

/**
 * A factory is generally a method or object that allows you to create other objects.
 * Remember that the act of object creation, usually with the new keyword in Java is
 * called concrete instantiation. Factories allow client code to operate on generalizations.
 * This is called coding to an interface, not an implementation. As long as the client code
 * receives the object it expects, a knife in our example, it can satisfy its responsibilities
 * without worrying about the details of object creation. A factory object may be a useful tool.
 * It is an object that creates other objects. It can be useful if many parts of the software want to
 * create the same objects. You can even create specialized factories by having sub-classes of
 * the factory class. The factory method pattern is a little bit different. Instead of
 * using another object to create objects, we separate out object creation into another method,
 * a factory method. Now instead of working with the factory object, we specialize or subclass
 * the class that uses the factory method. Each subclass must define its own factory method.
 * We say that we are letting the sub-classes decide how objects are made. By separating the actual
 * object creation from other behavior using factories, the code becomes cleaner to read and easier
 * to maintain or change. The client code is simplified and the details of object creation are moved
 * into the factories. The code becomes more extensible, and harnesses the power of object oriented
 * design principles, such as inheritance, to allow you to specialize your object creation.
 */