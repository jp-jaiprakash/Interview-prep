package threadsExamples;

public class Example {

   public static void main(String[] args) {

      //Extending thread
      BattingStatsThread battingStatsThread = new BattingStatsThread();
      battingStatsThread.start();

      //Implementing Runnable
      BowlingStatsThread bowlingStatsThread = new BowlingStatsThread();
      Thread bowling = new Thread(bowlingStatsThread);
      bowling.start();

   }
}
