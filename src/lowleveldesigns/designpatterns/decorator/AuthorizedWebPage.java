package lowleveldesigns.designpatterns.decorator;

public class AuthorizedWebPage extends WebPageDecorator{

   public AuthorizedWebPage(WebPage decoratedPage) {
      super(decoratedPage);
   }

   public void authorizingUser(){
      System.out.println("Authorizing User");
   }
   @Override
   public void display() {
      super.display();
      this.authorizingUser();
   }
}
