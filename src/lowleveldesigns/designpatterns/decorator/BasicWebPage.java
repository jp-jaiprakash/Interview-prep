package lowleveldesigns.designpatterns.decorator;

/**
 * Step 2: Implement the interface with your base concrete component class
 *
 */
public class BasicWebPage implements WebPage {
   private String html ="";
   private String styleSheets ="";
   private String scripts ="";
   @Override
   public void display() {
      System.out.println("Basic web page");
   }
}
