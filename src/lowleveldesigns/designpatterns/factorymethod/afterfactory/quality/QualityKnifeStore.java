package lowleveldesigns.designpatterns.factorymethod.afterfactory.quality;

import lowleveldesigns.designpatterns.factorymethod.afterfactory.Knife;
import lowleveldesigns.designpatterns.factorymethod.afterfactory.KnifeStore;

public class QualityKnifeStore extends KnifeStore {
   @Override
   protected Knife createKnife(String knifeType) {
      if(knifeType.equals("chefs"))
         return new QualityChefKnife();
      else if(knifeType.equals("paring"))
         return new QualityParingKnife();
      return null;
   }
}
