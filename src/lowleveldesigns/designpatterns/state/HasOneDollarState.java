package lowleveldesigns.designpatterns.state;

public class HasOneDollarState implements State{
   @Override
   public void insertDollar(VendingMachine vendingMachine) {
      System.out.println("already has one dollar");
      vendingMachine.doReturnMoney();
      vendingMachine.setCurrentState(vendingMachine.getIdleState());
   }

   @Override
   public void ejectMoney(VendingMachine vendingMachine) {
      System.out.println("Returning moeny");
      vendingMachine.doReturnMoney();
      vendingMachine.setCurrentState(vendingMachine.getIdleState());
   }

   @Override
   public void dispense(VendingMachine vendingMachine) {
      System.out.println("Releasing product");

      if(vendingMachine.getCount() > 0){
         vendingMachine.doReleaseProduct();
         vendingMachine.setCurrentState(vendingMachine.getIdleState());
      }else{
         vendingMachine.doReleaseProduct();
         vendingMachine.setCurrentState(vendingMachine.getOutOfStockState());
      }
   }
}
