package lowleveldesigns.designpatterns.state;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class VendingMachine {

   private State currentState;
   private State idleState;
   private State hasOneDollarState;
   private State outOfStockState;

   private int count;

   public VendingMachine(int count){
      idleState = new IdleState();
      hasOneDollarState = new HasOneDollarState();
      outOfStockState = new OutOfStockState();

      if(count > 0){
         currentState = idleState;
         this.count = count;
      }else {
         currentState = outOfStockState;
         this.count = 0;
      }
   }

   public void insertDollar(){
      currentState.insertDollar(this);
   }

   public void ejectMoney(){
      currentState.ejectMoney(this);
   }

   public void dispense(){
      currentState.dispense(this);
   }

   public void doReturnMoney() {
   }

   public void doReleaseProduct() {
   }
}
