package lowleveldesigns.designpatterns.state;

public class IdleState implements State{
   @Override
   public void insertDollar(VendingMachine vendingMachine) {
      System.out.println("Dollar Inserted");

      vendingMachine.setCurrentState(vendingMachine.getHasOneDollarState());
   }

   @Override
   public void ejectMoney(VendingMachine vendingMachine) {
      System.out.println(" No Money to eject");
   }

   @Override
   public void dispense(VendingMachine vendingMachine) {
      System.out.println("Payment required");
   }
}
