package lowleveldesigns.designpatterns.templatemethod;

public abstract class PastaDish {

   /**
    * This final is important as this will make sure that
    * each pasta cannot have its own receipe
    */
   public final void makeReceipe(){
      boilWater();
      addPasta();
      cookPasta();
      drainAndPlate();
      addSauce();
      addProtein();
      addGarnish();
   }

   protected abstract void addPasta();
   protected abstract void addSauce();
   protected abstract void addProtein();
   protected abstract void addGarnish();

   private void boilWater(){

   }

   private void cookPasta(){

   }

   private void drainAndPlate(){

   }
}
