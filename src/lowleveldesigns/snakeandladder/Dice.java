package lowleveldesigns.snakeandladder;

public class Dice {

   private int noOfDices;

   public Dice(int noOfDices){
      this.noOfDices = noOfDices;
   }

   public int getNoOfDices() {
      return noOfDices;
   }

   public void setNoOfDices(int noOfDices) {
      this.noOfDices = noOfDices;
   }

   public int roll(){
      return (int)(Math.random()*(6*noOfDices - 1*noOfDices) +1);
   }
}
