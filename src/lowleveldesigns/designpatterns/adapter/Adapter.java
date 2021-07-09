package lowleveldesigns.designpatterns.adapter;

public class Adapter {

   public static void main(String[] args) {
      CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(new OldCoffeeMachine());

      adapter.chooseFirstSelection();
   }
}

/**
 * The adapter essentially encapsulates the adaptee and presents a new interface, or appearance, to the client class.
 * It does this by wrapping the adaptee's interface and exposing a new target interface that makes sense
 * to the client
 */