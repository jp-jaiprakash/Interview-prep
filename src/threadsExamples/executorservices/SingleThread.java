package threadsExamples.executorservices;


public class SingleThread {

   public static void main(String[] args) {
      Thread thread1 = new Thread(new Task());
      thread1.start();
      System.out.println("Thread Name: "+ Thread.currentThread().getName());


      // Now if we want to run 10 tasks and hence create 10 threads
      for(int i=0; i< 10; i++){
         Thread thread = new Thread(new Task());
         thread.start();
      }
   }

   static class Task implements Runnable{

      @Override
      public void run() {
         System.out.println("Thread Name: "+ Thread.currentThread().getName());
      }
   }

}
