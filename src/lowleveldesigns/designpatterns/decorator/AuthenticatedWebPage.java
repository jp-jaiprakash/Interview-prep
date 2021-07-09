package lowleveldesigns.designpatterns.decorator;

/**
 * Step 4: Inherit from the abstract decorator and implement
 * the component interface with concrete decorator classes
 *
 * In order to recursively call the display behavior, concrete decorator
 * invoke the superclass display method
 *
 * The call to super.display will cause the next web page in the stack to
 * execute its version of display until you get the basic web page
 *
 */
public class AuthenticatedWebPage extends WebPageDecorator{
   public AuthenticatedWebPage(WebPage webPage) {
      super(webPage);
   }

   public void authenticateUser(){
      System.out.println("Authenticating User");
   }

   @Override
   public void display(){
      super.display();
      this.authenticateUser();
   }
}
