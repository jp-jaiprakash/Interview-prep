package threadsExamples;

public class BowlingStatsThread implements Runnable{
   @Override
   public void run() {
      for(int i=0; i< 1000; i++)
         System.out.println("Running Bowling stats ");
   }
}
