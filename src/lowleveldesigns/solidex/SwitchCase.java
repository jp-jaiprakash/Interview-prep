package lowleveldesigns.solidex;

public class SwitchCase {

   /**
    * If we have another requirement then we can add one more switch case which may end up breaking old conditions
    * So better think about "I" of SOLID
    * @param a
    * @param b
    * @param operation
    * @return
    */

   public double calculate(int a, int b, String operation){

      switch (operation){
         case "+": {
            return a + b;
         }
         case "-": {
            return a - b;
         }
         default:
            return 0;
      }

   }
}
