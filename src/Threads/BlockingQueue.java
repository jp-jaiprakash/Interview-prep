package Threads;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {

   private List queue = new LinkedList();
   private int limit = 10;

   public BlockingQueue (int limit){
      this.limit = limit;
   }

   public synchronized void enqueue(Object item) throws InterruptedException {
      if(queue.size() == limit){
         wait();
      }

      this.queue.add(item);

      if(this.queue.size() == 1)
         notifyAll();

//      Collections.synchronizedMap()
   }

}
