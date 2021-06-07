package test;

public  class C implements  A{


   public static void main(String[] args) {

      A a = () -> {
         System.out.println("Helo");
      };

      a.display();
   }

   @Override
   public void display3() {

   }
}
