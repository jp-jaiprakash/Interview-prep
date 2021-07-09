package lowleveldesigns.filereadingthreads;

import java.util.concurrent.locks.ReentrantLock;

public class UseOfReentantLock {

   private static ReentrantLock lock = new ReentrantLock();

   private static void accessResource(){
      lock.lock();

      // access the resource

      lock.unlock();

   }

   /**
    *
    * similarity to sync keyword
    * private void accessResource(){
    *    synchronized (this) { <---- lock.lock()
    *
    *    } <--- lock.unlock()
    * }
    *
    * locks are explicit
    * locks allow locking/unlocking in any scopes in any order
    * locks have extra feature like trylock and trylockwithtimeout
    *
    */

   public static void main(String[] args) {
      Thread t1 = new Thread( () -> accessResource());
      t1.start();

      Thread t2 = new Thread( () -> accessResource());
      t2.start();
   }
}
