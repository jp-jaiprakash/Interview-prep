package lowleveldesigns.designpatterns.decorator;

/**
 * Step 3: Implement the interface with your abstract decorator class
 *
 */
public abstract class WebPageDecorator implements WebPage {

   protected WebPage page;

   public WebPageDecorator(WebPage webpage){
      this.page = webpage;
   }

   public void display(){
      this.page.display();;
   }

//   protected  void authenticatingUser(){
//      System.out.println("Authenticating User");
//   }
}
