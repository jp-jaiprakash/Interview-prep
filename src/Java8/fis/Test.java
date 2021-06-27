package Java8.fis;

@FunctionalInterface
public interface Test {

   default void show(){
      System.out.println("");
   }

   void eat();


   default void drink(){
      System.out.println("Drink");
   }

   static void sleep(){
      System.out.println("sleep");
   }

   static void sleep2(){
      System.out.println("sleep2");
   }
}
