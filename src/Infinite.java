import java.util.LinkedList;
import java.util.Queue;

public class Infinite {

   public static void main(String[] args) {
      genera();
   }

   private static void genera(){
      Queue<String> queue = new LinkedList<>();
      queue.add("0");
      queue.add("1");
      int count = 7;
      while (count > 0){
         String peek = queue.poll();
         System.out.println(peek);
         queue.add(peek+"0");
         queue.add(peek+"1");
         count--;
      }
   }
}
