package threadsExamples.executorservices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OptimalThreadPoolSize {
   public static void main(String[] args) {

      int coreCount = Runtime.getRuntime().availableProcessors();
      ExecutorService service = Executors.newFixedThreadPool(coreCount);

      // submit the task for execution
      for(int i=0; i< 10; i++){
         service.execute(new CpuIntensiveTask());
      }

   }

   static class CpuIntensiveTask implements Runnable {

      @Override
      public void run() {
         // some CPU instensive work
      }
   }
}
