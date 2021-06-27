package lowleveldesigns.solidex;

public class AddOperation implements IOperation{

   @Override
   public double calculate(int a, int b) {
      return a + b;
   }
}
