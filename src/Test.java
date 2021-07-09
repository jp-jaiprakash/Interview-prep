

public class Test {
   public static void main(String[] args) {
//      System.out.println((char) ('A' + 2));
      char s = (char)('A' + 2);
      String t = String.valueOf(s);
      System.out.println(String.valueOf(s));

      String y= "A       .-";
      String d[] = y.split("\\s+");
      for(String g: d){
         System.out.println(g);
      }
      String [] j = d[1].split("");
      for(String g: j){
         System.out.println(g);
      }
   }

}