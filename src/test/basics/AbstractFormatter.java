package test.basics;

import java.text.SimpleDateFormat;

// a Formatter interchanges text and other representations of data.
// Formatters can also validate whether given text can represent some data.
abstract class AbstractFormatter {
   
  protected Object Data;
  protected SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy"); /* "Tue, 31 Jan 2017" */
 
  // turns an instance of class into text
  public abstract String format(Object object);
   
  // turns text into an instance of a class
  public abstract <T> T parse(String text);
   
  // says if text is a valid representation of an object
  public abstract boolean isValid(String text);
   
}