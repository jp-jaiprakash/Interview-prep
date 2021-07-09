package lowleveldesigns.designpatterns.factorymethod.afterfactory;


//As this is an abstract class so we cannot instantiate it
// intsead we need subclasses of this such as budgetKnifeStore, qualityknifestore
// We want Factory Method to be defined by the subclass

public abstract class KnifeStore {

   Knife orderKnife(String knifeType) {
      Knife knife = createKnife(knifeType);

      knife.sharpen();
      knife.polish();
      knife.packing();

      return knife;
   }

   protected abstract Knife createKnife(String knifeType);
}
