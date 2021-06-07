package Strings;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class NewStringBuilder {

   private int capacity = 16;

   int count;

   char[] value;

   public NewStringBuilder() {

   }

   public NewStringBuilder(String string) {
      this.capacity = string.length() + capacity;
      value = new char[this.capacity];
      append(string);
   }

   public NewStringBuilder append(String string) {
      if (string != null) {
         int len = string.length();
         ensureCapacityInternal(count + len);
         string.getChars(0, len, value, count);
         count += len;

      }
      return this;
   }

   private void ensureCapacityInternal(int minimumCapacity) {

      if (minimumCapacity - value.length > 0) {
         value = Arrays.copyOf(value, newCapacity(minimumCapacity));
      }
   }

   private int newCapacity(int minCapacity) {
      int newCapacity = (value.length << 1) + 2;

      if (newCapacity - minCapacity < 0) {
         newCapacity = minCapacity;
      }

      return (newCapacity <= 0 || MAX_ARRAY_SIZE - newCapacity < 0)
              ? hugeCapacity(minCapacity)
              : newCapacity;
   }

   private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

   private int hugeCapacity(int minCapacity) {
      if (Integer.MAX_VALUE - minCapacity < 0) {
//         throw new Exception();
         System.out.println("Exception");
      }

      return (minCapacity > MAX_ARRAY_SIZE) ? minCapacity : MAX_ARRAY_SIZE;
   }

   public String toString(){
      return new String(value, 0, count );
   }
}
