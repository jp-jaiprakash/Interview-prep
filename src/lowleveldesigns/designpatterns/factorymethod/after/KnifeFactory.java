package lowleveldesigns.designpatterns.factorymethod.after;

import lowleveldesigns.designpatterns.factorymethod.before.BreadKnife;
import lowleveldesigns.designpatterns.factorymethod.before.ChefKnife;
import lowleveldesigns.designpatterns.factorymethod.before.Knife;
import lowleveldesigns.designpatterns.factorymethod.before.ParingKnife;
import lowleveldesigns.designpatterns.factorymethod.before.SteakKnife;


//In general, a factory object is instance of KnifeFactory. This can be used by KnifeStore class
// So knifestore is a client of knifefactory

public class KnifeFactory {

   public Knife createKnife(String knifeType){

         Knife knife = null;
         if("steak".equalsIgnoreCase(knifeType))
            knife = new SteakKnife(); // concrete instantiation
         else if("chefs".equalsIgnoreCase(knifeType))
            knife = new ChefKnife();
         else if("bread".equalsIgnoreCase(knifeType))
            knife = new BreadKnife();
         else if("paring".equalsIgnoreCase(knifeType))
            knife = new ParingKnife();

         return knife;
   }
}
