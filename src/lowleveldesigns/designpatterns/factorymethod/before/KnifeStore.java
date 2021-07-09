package lowleveldesigns.designpatterns.factorymethod.before;

public class KnifeStore {

   // As type increases so is our if else
   Knife orderKnife(String knifeType){
      Knife knife = null;
      if("steak".equalsIgnoreCase(knifeType))
         knife = new SteakKnife(); // concrete instantiation
      else if("chefs".equalsIgnoreCase(knifeType))
         knife = new ChefKnife();
      else if("bread".equalsIgnoreCase(knifeType))
         knife = new BreadKnife();
      else if("paring".equalsIgnoreCase(knifeType))
         knife = new ParingKnife();

      
      //prepare the knife
      knife.sharpen();
      knife.polish();
      knife.packing();

      return knife;
   }
}
