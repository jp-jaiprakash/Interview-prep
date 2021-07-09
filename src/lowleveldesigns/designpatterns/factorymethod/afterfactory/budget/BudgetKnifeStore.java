package lowleveldesigns.designpatterns.factorymethod.afterfactory.budget;

import lowleveldesigns.designpatterns.factorymethod.afterfactory.Knife;
import lowleveldesigns.designpatterns.factorymethod.afterfactory.KnifeStore;

public class BudgetKnifeStore extends KnifeStore {
   @Override
   protected Knife createKnife(String knifeType) {
      if(knifeType.equals("steak"))
         return new BudgetSteakKnife();
      else if(knifeType.equals("chefs"))
         return new BudgetChefKnife();
      else
         return null;
   }
}

/**
 * We can sub class Knifestore further into BudgetKnifestore, qualityknifestore, familyknifestore
 * all these inherit the orderknife method but need to implement their own createKnife
 *
 * So UML diagram should be
 * Knife - abstract class
 * KnifeStore - abstract class
 *
 * once we make the above as abstract then we cannot create objects directly
 *
 * The createKnife method is also abstract in knifeStore. This means that any subclass of knifeStore must define this method. So BudgetKnifeStore and any other knifeStore subclass we defined must have its own createKnife method. This is the core of the factory method design pattern.
 * The factory method pattern always follows the same general structure.
 */
