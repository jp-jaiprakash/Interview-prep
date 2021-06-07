package threadsExamples;

public class BattingStatsThread extends Thread{

   public void run(){
      for(int i=0; i< 1000; i++)
         System.out.println("Running Batting stats ");
   }
}
