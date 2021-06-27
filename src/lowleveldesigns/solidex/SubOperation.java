package lowleveldesigns.solidex;

public class SubOperation implements IOperation{
   @Override
   public double calculate(int a, int b) {
      return a-b;
   }
}
