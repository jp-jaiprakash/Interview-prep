package lowleveldesigns.designpatterns.factorymethod.after;

import lowleveldesigns.designpatterns.factorymethod.before.Knife;

public class KnifeStore {

   private KnifeFactory factory;

   //require a KnifeFactory object to be passed to this constructor
   public KnifeStore(KnifeFactory factory){
      this.factory = factory;
   }

   Knife orderKnife(String knifeType) {
      Knife knife = factory.createKnife(knifeType);

      knife.sharpen();
      knife.polish();
      knife.packing();

      return knife;
   }

}

/**
 * Factory Method::
 *    The Factory Method design intent is to define an interface for creating objects, but let the subclass decide
 *    which class to intantiate
 */