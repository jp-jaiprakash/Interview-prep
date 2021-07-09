package Threads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DeadlockDemo {

   public static void main(String[] args) {
      final Object resource1 = "This is resource 1";
      final Object resource2 = "This is resource 2";

      String s1 = new String("jai");
      String s2 = new String("jai");
      String s3 = "jai";

      Set<String> set = new HashSet<>();
      set.add(s1);
      set.add(s2);
      set.add(s3);

      Map<Employee, Integer> map = new HashMap<>();

      Employee e1= new Employee("jai", 1);
      Employee e2= new Employee("jai", 2);
      Employee e3= new Employee("jai", 1);

      map.put(e1,100);
      System.out.println(map);
      map.put(e2,200);
      System.out.println(map);
      map.put(e3,300);
      System.out.println(map);

      System.out.println(map.size());

      System.out.println("e3:" + map.get(e3));
      System.out.println("e2:" + map.get(e2));
      System.out.println("e1:" + map.get(e1));

//      System.out.println(map.entrySet());
//      for(Map.Entry<Employee, Integer> entry: map.entrySet()){
//         System.out.println(entry.getKey().toString() + " ::" + entry.getValue());
//      }
//      System.out.println(set.size());

//      Thread t1 = new Thread(){
//
//         public void run(){
//            synchronized (resource2){
//               System.out.println("Thread 1: locked resource 1");
//
//               try{
//                  Thread.sleep(1000);
//               }catch (Exception e){
//
//               }
//
//               synchronized (resource1){
//                  System.out.println("Thread 1: locked resource 2");
//               }
//            }
//         }
//      };
//
//      Thread t2 = new Thread(){
//
//         public void run(){
//            synchronized (resource1){
//               System.out.println("Thread 2: locked resource 2");
//
//               try{
//                  Thread.sleep(1000);
//               }catch (Exception e){
//
//               }
//
//               synchronized (resource2){
//                  System.out.println("Thread 2: locked resource 1");
//               }
//            }
//         }
//      };
//
//      t1.start();
//      t2.start();
   }

}
