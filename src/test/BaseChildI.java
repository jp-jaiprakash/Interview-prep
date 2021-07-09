package test;

public class BaseChildI extends Base{

   public BaseChildI(){
      super(5);
      System.out.println("This is Base Child I ***");
   }

   public BaseChildI(int a){
      super(a);
      System.out.println("This is Base Child I with int");
   }

   public static void main(String[] args) {
BaseChildI b = new BaseChildI(2);
   }
}
