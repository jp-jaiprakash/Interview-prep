package threadsExamples.executorservices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * We can create 10 threads using thread pool
 * or create an executor service of size 5 and submit threads to it
 */

public class UseOfThreadPool {

   public static void main(String[] args) {

      ExecutorService service = Executors.newFixedThreadPool(3);


      // Now if we want to run 10 tasks and hence create 10 threads
      for(int i=0; i< 10; i++){
         service.execute(new SingleThread.Task());
      }
   }


}
