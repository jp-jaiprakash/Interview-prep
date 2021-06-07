package onetwoweek.queue;

public class Test {
   public static void main(String[] args) {
      QueueUsingLL queueUsingLL = new QueueUsingLL();

      queueUsingLL.enQueue(5);
      queueUsingLL.enQueue(9);
      System.out.println(queueUsingLL.deQueue());
      System.out.println(queueUsingLL.deQueue());
      System.out.println(queueUsingLL.deQueue());
      System.out.println(queueUsingLL.deQueue());
      queueUsingLL.enQueue(19);
      System.out.println(queueUsingLL.deQueue());
      System.out.println(queueUsingLL.deQueue());
      queueUsingLL.enQueue(90);
      System.out.println(queueUsingLL.deQueue());
   }
}
