package lowleveldesigns.designpatterns.decorator;

public class Decorator {

   public static void main(String[] args) {
      WebPage myPage = new BasicWebPage();
      myPage = new AuthorizedWebPage(myPage);
      myPage  = new AuthenticatedWebPage(myPage);

      myPage.display();
   }

}

/**
 *
 * Uses aggregation to combine behaviour at runtime
 *
 * Aggregation => Has a or weak containment
 * The actual structure of this design pattern makes use of both interfaces and inheritance so that the classes conform to a common type, whose instances can be
 * stacked up in a compatible way to build up a coherent combination of behavior overal
 *
 */