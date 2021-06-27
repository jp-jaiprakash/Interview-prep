package test.basics;

import java.util.Date;

class Formatter {
  public static DateFormatter DateFormatter = (DateFormatter) FormatterFactory.INSTANCE.getFormatter(FormatterType.DATE); // var name
 
  public static void main(String[] args) {
    System.out.println("isValid(\"Wed, 4 Jul 2001\"): " + DateFormatter.isValid("Wed, 4 Jul 2001"));
    System.out.println("isValid(\"foo\"): " + DateFormatter.isValid("foo"));
    System.out.println("format(new Date()): " + DateFormatter.format(new Date()));
    System.out.println("parse(\"Wed, 4 Jul 2001\"): " + DateFormatter.parse("Wed, 4 Jul 2001"));
  }
}